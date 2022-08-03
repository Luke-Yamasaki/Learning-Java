package com.java24hours;

class SpaceRemover {
    public static void main(String[] arguments) {
        String mostFamous = "Rudolph the Red-Nosed Reindeer";
        char[] mfl = mostFamous.toCharArray();
        for(int dex = 0; dex < mfl.length; dex++) {
            char current = mfl[dex];
            if(current != ' ') {
                System.out.print(current);
            } else {
                System.out.print('.');
            }
        }
        System.out.println();
    }
}

// Creating arrays
// String[] badKid;
// int[] reindeerWeight;
// boolean[] hostileAirTravelNations;
// int[] elfSeniority = new int[250]; *This creates an array from 0 to 249
// String[] reindeerNames = { "Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donder", "Blitzen"};

// String[] reindeerNames = new String[8];
// reindeerNames[0] = "Dasher";
// reindeerNames[1] = "Dancer";
// reindeerNames[2] = "Prancer";
// reindeerNames[3] = "Vixen";
// reindeerNames[4] = "Comet";
// reindeerNames[5] = "Cupid";
// reindeerNames[6] = "Donder";
// reindeerNames[7] = "Blitzen";
// After and array gets created in Jave, you can't add more items

// elfSeniority[193] += 1;
// niceChild[9428] = "Eli";
// currentNation = 413;
// if (hostileAirTravelNations[currentNation] == true) {
//     sendGiftByMail();
// }

// String[] topGifts = new String[10];
// If you try to key into topGifts[10], you will get an ArrayIndexOutOfBoundsException error message

//Print length just like JavaScript
// 
// System.out.println("There are " + reindeerNames.length + " reindeers.";



