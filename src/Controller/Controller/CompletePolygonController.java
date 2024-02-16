package Controller;

import Controller.UpdatedMenu;
import Model.Model;
import View.Application;

/**
 * Controller for making new polygons
 */
public class CompletePolygonController {

    private Model model;

    private Application app;

    /**
     * Constructor for completepolygoncontroller
     * @param app Main application
     * @param m Main model
     */
    public CompletePolygonController(Application app, Model m){
        this.app = app;
        this.model = m;
    }

    /**
     * Makes a new complete polygon
     */
    public void complete(){
        model.unselectPolygon();

        UpdatedMenu.updateMenu(app, model);
        app.repaint();
    }
}
