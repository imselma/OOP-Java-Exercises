import java.util.Scanner;
public class e2 {
    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);
        
        System.out.println("Enter name:");
        String name = reader.nextLine();
        int numberOfCharacters = name.length();
        System.out.println("The number of character in name " + name + " is: "+ numberOfCharacters);

     }
 
}
