import java.util.ArrayList;
public class e1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(5);
        list1.add(6);
        list1.add(7);
        list2.add(1);
        list2.add(5);
        list2.add(4);
        
        System.out.println("The first list is: " + list1);
        System.out.println("The second list is: " + list2);

        combine(list1,list2);
    }

    public static void combine (ArrayList<Integer> list1, ArrayList<Integer> list2){

        list1.addAll(list2);
        System.out.println("The list after concatenation: " + list1);
    }


    
}
