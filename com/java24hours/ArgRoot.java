package com.java24hours;

class ArgRoot {
    public static void main(String[] arguments) {
        int input = Integer.parseInt(arguments[0]);
        System.out.println("The square root of "
            + input
            + " is "
            + Math.sqrt(input)
        );
    }
}
