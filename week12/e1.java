import java.util.Scanner;

public class e1 {

    public static void main(String[] args){

    System.out.print("Enter a string: ");
            Scanner reader = new Scanner(System.in);
            String word = reader.nextLine();
            isAWeekDay(word);
        System.out.println("\n");

        System.out.print("Enter a string: ");
        Scanner reader1 = new Scanner(System.in);
        String word1 = reader.nextLine();
         allVowels(word1);

        System.out.print("Enter a string: ");
        Scanner reader2 = new Scanner(System.in);
        String word2 = reader.nextLine();
        clockTime(word2);
    }

    public static boolean isAWeekDay(String string){
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")){
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("Wrong!");
            return false;
        }
    }
 
    public static boolean allVowels(String string){
         if (string.matches("(a|e|i|o|u)*")){
             System.out.println("Correct!");
             return true;
         } else {
             System.out.println("Wrong!");
             return false;
         }
     }
 
     public static boolean clockTime(String string){
         if(string.matches("[0-2][0-9]:[0-5][0-9]:[0-5][0-9]")){
             System.out.println("Correct!");
             return true;
         } else {
             System.out.println("Wrong!");
             return false;
         }
     }

}
      
    