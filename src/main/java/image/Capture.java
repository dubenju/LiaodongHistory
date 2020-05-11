package image;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

public class Capture {

    public static void main(String[] args) throws Exception {
        // 获取屏幕尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // 创建需要截取的矩形区域
        Rectangle rect = new Rectangle(0, 0, screenSize.width, screenSize.height);

        // 截屏操作
        BufferedImage bufImage = new Robot().createScreenCapture(rect);
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS");
        // 保存截取的图片
        // ImageIO.write(bufImage, "PNG", new File("./output/" + format.format(new Date(System.currentTimeMillis())) + ".png"));
        ImageIO.write(bufImage, "jpg", new File("./output/" + format.format(new Date(System.currentTimeMillis())) + ".jpg"));
    }

}
