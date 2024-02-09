package View;

import View.PolygonDrawer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Application extends JFrame{
    PolygonDrawer contentPane;

    JMenu menu_Polygon;
    private JMenu Polygon;
    JMenu menu_Edit;
    JMenuItem menuItem_Reset;
    JMenuItem menuItem_RemoveLast;

    public Application() {
        setTitle("Sample Polygon Drawing Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menu_Polygon = new JMenu("Polygon");
        menuBar.add(menu_Polygon);

        menuItem_Reset = new JMenuItem("Reset");
        menuItem_Reset.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        menu_Polygon.add(menuItem_Reset);

        menu_Edit = new JMenu("Edit");
        menuBar.add(menu_Edit);

        JMenuItem menuItem_RemoveLast = new JMenuItem("Remove Last");
        menuItem_RemoveLast.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, 0));
        menu_Edit.add(menuItem_RemoveLast);

        contentPane = new PolygonDrawer();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
    }

    public JMenuItem getUndoMenuItem() { return menuItem_RemoveLast; }
    public JMenuItem getResetMenuItem() { return menuItem_Reset; }
    public PolygonDrawer getPolygonDrawer() { return contentPane; }
}
