package com.epam.JF_04;

public class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean checkPoint() {
        if (checkAboveZero() || checkBelowZero()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkAboveZero() {
        if (checkX(-2, 2) && checkY(0, 4)) {
            return true;
        } else {
            return false;
        }

    }

    private boolean checkBelowZero() {
        if (checkX(-4, 4) && checkY(-3, 0)) {
            if (checkCircle()) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean checkX(double lower, double higher) {
        if (x >= lower && x <= higher) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkY(double lower, double higher) {
        if (y >= lower && y <= higher) {
            return true;
        } else {
            return false;
        }
    }

    // radius = 0.5
    // x0 = 0
    // y0 = -1
    private boolean checkCircle() {
        if (Math.sqrt(x * x + y * y + 2 * y + 1) <= 0.5) {
            return true;
        } else {
            return false;
        }
    }
}