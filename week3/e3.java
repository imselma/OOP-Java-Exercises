import java.util.Scanner;
public class e3 {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = reader.nextLine();
        int len = name.length();
        for (int i=0; i<len; i++){
            System.out.println((i+1)+". character:" + name.charAt(i));
        }

    }
    
}
