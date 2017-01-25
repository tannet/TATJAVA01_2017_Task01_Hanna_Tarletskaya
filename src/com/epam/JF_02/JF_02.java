package com.epam.JF_02;

public class JF_02 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter 3 double parameters to run the programm.");
        } else if (args.length < 3) {
            System.out.println("ERROR. Number of parameters is less than 3.");
        }
        else {
            if (args.length > 3) {
                System.out.println("WARNING! There are more than 3 parameters. Only the first 3 will be used.");
            }
            try {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                double c = Double.parseDouble(args[2]);
                if (checkParameters(a, b, c)) {
                    System.out.println(countTheExpression(a, b, c));
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR. One of parameters can not be converted to double.");
            }
        }
    }

    static boolean checkParameters(double a, double b, double c) {
        if (a == 0) {
            System.out.println("ERROR. The 1st parameter must be not 0.");
            return false;
        } else if (b == 0) {
            System.out.println("ERROR. The 2d parameter must be not 0.");
            return false;
        } else if ((b * b + 4 * a * c) < 0) {
            System.out.println("ERROR. To find solution in real discriminant must be >= 0.");
            return false;
        } else {
            return true;
        }
    }

    static double countTheExpression(double a, double b, double c) {
        return (((b + Math.sqrt((b * b + 4 * a * c))) / (2 * a)) - (a * a * a * c) + (1 / (b * b)));
    }
}
