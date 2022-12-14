package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when11to20then1dot414() {
        double expected = 1.414;
        Point a = new Point(1, 1);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when11to58then8dot062() {
        double expected = 8.062;
        Point a = new Point(1, 1);
        Point b = new Point(5, 8);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when111to451then5() {
        double expected = 5;
        Point a = new Point(1, 1, 1);
        Point b = new Point(4, 5, 1);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when440to231then2dot449() {
        double expected = 2.449;
        Point a = new Point(4, 4, 0);
        Point b = new Point(2, 3, 1);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}