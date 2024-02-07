package View;

import javax.swing.*;
import java.awt.*;

public class Application {
    private JPanel contentPane;

    public static void Main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Application frame = new Application();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Application() {





    }


}
