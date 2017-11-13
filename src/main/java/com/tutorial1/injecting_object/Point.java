package com.tutorial1.injecting_object;

/**
 * Created by Arpan on 11/12/17.
 */
public class Point {

    int x_Axis;
    int y_Axis;

    public Point() {

    }

    public Point(int x_Axis, int y_Axis) {

        this.x_Axis = x_Axis;
        this.y_Axis = y_Axis;
    }

    public int getX_Axis() {
        return x_Axis;
    }

    public void setX_Axis(int x_Axis) {
        this.x_Axis = x_Axis;
    }

    public int getY_Axis() {
        return y_Axis;
    }

    public void setY_Axis(int y_Axis) {
        this.y_Axis = y_Axis;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x_Axis=" + x_Axis +
                ", y_Axis=" + y_Axis +
                '}';
    }
}
