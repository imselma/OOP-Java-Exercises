import java.util.Scanner;
public class e5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number:");
        int numberOne = Integer.parseInt(reader.nextLine());
        if (numberOne > 0) {

            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is negative.");
        }
        
    }
    
}
