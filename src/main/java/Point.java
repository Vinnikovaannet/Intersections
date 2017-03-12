package main.java;

class Point {
    private double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    boolean isSame(Point point) {
        return (x == point.x && y == point.y);
    }
}
