import java.util.Scanner;
public class e6 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type first number:");
        int numberOne = Integer.parseInt(reader.nextLine());
        System.out.println("Type second number:");
        int numberTwo = Integer.parseInt(reader.nextLine());

        if (numberOne == numberTwo){
            System.out.println("Numbers are equal.");
        } else if (numberOne > numberTwo) {
            System.out.println("Greatest number is " + numberOne);
        } else {
            System.out.println("Greatest number is " + numberTwo);
        }

        reader.close();


    }
}
