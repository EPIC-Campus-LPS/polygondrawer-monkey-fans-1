package Controller;

import javax.swing.JOptionPane;

import View.Application;

/**
 * Controller for exit prompt
 */
public class QuitController {
    /**
     * Prompts the user to close the app requiring confirmation first.
     * @param app The application being closed.
     * @return
     */
    public boolean confirm(Application app) {
        return JOptionPane.showConfirmDialog (app, "Do you wish to exit Application?") == JOptionPane.OK_OPTION;
    }
}