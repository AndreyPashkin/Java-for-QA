package ru.javaqa.sandbox;

/**
 * Created by Андрей on 19.01.2017.
 */
public class Start {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = 0;
        p1.y = 0;
        p2.x = 4;
        p2.y = 3;

        System.out.println(distance(p1, p2));

    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }
}
