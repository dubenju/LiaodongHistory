package image.test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

public class MyPanel extends JPanel implements MouseWheelListener, MouseListener {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private final int tiles_cnt_x = 3; // →
    private final int tiles_cnt_y = 3; // ↓
    private int tiles_count;
    private final int width = 535;
    private final int height = 335;
    private BufferedImage[] backgroundImage;

    private final double scalingFactor = 0.5D;
    private double currentScaling = 1.0D;

    /* 放缩时，光标的位置 */
    private int center_x = -1;
    private int center_y = -1;
    /* 第一个瓦片被绘画时的左上坐标 */
    private int position_x = 0;
    private int position_y = 0;
    /** 0:正常，-1:放大，1:缩小 */
    private int zoomed_flag = 0;
    private int zoomed_width = this.width;
    private int zoomed_height = this.height;
    /* 层 */
    private int level = 1;

    public MyPanel() {
        this.tiles_count = this.tiles_cnt_x * this.tiles_cnt_y;
        loadImage();

      // 设定焦点在本窗体  
      setFocusable(true);  
      // 设定初始构造时面板大小,这里先采用图片的大小  
      setPreferredSize(new Dimension(1605,1005));  
      // 绘制背景  
//      drawView();
      addMouseWheelListener(this);
      addMouseListener(this);

//      repaint();
    }
    
  /** 
   * 载入图像 
   */  
  private void loadImage() {
      this.backgroundImage = new BufferedImage[this.tiles_count];

      try {
          for (int i = 0; i < this.tiles_count; i ++) {
              this.backgroundImage[i] = ImageIO.read(new File("./output/" + (this.level < 9 ? "0" : "") + this.level+ "_" + (i < 9 ? "0" : "") + i + ".jpg"));
          }
    } catch (IOException e) {
        e.printStackTrace();
        System.out.println(e);
    }
      System.out.println("load image" + this.level);
  }

  public void paint(Graphics g) {
      // 背景
      g.setColor(ColorUIResource.BLACK);
      g.fillRect(0, 0, this.getWidth(), this.getHeight());

      // 图片
      for (int i = 0; i < this.tiles_count; i ++) {
          int new_pos_x = position_x + (i % this.tiles_cnt_x) * zoomed_width;
          int new_pos_y = position_y + (i / this.tiles_cnt_x) * zoomed_height;
          g.drawImage(image.Image.zoomInImage(this.backgroundImage[i], this.currentScaling) , new_pos_x, new_pos_y, null);

      }

      // 方格
      for (int i = 0; i < this.tiles_count; i ++) {
          g.setColor(new Color(255, 0, 0));
          int pos_x = (i % this.tiles_cnt_x) * width;
          int pos_y = (i / this.tiles_cnt_x) * height;

          int new_pos_x = position_x + (i % this.tiles_cnt_x) * zoomed_width;
          int new_pos_y = position_y + (i / this.tiles_cnt_x) * zoomed_height;
          g.drawRect(new_pos_x, new_pos_y, zoomed_width, zoomed_height);
          g.setColor(new Color(0, 0, 255));
          g.drawRect(pos_x, pos_y, width, height);
//          System.out.println(this.currentScaling + ">" + i + "(" + pos_x + "," + pos_y + ":" + width + "," + height + 
//              ")=>(" + new_pos_x + "," + new_pos_y + ":" + zoomed_width + "," + zoomed_height + ")");
      }
  }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
//        if (e.isControlDown()) {
            System.out.println("变化前：" + this.zoomed_flag + ":" + this.position_x + "," + this.position_y + "," + this.zoomed_width + "," + this.zoomed_height + 
                    ">" + this.currentScaling + ">>" + this.position_x + "," + this.position_y + ">>>层:" + this.level);
            this.zoomed_flag = e.getWheelRotation();

            this.center_x = e.getX();
            this.center_y = e.getY();
            int old_x = (int) ((this.center_x - this.position_x) / this.currentScaling);
            int old_y = (int) ((this.center_y - this.position_y) / this.currentScaling);

            double newScaling = this.currentScaling;
            if (e.getWheelRotation() < 0) {
                newScaling += this.scalingFactor;
                System.out.println(e.getX() + "," + e.getY() + "mouse wheel Up");
                if (newScaling > 2) {
                    newScaling = 1;
                    this.level ++;
                    if (this.level > 15) { this.level = 15; }
                    // load Image
                    loadImage();
                }
            } else {
                newScaling -= this.scalingFactor;
                System.out.println(e.getX() + "," + e.getY() + "mouse wheel Down");
                if (newScaling < 1) {
                    newScaling = 1;
                    this.level --;
                    if (this.level <= 0) { this.level = 1; }
                    // load Image
                    loadImage();
                }
            }
            this.currentScaling = newScaling;
            System.out.println("倍率:" + newScaling + "旧光标位置:" + old_x + "," + old_y);

            int new_x = (int) (old_x * this.currentScaling);
            int new_y = (int) (old_y * this.currentScaling);
            this.zoomed_width = (int) (this.width * this.currentScaling);
            this.zoomed_height = (int) (this.height * this.currentScaling);

            this.position_x = this.center_x - new_x;
            this.position_y = this.center_y - new_y;
            System.out.println(this.zoomed_flag + "光标位置:(" + this.center_x + "," + this.center_y + ")=>(" + new_x + "," + new_y + "):(" + this.position_x + "," + this.position_y + ")");

            System.out.println("变化后：" + this.zoomed_flag +  ":" + this.position_x + "," + this.position_y + "," + this.zoomed_width + "," + this.zoomed_height + 
                    ">" + this.currentScaling + ">>" + this.position_x + "," + this.position_y + ">>>层:" + this.level);
            System.out.println();
//        } else {
//            getParent().dispatchEvent(e);
//        }

        // 再描画要求
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getX() + "," + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
