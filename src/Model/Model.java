package Model;

import java.awt.Polygon;
import java.util.*;

/**
 * Model holding
 */
public class Model {

    ArrayList<Polygon> list = new ArrayList<>();

    Polygon current = null;

    public Iterator<Polygon> iterator() { return list.iterator(); }

    /**
     * Returns the amount of pllygon (vertices)
     * @return The list's size
     */
    public int size() {return list.size(); }

    /**
     * Removes all list items of polygon vertices
     */
    public void removeAll() {
        list.clear();
        current = null;
    }

    /**
     *  Adds a polygon (vertex) to the list
     * @param poly The polygon being added to the vertices list
     */
    public void addPolygon(Polygon poly) {
        list.add(poly);
    }

    /**
     *  Makes the selected polygon the current polygon
     * @param poly The polygon to be made current
     */
    public void makeCurrent(Polygon poly) {
        if (list.contains(poly)) {
            current = poly;
        }
    }

    /**
     *  Deselects the polygon
     */
    public void unselectPolygon() { current = null; }

    /**
     * Gets the selected polygon
     * @return The selected polygon
     */
    public Optional<Polygon> getSelected() {
        Optional<Polygon> option = Optional.ofNullable(current);
        return option;
    }

    /**
     * Returns whether or not the polygon is selected
     * @param poly the polygon in question
     * @return If the polygon is selected or not.
     */
    public boolean isSelected(Polygon poly) {
        return (poly != null && poly == current);

    }

}
