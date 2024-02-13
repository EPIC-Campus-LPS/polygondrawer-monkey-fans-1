package Controller;

import javax.swing.JOptionPane;

import View.Application;

public class QuitController {
    public boolean confirm(Application app) {
        return JOptionPane.showConfirmDialog (app, "Do you wish to exit Application?") == JOptionPane.OK_OPTION;
    }
}