package com.epam.JF_04;

public class JF_04 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter 2 double parameters.");
        } else if (args.length < 2) {
            System.out.println("ERROR. Number of parameters is less than 2.");
        } else {
            if (args.length > 2) {
                System.out.println("WARNING! There are more than 2 parameters. Only the first 2 will be used.");
            }
            try {
                Point point = new Point(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
                System.out.println(point.checkPoint());
            } catch (NumberFormatException e) {
                System.out.println("ERROR. One of the parameters can not be converted to double.");
            }
        }
    }
}