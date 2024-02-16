package Controller;

import View.Application;
import Model.Model;

/**
 * Controller for updating the menu items of reset and delete.
 */
public class UpdatedMenu {

    /**
     * Updates the menu items in the frame.
     * @param app The main application
     * @param m The main model
     */
    public static void updateMenu(Application app, Model m){
        if(m.size() == 0){
            app.getMiReset().setEnabled(false);
            app.getMiUndo().setEnabled(false);
            app.getMiUndo().setText("Remove");
        } else {
            app.getMiReset().setEnabled(true);
            app.getMiUndo().setEnabled(true);

            if(m.getSelected().isPresent()){
                app.getMiUndo().setText("Remove Last Point");
            } else {
                app.getMiUndo().setText("Remove Last Polygon");
            }
        }
    }



}
