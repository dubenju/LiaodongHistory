package image.test;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class MyFrame extends Frame {  
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    public MyFrame() {  
        
        // 默认的窗体名称  
        this.setTitle("显示图片");  
  
        // 获得面板的实例  
        MyPanel panel = new MyPanel();
        JScrollPane jsp = new JScrollPane(panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.add(panel);  
//        add(jsp, BorderLayout.CENTER);
        this.addWindowListener(
            new WindowAdapter() {  
            //设置关闭
            public void windowClosing(WindowEvent e) {  
                System.exit(0);  
            }  
        });
//        this.addMouseWheelListener(
//            new MouseWheelListener() {
//                private double scalingFactor = 1.2D;
//                private double currentScaling = 1.0D;
//                public double getCurrentScaling() {
//                    return currentScaling;
//                }
//                @Override
//                public void mouseWheelMoved(MouseWheelEvent event) {
//                    // Check if Ctrl is down
//                    if(event.isControlDown())
//                    {
//                        // Determine the new scaling level
//                        double newScaling = getCurrentScaling();    // This method should return current value; if == 1, then zoom is not applied
//                        int wheelRotation = event.getWheelRotation();
//                        if(wheelRotation > 0)
//                        {
//                            // Positive zoom (zoom in)
//                            newScaling *= scalingFactor;
//                        }
//                        else
//                        {
//                            // Negative zoom (zoom out)
//                            newScaling /= scalingFactor;
//                        }
//                 
//                        // Now that you calculated new scaling factor, you can apply it
//                        // to your component (keep in mind that you should also put some
//                        // conditions to keep scaling factor inside some interval)
//                        System.out.println(wheelRotation + "," + newScaling);
//                    }
//                }
//        });
        // 执行并构建窗体设定  
        this.pack();  
        this.setVisible(true);  
    }  
    public static void main(String[] args) {
        Frame frame=new MyFrame(); 
    }

}
