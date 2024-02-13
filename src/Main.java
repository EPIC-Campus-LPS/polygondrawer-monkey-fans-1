import Model.Model;
import View.Application;

import java.awt.*;
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Model model = new Model();
                Application frame = new Application(model);
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}



