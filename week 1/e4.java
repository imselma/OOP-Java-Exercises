import java.util.Scanner;
public class e4 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number:");
        int numberOne = Integer.parseInt(reader.nextLine());
        int numberTwo = Integer.parseInt(reader.nextLine());

        System.out.println("Sum of two numbers:"+ (numberOne + numberTwo));
        reader.close();
    }
    
}
