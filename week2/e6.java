package week2;

import java.util.Scanner;

public class e6 {
    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);
        System.err.println("How many times should the text be printed? Enter the number:");
        int number = Integer.parseInt(reader.nextLine());
        int i = 0;
        while(i<number) {

            printText();
            i++;

        }

        reader.close();
        
    }

    public static void printText() {

        System.err.println("In the beginning there were the swamp, the hoe and Java.");
        
    }
    
}
