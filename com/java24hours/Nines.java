package com.java24hours;

// For loops in Java are pretty identical to JavaScript
// for (int dex = 0; dex < 1000; dex++) {
//     if (dex % 12 == 0) {
//         System.out.println("#: " + dex);
//     }
// }

class Nines {
    public static void main(String[] arguments) {
        for (int dex = 1; dex <= 200; dex++) {
            int multiple = 9 * dex;
            System.out.println(multiple + " ");
        }
        System.out.println();
    }
}

// While loops are also identical
// int dex = 0;
// while (dex > 0) {
//    System.out.println(dex + " ");
//    dex--;
// }

