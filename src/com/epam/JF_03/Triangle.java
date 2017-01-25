package com.epam.JF_03;

public class Triangle {
    private double a;
    private double b;

    Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public boolean checkParameters() {
        if (a <= 0) {
            System.out.println("ERROR. The 1st parameter must be great than 0.");
            return false;
        } else if (b <= 0) {
            System.out.println("ERROR. The 2d parameter must be great than 0.");
            return false;
        } else {
            return true;
        }
    }

    public String countThePerimeter() {
        double perimeter = 2 * (a + b);
        if (perimeter > Double.MAX_VALUE) {
            return ("ERROR. The value of perimeter is more than double-type maximum value.");
        } else {
            return ("Perimeter: " + perimeter);
        }
    }

    public String countTheSquare() {
        double square = (a * b)/2;
        if (square > Double.MAX_VALUE) {
            return ("ERROR. The value of square is more than double-type maximum value.");
        }
        else {
            return ("Square: " + square);
        }
    }
}