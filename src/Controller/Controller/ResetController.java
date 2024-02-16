package Controller;

import Model.Model;
import View.Application;

/**
 * Controller for clearing the model
 */
public class ResetController {
    final Model model;
    final Application app;

    /**
     * Initializes the reset controller
     * @param app The application being drawn on
     * @param m The model holding the polygon
     */
    public ResetController(Application app, Model m) {
        this.app = app;
        this.model = m;
    }

    /**
     * Fully resets the model and removes all vertices
     */
    public void reset() {
        model.removeAll();

        UpdatedMenu.updateMenu(app, model);
        app.repaint();
    }

}
