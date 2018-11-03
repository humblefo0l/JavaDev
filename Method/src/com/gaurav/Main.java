package com.gaurav;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 800;
	    int levelcompleted = 5;
	    int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelcompleted, bonus);
        System.out.println("Yout high score is " + highScore);


        score = 10000;
	    levelcompleted = 8;
	    bonus = 200;

        highScore = calculateScore(gameOver, score, levelcompleted, bonus);
        System.out.println("Yout high score is " + highScore);


        displayHighScorePosition("John", 1);
    }

    public static int calculateScore(boolean gameOver, int score, int levelcompleted, int bonus){

        if (gameOver){
            int finalscore = score +(levelcompleted * bonus);
            finalscore += 2000;
//            System.out.println("Your final score was " + finalscore);

            return finalscore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String player_name, int position){
        System.out.println( player_name + " managed to get into position " +
                position + " on the high score table");

    }

    public static


}
