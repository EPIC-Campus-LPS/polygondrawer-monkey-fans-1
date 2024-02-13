package Controller;

import Model.Model;
import View.Application;
import Controller.UpdatedMenu;

import java.awt.*;
import java.util.Iterator;
import java.util.Optional;

public class UndoController {
    final Model model;
    final Application app;

    public UndoController(Application app1, Model model) {
        this.model = model;
        this.app = app1;
    }

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
