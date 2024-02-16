package Controller;

import Model.Model;
import View.Application;
import Controller.UpdatedMenu;

import java.awt.*;
import java.util.Iterator;
import java.util.Optional;

/**
 * Controller for removing recent vertex
 */
public class UndoController {
    final Model model;
    final Application app;

    /**
     * Initializes the undo controller
     * @param app1 The application being drawn on
     * @param model The model holding the polygon
     */
    public UndoController(Application app1, Model model) {
        this.model = model;
        this.app = app1;
    }

    /**
     * Removes the last point placed
     */
    public void removeLastPoint() {

        Optional<Polygon> selected = model.getSelected();
        if (selected.isPresent()) {
            Polygon poly = selected.get();
            if (poly.npoints > 0) {
                poly.npoints--;
            }
        } else {
            //remove last polygon
            Iterator<Polygon> it = model.iterator();
            while (it.hasNext()) {
                it.next();
                if (it.hasNext()) {
                    it.remove();
                    break;
                }
            }
        }
        UpdatedMenu.updateMenu(app, model);
        app.repaint();
    }
}
