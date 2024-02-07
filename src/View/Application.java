package View;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

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

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnPolygon = new JMenu("Polygon");
        menuBar.add(mnPolygon);

        JMenuItem mntmReset = new JMenuItem("Reset");
        mntmReset.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        mnPolygon.add(mntmReset);

        JMenu mnEdit = new JMenu("Edit");
        menuBar.add(mnEdit);

        JMenuItem mntmRemoveLast = new JMenuItem("Remove Last");
        mntmRemoveLast.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, 0));
        mnEdit.add(mntmRemoveLast);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
