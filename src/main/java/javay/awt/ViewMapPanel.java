package javay.awt;

import javay.distance.city.ModelCity;
import javay.util.UGraph;
import javay.util.graph.DefaultGraph;
import javay.util.graph.Edge;
import javay.util.graph.Graph;
import javay.util.graph.Vertex;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;

public class ViewMapPanel extends Container {
  /**
   * serialVersionUID.
   */
  private static final long serialVersionUID = 1L;
  private DefaultGraph graph;
//  private BufferedImage screenImage;
  private BufferedImage backgroundImage;

  /**
   * ViewMapPanel.
   * @param graph Graph
   */
  public ViewMapPanel(Graph graph) {
    this.graph = (DefaultGraph) graph;
    //UGraph.setVertexXY(this.graph, 30, 30, 1240, 640);
    UGraph.setVertexXY(this.graph, 30, 30, 1240, 1240);
    //this.setPreferredSize(new DimensionUIResource(1320, 700));
    this.setPreferredSize(new DimensionUIResource(1320, 1320));
    this.setLayout(null);
    this.setBackground(ColorUIResource.BLACK);
//    this.screenImage = new BufferedImage(1240, 1240, 2);
    try {
        this.backgroundImage = ImageIO.read(new File("./input/zaoqi2.jpg"));
    } catch (IOException e) {
        e.printStackTrace();
    }
//    this.screenImage.drawImage(backgroundImage, 0, 0, null);
    repaint();
  }

  /**
   * @see java.awt.Container#paint(java.awt.Graphics)
   */
  @Override
  public void paint(Graphics gh) {

    gh.setColor(ColorUIResource.BLACK);
    gh.fillRect(0, 0, this.getWidth(), this.getHeight());

    gh.drawImage(this.backgroundImage, 30 , 30, 1240, 1240, null);
 
    drawMap(gh);
    super.paint(gh);
  }

  private void drawMap(Graphics gh) {
    Graphics2D g2d = (Graphics2D) gh.create();

    final Color color = g2d.getColor();
    g2d.setColor(ColorUIResource.GRAY);
    // g2d.drawRect(30, 30, 1240, 640);
    g2d.drawRect(30, 30, 1240, 1240);
    // for (int i = 30; i <= 670; i += 20) {
    for (int i = 30; i <= 1270; i += 20) {
      g2d.drawLine(30, i, 1270, i); // X
      // g2d.drawLine(i, 30, i, 670); // Y
      g2d.drawLine(i, 30, i, 1270); // Y
    }
    for (int i = 690; i <= 1270; i += 20) {
      // g2d.drawLine(i, 30, i, 670); // Y
        g2d.drawLine(i, 30, i, 1270); // Y
    }

    Stroke stroke = g2d.getStroke();
    g2d.setStroke(new BasicStroke(3.0f));
    g2d.setColor(ColorUIResource.YELLOW);
    g2d.drawLine(30, 30, 1280, 30); // X
    // g2d.drawLine(30, 30, 30, 680); // Y
    g2d.drawLine(30, 30, 30, 1280); // Y
    g2d.setStroke(stroke);

    // 顶点
    for (Vertex vertex : this.graph.getVertexes()) {
        g2d.setColor(ColorUIResource.YELLOW);
        g2d.fillOval(vertex.getX() - 3, vertex.getY() - 3, 7, 7);
        g2d.setColor(ColorUIResource.WHITE);
        g2d.drawString(((ModelCity) vertex.getValue()).getName(), vertex.getX() - 5, vertex.getY() - 5);
//        if (((ModelCity) vertex.getValue()).getName().indexOf("镇朔关") >= 0) {
//          g2d.setColor(ColorUIResource.GREEN);
////          g2d.drawOval(vertex.getX() - 188, vertex.getY() - 188, 376, 376);// 圆
//          g2d.drawOval(vertex.getX() - 250, vertex.getY() - 250, 501, 501);// 圆
////          g2d.drawOval(vertex.getX() - 375, vertex.getY() - 375, 751, 751);// 圆
//          //g2d.setColor(ColorUIResource.YELLOW);
//        }
//        if (((ModelCity) vertex.getValue()).getName().indexOf("鸦鹘关，1") >= 0) {
//          g2d.setColor(new Color(204, 255, 255));
////          g2d.drawOval(vertex.getX() - 188, vertex.getY() - 188, 376, 376);// 圆
//          g2d.drawOval(vertex.getX() - 250, vertex.getY() - 250, 501, 501);// 圆
////          g2d.drawOval(vertex.getX() - 375, vertex.getY() - 375, 751, 751);// 圆
//          //g2d.setColor(ColorUIResource.YELLOW);
//        }
//        if (((ModelCity) vertex.getValue()).getName().indexOf("抚顺关") >= 0) {
//            g2d.setColor(ColorUIResource.PINK);
////            g2d.drawOval(vertex.getX() - 188, vertex.getY() - 188, 376, 376);// 圆
//            g2d.drawOval(vertex.getX() - 250, vertex.getY() - 250, 501, 501);// 圆
////            g2d.drawOval(vertex.getX() - 375, vertex.getY() - 375, 751, 751);// 圆
//            //g2d.setColor(ColorUIResource.YELLOW);
//          }
    }

    // 边
    g2d.setColor(ColorUIResource.RED);
    for (LinkedList<Edge> edgs : this.graph.getAdjacencyList()) {
      for (Edge edge : edgs) {
        g2d.drawLine(edge.getFrom().getX(), edge.getFrom().getY(), 
            edge.getTo().getX(), edge.getTo().getY());
        g2d.drawString(edge.getComment(), 
            (edge.getFrom().getX() + edge.getTo().getX()) / 2 - 5,
            (edge.getFrom().getY() + edge.getTo().getY() ) / 2 - 5);
      }
    }

    g2d.setColor(color);
  }

  /**
   * drawTriangle.
   * @param g2d Graphics2D
   * @param x1 int
   * @param y1 int
   * @param x2 int
   * @param y2 int
   * @param x3 int
   * @param y3 int
   */
  public void drawTriangle(Graphics2D g2d, int x1, int   y1,int   x2, int   y2,
      int   x3,int   y3) {
    Polygon filledPolygon = new Polygon();
    filledPolygon.addPoint(x1,y1);
    filledPolygon.addPoint(x2,y2);
    filledPolygon.addPoint(x3,y3);
    g2d.drawPolygon(filledPolygon);
    g2d.fillPolygon(filledPolygon);
  }
}
