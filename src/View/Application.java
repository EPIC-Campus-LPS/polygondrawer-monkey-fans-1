package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Application extends JFrame{
    private JPanel contentPane;
    private JMenu Polygon;
    private JMenu Edit;
    private JMenuItem reset;
    private JMenuItem removeLast;

    public Application() {
        setTitle("Sample Polygon Drawing Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
