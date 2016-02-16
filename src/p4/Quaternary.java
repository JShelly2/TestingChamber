package p4;

import javafx.geometry.Point2D;

public class Quaternary {
    public static void main(String[] Jagger) {
        Point2D pt1 = new Point2D(4, 0);
        Point2D pt2 = new Point2D(0, 3);
        System.out.println(pt1.toString());
        System.out.println(pt2.toString());
        double a = pt1.distance(pt2);

        System.out.println("Distance = " + a);

    }
}
