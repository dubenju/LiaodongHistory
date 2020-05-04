package image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Image {
    private static BufferedImage createCompatibleDestImage(BufferedImage src, ColorModel dstCM) {
        if ( dstCM == null ) {
            dstCM = src.getColorModel();
        }
        return new BufferedImage(dstCM, dstCM.createCompatibleWritableRaster(src.getWidth(), src.getHeight()), dstCM.isAlphaPremultiplied(), null);
    }
    public static BufferedImage negate(BufferedImage image) {
        BufferedImage src = image;
        BufferedImage dest = createCompatibleDestImage( src, null );
        int width = src.getWidth();
        int height = src.getHeight();

        int[] inPixels = new int[width*height];
        int[] outPixels = new int[width*height];
        URGBColor.getRGB(src, 0, 0, width, height, inPixels );

        // calculate means of pixel
        int index = 0;
        double redSum = 0, greenSum = 0, blueSum = 0;
        double total = height * width;
        for(int row=0; row<height; row++) {
            int ta = 0, tr = 0, tg = 0, tb = 0;
            for(int col=0; col<width; col++) {
                index = row * width + col;
                ta = (inPixels[index] >> 24) & 0xff;
                tr = (inPixels[index] >> 16) & 0xff;
                tg = (inPixels[index] >> 8) & 0xff;
                tb = inPixels[index] & 0xff;
                tr = 255 - tr;
                tg = 255 - tg;
                tb = 255 - tb;
                outPixels[index] = (ta << 24) | (tr << 16) | (tg << 8) | tb;
            }
        }
        URGBColor.setRGB( dest, 0, 0, width, height, outPixels );
        return dest;
    }
    /**
     * 膨胀
     */
    public static BufferedImage dilate(BufferedImage src) {
        int  width = src.getWidth();
        int height = src.getHeight();
        Color forgeColor = Color.WHITE;
        BufferedImage dest = null;
        if ( dest == null ) {
            dest = createCompatibleDestImage( src, null );
        }

        int[]  inPixels = new int[width*height];
        int[] outPixels = new int[width*height];

        URGBColor.getRGB( src, 0, 0, width, height, inPixels );
        int index = 0, index1 = 0, newRow = 0, newCol = 0;
        int ta1 = 0, tr1 = 0, tg1 = 0, tb1 = 0;
        for(int row = 0; row < height; row ++) {
            int ta = 0, tr = 0, tg = 0, tb = 0;
            for(int col = 0; col < width; col ++) {
                index = row * width + col;
                ta = (inPixels[index] >> 24) & 0xff;
                tr = (inPixels[index] >> 16) & 0xff;
                tg = (inPixels[index] >>  8) & 0xff;
                tb =  inPixels[index]        & 0xff;
                boolean dilation = false;
                for(int offsetY = -1; offsetY <= 1; offsetY ++) {
                    for(int offsetX = -1; offsetX <= 1; offsetX ++) {
                        if(offsetY == 0 && offsetX == 0) {
                            continue;
                        }
                        newRow = row + offsetY;
                        newCol = col + offsetX;
                        if(newRow < 0 || newRow >= height) {
                            newRow = 0;
                        }
                        if(newCol < 0 || newCol >= width) {
                            newCol = 0;
                        }
                        index1 = newRow * width + newCol;
                        ta1 = (inPixels[index1] >> 24) & 0xff;
                        tr1 = (inPixels[index1] >> 16) & 0xff;
                        tg1 = (inPixels[index1] >>  8) & 0xff;
                        tb1 =  inPixels[index1]        & 0xff;
                        if(tr1 == forgeColor.getRed() && tg1 == tb1) {
                            dilation = true;
                            break;
                        }
                    }
                    if(dilation){
                        break;
                    }
                }

                if(dilation) {
                    tr = tg = tb = forgeColor.getRed();
                } else {
                    tr = tg = tb = 255 - forgeColor.getRed();
//                    tr = 255;
//                    tg = 0;
//                    tb = 0;
                }
                outPixels[index] = (ta << 24) | (tr << 16) | (tg << 8) | tb;
            }
        }
        URGBColor.setRGB( dest, 0, 0, width, height, outPixels );
        return dest;
    }
}
