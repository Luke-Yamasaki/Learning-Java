package com.java24hours;

class Nines {
    public static void main(String[] arguments) {
        for (int dex = 1; dex <= 200; dex++) {
            int multiple = 9 * dex;
            System.out.println(multiple + " ");
        }
        System.out.println();
    }
}

// For loops in Java are pretty identical to JavaScript
// for (int dex = 0; dex < 1000; dex++) {
//     if (dex % 12 == 0) {
//         System.out.println("#: " + dex);
//     }
// }


// While loops are also identical
// int dex = 0;
// while (dex > 0) {
//    System.out.println(dex + " ");
//    dex--;
// }

// Practice
// int limit = 5;
// int count = 1;
// while (count < limit) {
//     System.out.println("Pork is not a verb");
//     count++;
// }


// Do while loops
// Same as a while loop but some function happens at least once
// let i = 7;
// let j = 6;
// do {
//     System.out.println("Hi");
//     i++;
// } while (i < j);

// Break statements
// int index = 0;
// while ( index <= 1000) {
//  index = index + 5;
//  if (index == 400) {
//   break;
//  }
// }

// Skipping a conditional
// int index = 0;
// while (index <= 1000) {
//     index = index + 5;
//     if (index == 400) {
//         countinue;
//     }
//     System.out.println("The index is " + index);
// }
// The continue will skip the print statement and will go to 401.

// Break can make a loop run forever
// while (true) {
//     if (quitKeyPressed == true) {
//         break;
//     }
// }

// Nesting loops
// int points = 0;
// int target = 100;
// while (target <= 100) {
//     for (int i =0; i < target; i++) {
//         if(points > 50) {
//             break;
//         }
//         points = points + i;
//     }
// }

// Breaking parent loop
// int points = 0;
// int target = 100;
// targetLoop:
// while (target <= 100) {
//     for (int i =0; i < target; i++) {
//         if(points > 50) {
//             break targetLoop;
//         }
//         points = points + i;
//     }
// }

// Complex for loops
// int i, j;
// for (i =0, j = 0; i * j < 1000; i++, j+=2) {
//     System.out.println(i + " + " + j + " = " + (i * j));
// }

// Apparently, sections of a for loop can be empty
// int displayCount = 1;
// int endValue = 13;
// for ( ; displayCount < endValue; displayCount++) {
//     do something
// }

