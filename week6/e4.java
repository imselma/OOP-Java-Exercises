import java.util.Arrays;
public class e4 {
    public static void main(String[] args) {

        int[] array = {3,2,5,4,8};
        System.out.println(Arrays.toString(array));
        swap(array,1,0);
        System.out.println(Arrays.toString(array));
        swap(array, 0, 3);
        System.out.println(Arrays.toString(array));
    }
    
    public static void swap (int[] array, int index1, int index2){

        int i = array[index1];
        array[index1] = array[index2];
        array[index2] = i;
    }
}
