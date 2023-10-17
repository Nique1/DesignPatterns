package package1.singleton;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    //Singleton implementation

    //instance of this class
    private static GuessGame guessGame = new GuessGame();

    Random random = new Random();
    private int score = 0;
    Scanner scanner = new Scanner(System.in);

    //private constructor
    private GuessGame() {

    }

    public static GuessGame getInstance() {
        return guessGame;
    }

    public int getScore(){
        return score;
    }


    public void play() {
        for(int i =0; i< 10; i++){
            int number =  random.nextInt(10);
            System.out.println("Guess number");
            int guess = scanner.nextInt();

            if(number==guess){
                System.out.println("Correct!");
                score++;
            }else{
                System.out.println("Sorry, It was: " + number);
            }
        }
        System.out.println("Your score is: " +score);

    }


}
