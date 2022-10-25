package week2;

import java.util.Scanner;

public class e3 {
    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);

        int sum=0;
        int flag=1;

        while (flag != 0) {

            System.err.println("Enter a number:");
            int number = Integer.parseInt(reader.nextLine());
            flag = number;
            sum+=number;
            System.err.println("Sum now is: " + sum);
        }

        System.err.println("Sum in the end is: " + sum);

        reader.close();

        
    }
    
}
