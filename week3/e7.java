import java.util.ArrayList;
public class e7 {
    public static void main(String[] args) {

        ArrayList<String> elements = new ArrayList<String>();

        elements.add("Hello");
        elements.add("Moi");
        elements.add("Benvenuto!");
        elements.add("badger badger badger badger");

        System.out.println(lengths(elements));
    
    }

    public static ArrayList<Integer> lengths (ArrayList<String> list){

        ArrayList<Integer> length = new ArrayList<Integer>();
        for (int i = 0; i<list.size(); i++){
            int len = (list.get(i).length());
            length.add(len);
        }
        
        return length;

    }
    
}
