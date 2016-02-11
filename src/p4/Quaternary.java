package p4;

import javafx.geometry.Point2D;

public class Quaternary {
    public static void main(String[] Jagger) {
        Point2D pt1 = new Point2D(6.2, 5.3);
        Point2D pt2 = new Point2D(2.2, 7.3);

        double a = pt1.distance(pt2);

        System.out.println("Distance = " + a);

    }
}
