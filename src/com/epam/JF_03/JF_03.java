package com.epam.JF_03;

public class JF_03 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter 2 double parameters: cathetus of the triangle.");
        } else if (args.length < 2) {
            System.out.println("ERROR. Number of parameters is less than 2.");
        } else {
            if (args.length > 2) {
                System.out.println("WARNING! There are more than 2 parameters. Only the first 2 will be used.");
            }
            try {
                Triangle triangle = new Triangle(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
                if (triangle.checkParameters()) {
                    System.out.println(triangle.countThePerimeter());
                    System.out.println(triangle.countTheSquare());
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR. One of the parameters can not be converted to double.");
            }
        }
    }
}
