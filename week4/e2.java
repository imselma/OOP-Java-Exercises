import java.util.Random;
public class e2 {
    public static void main(String[] args) {

        Dice dice = new Dice(6); 
        int i=0;
        while (i<20){
            System.out.println(dice.roll());
            i++;
        }
      
    }


}
