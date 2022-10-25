package week2;

import java.util.Scanner;
import java.util.Random;

public class e8 {
   public static void main(String[] args) {

    Scanner reader = new Scanner (System.in);

    int number = drawNumber();
    //System.err.println(number);
    int numberOfGuesses=0;
    while (true) {
        
        System.err.println("Enter your guess:");
        int guess = Integer.parseInt(reader.nextLine());
        numberOfGuesses++;
   
        if (guess<number) {
          System.out.println("The number is greater! Number of guesses: " + numberOfGuesses);
        } 
        else if (guess > number) {
           System.err.println("Number is lesser! Number of guesses: " + numberOfGuesses);
        }
        else {
           System.err.println("Your guess is correct! Number of guesses: " + numberOfGuesses);
           break;
        }
    }

    
   }
   private static int drawNumber() {

     Random randomN= new Random();
     int randN = randomN.nextInt(101);

     return randN;
   }
    
}


