import java.util.Scanner;
public class e5 {
    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);
        System.out.println("Enter first word: ");
        String word1 = reader.nextLine();
        System.out.println("Enter second word: ");
        String word2 = reader.nextLine();
        if(word1.indexOf(word2)==-1){
            System.out.println("The word '" + word2 + "' is not found in word '" + word1+ "'.");
        }
        else{
            System.out.println("The word '" + word2 + "' is found in word '" + word1+ "'.");
        }
    }
    
}
