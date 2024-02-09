package View;

import Model.Model;

import javax.swing.JPanel;

public class PolygonDrawer extends JPanel {

    Model model;

    /**
     *  Creates Panel
     * @param m Model for Panel
     */
    public PolygonDrawer(Model m) {
            this.model = m;

        }


        public void paintComponent(Graphics g) {
            super.PaintComponent(g);

            Iterator<Polygon> it = model.iterator();
            while (it.hasNext()) {
                Polygon poly = it.next();

                //draw lines if closed, or just draw points if not closed
                if (poly.npoints >= 3) {
                    for (int i = 0; i <poly.npoints-1; i++) {
                        g.drawLine(poly.xpoints[i], poly.ypoints[i], poly.xpoints[i+1], poly.ypoints[i+1]);
                    }
                    g.DrawLine(poly.xpoints[poly.npoints-1], poly.ypoints[poly.npoints-1], poly.xpoints[0], poly.ypoints[0]);
                } else {
                    for (int i = 0; i <poly.npoints; i++)  {
                        g.drawOval(poly.xpoints[i] - Radius, poly.ypoints[i] - Radius, 2*Radius, 2*Radius)
                    }
                }
            }
        }
}
