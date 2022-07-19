package com.java24hours;

class Game {
    public static void main(String[] arguments) {
        int total = 0;
        int score = 7;

        if(score == 7) {
            System.out.println("You score a touchdown!");
        }

        if(score == 3) {
            System.out.println("You kick a field goal!");
        }

        total = total + score;
        System.out.println("Total score: " + total);

        int playerScore = 12000;
        int playerLives = 3;
        int difficultyLevel = 10;

        if(playerScore > 9999) {
            playerLives++;
            System.out.println("Extra life!");
            System.out.println("Lives left: " + playerLives);
            difficultyLevel = difficultyLevel + 5;
        }

        int answer = 17;
        int correctAnswer = 13;
        int gameScore = 0;

        if(answer == correctAnswer) {
            gameScore += 10;
            System.out.println("That's correct! You get 10 points.");
            System.out.println("You now have " + gameScore + " points.");
        } else {
            score -= 5;
            System.out.println("Sorry, that's wrong. You lose 5 points.");
            System.out.println("You now have " + gameScore + " points.");
        }

    }
}
