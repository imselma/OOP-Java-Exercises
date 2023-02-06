import java.util.Arrays;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);
    
        System.out.println("The array: " + Arrays.toString(array));
        System.out.print("Enter number: ");
        int num = Integer.parseInt(reader.nextLine());
    
        BinarySerach searcer = new BinarySerach();
        boolean result = searcer.search(array, num);
        
        if(result) {
          System.out.println("The number " + num + " is in the array");
        } else {
          System.out.println("The number " + num + " is not in the array");
        }
    
      }
}
    
