package week2;

import java.util.Scanner;

public class e4 {
    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);
        System.err.println("Enter the first number:");
        int first = Integer.parseInt(reader.nextLine());
        System.err.println("Enter the last number:");
        int last = Integer.parseInt(reader.nextLine());

        int flag=first;

        while (flag <= last) {

            System.err.println(first);
            first=first+1;
            flag++;

        }
        
        reader.close();
    }
    
}
