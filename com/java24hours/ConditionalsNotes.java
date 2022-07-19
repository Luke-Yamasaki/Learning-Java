package com.java24hours;

class ConditionalsNotes {
    public static void main(String[] arguments) {
        long account = -17_000_000_000_000L;
        if(account < 0) {
            System.out.println("Account overdrawn; you need a bailout");
        }

        int elephantWeight = 900;
        int elephantTotal = 13;
        int cleaningExpense = 200;

        if (elephantWeight > 780) {
            System.out.println("Elephant too big for tightrope act");
        }

        if(elephantTotal > 12) {
            cleaningExpense = cleaningExpense + 150;
        }

        if(account <= 0) {
            System.out.println("You are flat broke");
        }

        String answer = "banana";
        String rightAnswer = "apples";
        int studentGrade = 0;

        if(answer == rightAnswer) {
            studentGrade = studentGrade + 10;
        }

        if(studentGrade == 100) {
            System.out.println("Showoff!");
        }

        if(answer != rightAnswer) {
            studentGrade = studentGrade - 5;
        }

        if(account <= 0) System.out.println("No more money");
    }
}
