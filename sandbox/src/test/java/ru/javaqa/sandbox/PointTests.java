package ru.javaqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Андрей on 24.01.2017.
 */
public class PointTests {

    @Test
    public void testDistance01() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 7);

        Assert.assertEquals(p1.distance(p2), 5.0);

    }

    @Test
    public void testDistance02() {
        Point p1 = new Point(-11, 90);
        Point p2 = new Point(-3, 96);

        Assert.assertEquals(p1.distance(p2), 10.0);

    }

    @Test
    public void testDistance03() {
        Point p1 = new Point(121, -144);
        Point p2 = new Point(105, -132);

        Assert.assertEquals(p1.distance(p2), 20.0);

    }

    @Test
    public void testDistance04() {
        Point p1 = new Point(-201, -133);
        Point p2 = new Point(199, 167);

        Assert.assertEquals(p1.distance(p2), 500.0);

    }

}
