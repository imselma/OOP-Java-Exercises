import java.util.Arrays;
public class BinarySerach {
    public boolean search(int[] array, int number) {
        int beginning = 0;
        int end = array.length - 1;
        boolean result = false;
    
        while(beginning <= end) {
          int middle = (beginning + end) / 2;
    
          if(number > array[middle]) {
            beginning = middle + 1;
          } else if(number < array[middle]) {
            end = middle - 1;
          } else {
            result = true;
            break;
          }
        }
        return result;
      }
}
