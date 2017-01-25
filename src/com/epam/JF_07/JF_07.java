package com.epam.JF_07;

public class JF_07 {
    // can be the step negative? (no)
    // can be A-value more than B? (no)
    // should we check the min-max value? (yes)

    static double countTheFunctionSimple(double x) {
        return Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
    }

    // the next method will be quite more exact than the previous one
    static double countTheFunctionModify(double x) {
        return 3 * Math.pow(Math.sin(x), 2) - 1;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter 3 double parameters: value of the range and the step value.");
        } else if (args.length < 3) {
            System.out.println("ERROR. Number of parameters is less than 3.");
        } else {
            if (args.length > 3) {
                System.out.println("WARNING! There are more than 3 parameters. Only the first 3 will be used.");
            }
            try {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                double h = Double.parseDouble(args[2]);
                if (h <= 0) {
                    System.out.println("ERROR. The step (the 3d parameter) must be greater than 0.");
                } else if (a >= b) {
                    System.out.println("ERROR. The first parameter of range must be less than the second one.");
                } else if((a >= Double.MAX_VALUE)||(b >= Double.MAX_VALUE)||(h >= Double.MAX_VALUE)) {
                    System.out.println(Double.MAX_VALUE + "ERROR. One of the parameters is greater than max double value.");
                } else if((a <= Double.MIN_VALUE)||(b <= Double.MIN_VALUE)||(h <= Double.MIN_VALUE)) { // HERE THE MAGIC HAPPENS
                    System.out.println(Double.MIN_VALUE + "ERROR. One of the parameters is less than min double value.");
                }else {
                    System.out.println("Argument || Function");
                    while (a <= b) {
                        System.out.println(a + "    || " + countTheFunctionSimple(a)/* + " || " + countTheFunctionModify(a) */);
                        a += h;
                    }
                }
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("ERROR. One of the parameters can not be converted to double.");
            }
        }
    }
}