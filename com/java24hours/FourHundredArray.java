package com.java24hours;

class FourHundredArray {
   public static void main(String[] arguments) {
      int[] fourHundred = new int[400];
      int multiple = 13;
      for(int i = 0; i < 400; i++) {
         fourHundred[i] = multiple;
         multiple += 13;
         System.out.println("Num: " + fourHundred[i]);
      }
   } 
}
