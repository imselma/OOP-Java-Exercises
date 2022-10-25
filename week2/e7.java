package week2;

public class e7 {

    public static void main(String[] args) {

        printStars(5);
        printStars(3);
        printStars(9);
    }

    private static void printStars( int amount) {

        int i=0;
        while (i<amount){
            System.out.print("*");
            i++;
        }
        System.err.println(" ");
        
    }
    
    
}

