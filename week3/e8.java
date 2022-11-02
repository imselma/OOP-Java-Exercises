import java.util.Scanner;
public class e8 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = reader.nextLine();
        int len = word.length();
        char letter;
        String reversed = "";

        for (int i = (len-1); i>=0; i--){

            letter = word.charAt(i);
            reversed+=letter;
        }

        if( reversed.equals(word)){
            System.out.println("The word '"+ word +"' is a palindrome!");
        }
        else{
            System.out.println("The word '" + word+ "' is not a palindrome!");
        }
        
    }
    
}
