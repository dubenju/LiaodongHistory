package image;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("./辽东志/辽东河东城堡地方总图.jpg"));
            System.out.println("图像宽高:" + image.getWidth() + "," + image.getHeight());
            // 灰度化
            BufferedImage imageGray = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
            imageGray.getGraphics().drawImage(image, 0, 0, null);
            // 二值化
            BufferedImage imageBinary = new BufferedImage(imageGray.getWidth(), imageGray.getHeight(), BufferedImage.TYPE_BYTE_BINARY);
            imageBinary.getGraphics().drawImage(imageGray, 0, 0, null);
            // 白字黑底
            BufferedImage imageWrite = Image.negate(imageBinary);
            ImageIO.write(imageWrite, "jpeg", new File("./辽东志/辽东河东城堡地方总图n.jpg"));

            // 膨胀
            BufferedImage imageDilate = Image.dilate(imageWrite);
            ImageIO.write(imageDilate, "jpeg", new File("./辽东志/辽东河东城堡地方总图nd.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
