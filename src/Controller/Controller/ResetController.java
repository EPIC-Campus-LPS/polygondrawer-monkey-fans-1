package Controller;

import Model.Model;
import View.Application;

public class ResetController {
    final Model model;
    final Application app;

    public ResetController(Application app, Model m) {
        this.app = app;
        this.model = m;
    }

    public void reset() {
        model.removeAll();

        UpdatedMenu.updateMenu(app, model);
        app.repaint();
    }

}
