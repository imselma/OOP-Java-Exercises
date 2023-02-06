public class e6 {

    public static void printElegantly(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
          if(i == arr.length - 1) {
            System.out.println(arr[i]);
          } else {
            System.out.print(arr[i] + ", ");
          }
        }
      }
    
      public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        printElegantly(numbers);
      }
    
}
