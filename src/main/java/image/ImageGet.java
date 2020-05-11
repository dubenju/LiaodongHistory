package image;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageGet {

    public static void main(String[] args) throws Exception {
        String[] fileNames = {
            "20200509_072750_199",
            "20200509_072801_697",
            "20200509_072822_813",
            "20200509_072836_069",
            "20200509_072851_512",
            "20200509_072858_999",
            "20200509_072905_098",
            "20200509_072911_734",
            "20200509_072916_693",
            "20200509_072922_048",
            "20200509_072929_707",
            "20200509_072938_468",
            "20200509_072943_518",
            "20200509_072951_275",
            "20200509_072957_922"
        };
        int layer = 1;
        for (String fileName : fileNames) {
            BufferedImage image = ImageIO.read(new File("./output/" + fileName +".png"));
            System.out.println("图像宽高:" + image.getWidth() + "," + image.getHeight());
    
//            // 1,74, 1760,1006
//            BufferedImage image1 = new BufferedImage(1760, 1006, BufferedImage.TYPE_INT_RGB);
//            image1.getGraphics().drawImage(image, -1, -74, null);
//            ImageIO.write(image1, "jpeg", new File("./output/" + fileName +"_a.jpg"));
            
            // 40.75, 1660，970
            BufferedImage image2 = new BufferedImage(1605, 1005, BufferedImage.TYPE_INT_RGB);
            image2.getGraphics().drawImage(image, -94, -74, null);
            ImageIO.write(image2, "jpeg", new File("./output/" + (layer < 9 ? "0" : "") + layer +"_b.jpg"));

            BufferedImage imgs2[] = Image.cutImage(image2, 3, 3);
            for (int j = 0; j < imgs2.length; j++) {
                ImageIO.write(imgs2[j], "jpg", new File("./output/" + (layer < 9 ? "0" : "") + layer + "_" + (j < 9 ? "0" : "") + j + ".jpg"));
            }
            layer ++;
        }
    }
}
