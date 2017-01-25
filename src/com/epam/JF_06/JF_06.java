package com.epam.JF_06;

public class JF_06 {
    // should we identify Infinity? (no)

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
                double minValue = Double.parseDouble(args[0]);
                double maxValue = Double.parseDouble(args[0]);
                for (int i = 1; i < 3; i++) {
                    double currentValue = Double.parseDouble(args[i]);
                    if (currentValue > maxValue) {
                        maxValue = currentValue;
                    }
                    if (currentValue < minValue) {
                        minValue = currentValue;
                    }
                }
                System.out.println(minValue + maxValue);
            } catch (NumberFormatException e) {
                System.out.println("ERROR. One of the parameters can not be converted to double.");
            }
        }
    }
}