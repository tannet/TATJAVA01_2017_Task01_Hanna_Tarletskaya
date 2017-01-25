package com.epam.JF_05;

public class JF_05 {
    // should we identify Infinity? (no)
    // methods without Math will be quite faster
    static double second(double a) {
        return a * a;
    }

    static double fourth(double a) {
        return a * a * a * a;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter 3 double parameters.");
        } else if (args.length < 3) {
            System.out.println("ERROR. Number of parameters is less than 3.");
        } else {
            if (args.length > 3) {
                System.out.println("WARNING! There are more than 3 parameters. Only the first 3 will be used.");
            }
            try {
                for (int i = 0; i < 3; i++) {
                    double a = Double.parseDouble(args[i]);
                    if (a < 0) {
                        //System.out.println(fourth(a));
                        System.out.println(Math.pow(a, 4));
                    } else {
                        //System.out.println(second(a));
                        System.out.println(Math.pow(a, 2));
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR. One of the parameters can not be converted to double.");
            }
        }
    }
}