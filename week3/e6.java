import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class e6 {
    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);
        ArrayList<String> words = new ArrayList<String>();

        while(true){

            System.out.println("Enter a word:");
            String word = reader.nextLine();

            if (words.contains(word)){
                System.out.println("You entered the word "+ word + " twice!");
                break;           
            }
            else {
                words.add(word);
            }
        
        }

        Collections.sort(words);
        System.out.println("The array in alphabetical order is: ");
        System.out.println(words);

        
    }
    
}
