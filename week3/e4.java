import java.util.Scanner;
public class e4 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = reader.nextLine();
        int len =name.length();
        char letter;
        String reverseString= " ";
        for(int i = (len-1); i>=0; i--){
            letter = name.charAt(i);
            reverseString += letter;
        }
        System.out.println("The name "+ name + " in reverse is:" + reverseString);
    
    }
    
}
