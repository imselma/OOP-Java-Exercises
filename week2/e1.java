package week2;

import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);
        String message = "This is a secret";
        String password = "java";
        while (true) {
            System.err.println("Enter the password:");
            String p1 = reader.nextLine();

            if (p1.equals(password)) {
                System.out.println("The secret is: " + message);
                break;
            }
            
            else {
                System.err.println("Wrong!");
            }

        }
        
        reader.close();
    }

    
}
