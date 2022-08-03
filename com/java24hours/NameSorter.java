package com.java24hours;
import java.util.*;

class NameSorter {
    public static void main(String[] arguments) {
        String names[] = { "Glimmer", "Marvel", "Rue", "Clove", "Thresh", "Foxface", "Cato", "Peeta", "Katniss" };
        System.out.println("The original order:");
        for(int i = 0; i < names.length; i++) {
            System.out.println(i + ":  " + names[i]);
        }
        System.out.println();
        Arrays.sort(names);
        System.out.println("The new order:");
        for(int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }
        System.out.println();
    }
}

//You can create 2D matrices by adding an extra bracket
// boolean default values are set to false
// boolean[][] selectedPoint = new boolean[50][50];
// selectedPoint[4][13] = true;
// selectedPoint[7][6] = true;
// selectedPoint[11][22] = true;

//Sort and swap values in an array
// int temporary = numbers[5];
// numbers[5] = numbers[6];
// numbers[6] = temporary;

//Import Array class from java.util
// import java.util.*;
// create the array
// use the sort() method to rearrange the array