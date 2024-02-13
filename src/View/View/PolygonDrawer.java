package View;

import Model.Model;

import javax.swing.JPanel;
import java.awt.*;
import java.util.Iterator;

import java.awt.Graphics;
import java.awt.Polygon;

public class PolygonDrawer extends JPanel {
    public static final int Radius = 2;
    Model model;

    /**
     *  Creates Panel
     * @param m Model for Panel
     */
    public PolygonDrawer(Model m) {
            this.model = m;

        }


        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.yellow);
            Iterator<Polygon> it = model.iterator();
            while (it.hasNext()) {
                Polygon poly = it.next();

                //draw lines if closed, or just draw points if not closed
                if (poly.npoints >= 3) {
                    for (int i = 0; i <poly.npoints-1; i++) {
                        g.drawLine(poly.xpoints[i], poly.ypoints[i], poly.xpoints[i+1], poly.ypoints[i+1]);
                    }
                    g.drawLine(poly.xpoints[poly.npoints-1], poly.ypoints[poly.npoints-1], poly.xpoints[0], poly.ypoints[0]);
                } else {
                    for (int i = 0; i <poly.npoints; i++)  {
                        g.drawOval(poly.xpoints[i] - Radius, poly.ypoints[i] - Radius, 2*Radius, 2*Radius);
                    }
                }
            }
        }
}
