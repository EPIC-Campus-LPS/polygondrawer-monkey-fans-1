import java.awt.EventQueue;
import View.Application;
public class Main {
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            try {
                Application frame = new Application();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}