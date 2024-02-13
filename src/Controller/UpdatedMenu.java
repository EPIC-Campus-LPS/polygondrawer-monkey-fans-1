import View.Application;
import Model.Model;
public class UpdatedMenu {


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
