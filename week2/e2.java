package week2;

import java.util.Scanner;

public class e2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);

        int sum = 0;
        int read;

        System.err.println("Enter the first number:");
        read = Integer.parseInt(reader.nextLine());

        sum+=read;

        System.err.println("Enter the second number:");
        read = Integer.parseInt(reader.nextLine());

        sum+=read;

        System.err.println("Enter the third number:");
        read = Integer.parseInt(reader.nextLine());

        sum+=read;

        System.out.println("The sum of entered three numbers is: " + sum);

        reader.close();

    }
    
}
