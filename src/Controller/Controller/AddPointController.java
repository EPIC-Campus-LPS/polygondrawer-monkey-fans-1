package Controller;
import View.Application;
import Model.Model;
import java.awt.* ;
import java.util.Optional;

/**
 * controller for adding new vertex
 */
public class AddPointController {

    private Model model;

    private Application app;

    /**
     * Constructor for addpointcontroller
     * @param app Main application
     * @param m Main model
     */
    public AddPointController(Application app, Model m) {
        this.app = app;
        this.model = m;
    }

    /**
     * Adds point to the polygon
     *
     * @param p The point being added
     */
    public void addPoint(Point p){
        Optional<Polygon> selected = model.getSelected();
        if(!selected.isPresent()) {
            Polygon poly = new Polygon();
            poly.addPoint(p.x, p.y);

            model.addPolygon(poly);
            model.makeCurrent(poly);
        } else {
            selected.get().addPoint(p.x, p.y);
        }

        app.repaint();
    }

}
