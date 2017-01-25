package com.epam.JF_01;

public class JF_01 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter the string consisting of 4 figures.");
        } else {
            boolean flag = false;
            String string = args[0];
            if (string.length() < 4) {
                System.out.println("ERROR. There are must be 4 figures in the first string.");
            } else {
                if ((args.length > 1) || (string.length() > 4)) {
                    System.out.println("WARNING! There are must be one string made of 4 figures. Only first 4 figures from the first string will be used.");
                }
                char[] figures = args[0].toCharArray();
                int[] num = new int[4];
                for (int i = 0; i < num.length; i++) {
                    try{
                        num[i] = Integer.parseInt(String.valueOf(string.charAt(i)));
                    } catch (NumberFormatException e){
                        System.out.println("ERROR. One of the parameters can not be converted to integer.");
                        break;
                    }
                }
                if ((num[0] + num[1]) == (num[2] + num[3])) {
                    flag = true;
                }
            }
            System.out.println(flag);
        }
    }
}
