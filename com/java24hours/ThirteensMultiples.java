package com.java24hours;

class ThirteensMultiples {
    public static void main(String[] arguments) {
        int index = 13;
        int count = 0;
        do {
            if(index % 13 == 0) {
                System.out.println(index);
                count++;
            }
            index++;
        } while(count < 400);
    }
}
