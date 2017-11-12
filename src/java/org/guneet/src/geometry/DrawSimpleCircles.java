package src.geometry;

import javax.swing.*;
import java.awt.*;

/**
 * Created by manojjoshi on 4/23/17.
 */
public class DrawSimpleCircles extends JFrame {
    int x;
    int y;

    /**
     * Constructor is a special method that is called when
     * a new class is created
     */

    public DrawSimpleCircles(int x, int y) {
        this.x=x;
        this.y=y;
        setTitle("Tutorial");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        //g.setColor(Color.BLUE);
        for (int i = 0; i < 50; i++) {
            //Color c = new Color(i, i, i);
            g.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
           //The third and fourth parameters deal with the size of the circles
            //third parameter is the horizontal extent, happens to be the major extent
            // fourth parameter is the vertical extent, happens to be the minor extent
            g.drawOval(0 +x + i, 0 + y+ i, 100, 100);
            g.fillOval(0 + x + i, 0 +y+ i, 100, 100);
        }
    }

    public static void main(String args[]) {
        DrawSimpleCircles t = new DrawSimpleCircles(0,0);
        DrawSimpleCircles t1 = new DrawSimpleCircles(0,0);
        t.paint(null);
        t1.paint(null);
    }

}


