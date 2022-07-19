package com.java24hours;

class Commodity {
    public static void main(String[] arguments) {
        String command = "BUY";
        int balance = 550;
        int quantity = 42;

        switch (command) {
            case "BUY":
                quantity += 5;
                balance -= 20;
                break;
            case "SELL":
                quantity -= 5;
                balance += 15;
        }
        System.out.println("Balance: " + balance + "\n"
            + "Quantity: " + quantity);

        int skillLevel = 10;

        int numberOfEnemies = (skillLevel > 5) ? 20 : 10;
        System.out.println("You have " + numberOfEnemies + " enemies.");

        String gender = "male";
        System.out.print((gender.equals("male")) ? "Mr." : "Ms.");


    }
}
