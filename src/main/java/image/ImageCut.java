package image;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

public class ImageCut {
    public static void main(String[] args) {
        try {
            File file = new File("./input/IMG_2729.JPG");
            int angle = Image.getRotateAngleForPhoto(file);
            System.out.println(angle);
            BufferedImage bimage = ImageIO.read(file);
            BufferedImage image = bimage;
            if (angle != 0) {
                image = Image.rotateImage(bimage, angle);
            }
            System.out.println("图像宽高:" + image.getWidth() + "," + image.getHeight());
            BufferedImage imgs[] = Image.cutImage(image, 3, 3);
            // 输出小图
            for (int i = 0; i < imgs.length; i++) {
                ImageIO.write(imgs[i], "jpg", new File("./output/1/cut_" + i + ".jpg"));
                BufferedImage imgs2[] = Image.cutImage(imgs[i], 3, 3);
                for (int j = 0; j < imgs2.length; j++) {
                    ImageIO.write(imgs2[j], "jpg", new File("./output/2/cut_" + i + "_" + j + ".jpg"));
                    BufferedImage imgs3[] = Image.cutImage(imgs2[j], 3, 3);
                    for (int k = 0; k < imgs3.length; k++) {
//                        ImageIO.write(Image.zoomInImage(imgs3[k], 3.0D), "jpg", new File("./output/3/cut_" + i + "_" + j + "_" + k + ".jpg"));
                        ImageIO.write(imgs3[k], "jpg", new File("./output/3/cut_" + i + "_" + j + "_" + k + ".jpg"));
                    }
                }
            }

            System.out.println("完成分割！");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void mainx(String[] args) {
        try {
//            for(String str : ImageIO.getReaderFileSuffixes()) {
//                System.out.println(str);
//            }
            File file = new File("./input/IMG_2729.JPG");
            int angle = Image.getRotateAngleForPhoto(file);

//            Iterator<ImageReader> irs = ImageIO.getImageReaders(file);
            BufferedImage bimage = ImageIO.read(file);
            BufferedImage image = Image.rotateImage(bimage, angle);
            System.out.println("图像宽高:" + image.getWidth() + "," + image.getHeight());

            // 分割成3*3(9)个小图
            int rows = 3;
            int cols = 3;
            int chunks = rows * cols;
     
            // 计算每个小图的宽度和高度
            int chunkWidth = image.getWidth() / cols;
            int chunkHeight = image.getHeight() / rows;
     
            int count = 0;
            BufferedImage imgs[] = new BufferedImage[chunks];
            for (int x = 0; x < rows; x++) {
                for (int y = 0; y < cols; y++) {
                    //设置小图的大小和类型
                    imgs[count] = new BufferedImage(chunkWidth, chunkHeight, image.getType());
     
                    //写入图像内容
                    Graphics2D gr = imgs[count++].createGraphics();
                    gr.drawImage(image, 0, 0,
                            chunkWidth, chunkHeight,
                            chunkWidth* y, chunkHeight * x,
                            chunkWidth * y + chunkWidth,
                            chunkHeight * x + chunkHeight, null);
                    gr.dispose();
                }
            }
     
            // 输出小图
            for (int i = 0; i < imgs.length; i++) {
                ImageIO.write(imgs[i], "jpg", new File("./output/cut_" + i + ".jpg"));
            }
     
            System.out.println("完成分割！");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static InputStream mergeImage_1(String path,String name,String prefix) throws IOException {
        
        int rows = 3;
        int cols = 3;
        int chunks = rows * cols;
 
        int chunkWidth, chunkHeight;
        int type;
 
        //读入小图
        File[] imgFiles = new File[chunks];
        for (int i = 0; i < chunks; i++) {
            imgFiles[i] = new File(path+name +"_"+ i+"."+prefix);
        }
 
        //创建BufferedImage
        BufferedImage[] buffImages = new BufferedImage[chunks];
        for (int i = 0; i < chunks; i++) {
            buffImages[i] = ImageIO.read(imgFiles[i]);
        }
        type = buffImages[0].getType();
        chunkWidth = buffImages[0].getWidth();
        chunkHeight = buffImages[0].getHeight();
 
        //设置拼接后图的大小和类型
        BufferedImage finalImg = new BufferedImage(chunkWidth * cols, chunkHeight * rows, type);
 
        //写入图像内容
        int num = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                finalImg.createGraphics().drawImage(buffImages[num], chunkWidth * j, chunkHeight * i, null);
                num++;
            }
        }
 
        //输出拼接后的图像
        //ImageIO.write(finalImg, "jpeg", new File("d:\\img2\\finalImg.jpg"));
        //InputStream is=(InputStream) ImageIO.createImageInputStream(finalImg);
        finalImg.flush();
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        InputStream is=null;
        ImageOutputStream imOut;
        imOut = ImageIO.createImageOutputStream(bs);
        ImageIO.write(finalImg, prefix,imOut);
        is= new ByteArrayInputStream(bs.toByteArray());
        System.out.println("完成拼接！");
        return is;
    }   
}
