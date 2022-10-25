package week2;

import java.util.Scanner;

public class e5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int i=0;
        int sum=0;
        while (i<=n) {

            int power = (int)Math.pow(2,i);
            sum=sum+power;
            i++;
        }
        System.err.println("The sum is: " + sum);
        reader.close();
        
    }
    
}
