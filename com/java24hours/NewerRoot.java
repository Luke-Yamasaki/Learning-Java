package com.java24hours;

class NewerRoot {
    public static void main(String[] arguments) {
        int number = 100;
        if (arguments.length > 0) {
            number = Integer.parseInt(arguments[0]);
        }
        System.out.println("The square root of " 
        + number
        + " is "
        + Math.sqrt(number)
        );
    }
}

//Instances in Java
// class Modem {
//     int speed;
//     public void displaySpeed() {
//         System.out.println("Speed: " + speed);
//     }
// }

// Modem device = new Modem();
// device.speed = 28800;
// device.displaySpeed();

// Inheritance is the same in Java
// public class ErrorModem extends Modem {...new program}

// Casting is converting a source variable to a new destination variable
// Source variables will be a different type than the destination variable
// i.e.
// float source = 7.06F;
// int destination = (int) source;
// * You have to wrap the new type in (), like (int)

// Most of the time destination variables will have more than enough space
// Sometimes the destination will be smaller like integer to byte
// You have to explicitly cast it
// i.e.
// int xNum = 103;
// byte val = (byte) xNum;
// Also,
// Java will automatically change the value to fit in a range if it is too large

// Sometime you don't need to cast at all
// char can be used like int
// int can be used like long
// anything can be used as double

// You can cast an object into other objects when they are related by inheritance
// Example
// public void paintComponent(Graphics comp) {
//     Graphics2D comp2D = (Graphics2D) comp;
// }
// This casts a Graphics object called comp into a Graphics2D object

// You can't cast an object to a variable and vice versa
// But there are leading capital variable classes that allow you to do it
// Boolean, Byte, Character, Double, Float, Integer, Long and Short
// Integer suffix = new Integer(5309);
// int newSuffix = suffix.intValue();
// String count = "25";
// int myCount = Integer.parseInt(count);