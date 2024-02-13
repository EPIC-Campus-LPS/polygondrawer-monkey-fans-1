package View;

import Controller.AddPointController;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Model.Model;

/**
 *  View application class for Polygon Drawer communicating with Model
 */
public class Application extends JFrame{
     JPanel contentPane;
     JMenu menu_Polygon;
     JMenu menu_Edit;
     JMenuItem menuItem_Reset;
     JMenuItem menuItem_RemoveLast;
     public Model model;



/** makes the app window and allows things to be edited*/
    /**
     *  The main application method for application class
     *
     * @param m The model being communicated with
     */
    public Application(Model m) {
        model = m;
        setTitle("Sample Polygon Drawing Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        //creates each object individually
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

        contentPane = new PolygonDrawer(m);


        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        contentPane.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                new AddPointController(Application.this, model).addPoint(e.getPoint());
            }
        });
    }
    Application(){
        this (new Model());
    }
    /**
     * Gets the menu item for undo
     *
     * @return The undo menu item object
     */
    public JMenuItem getMiUndo() { return menuItem_RemoveLast; }

    /**
     * Gets the menu item for reset
     *
     * @return The reset menu item object
     */
    public JMenuItem getMiReset() { return menuItem_Reset; }

    /**
     * Gets the polygon drawer
     *
     * @return  The polygon drawer J Panel
     */
    public JPanel getPolygonDrawer() { return contentPane; }
}