public class e2 {
    public static void main(String[] args) {

        int[] values={6,5,7,8,11};
        int result = indexOfTheSmallest(values);
        System.out.println("The index od the smallest value in array is: " + result);
     }
    public static int indexOfTheSmallest (int[] array){

        int smallest = array[0];
        int smallestIndex = 0;
        for(int i=1; i<array.length; i++){
            if(array[i]<smallest){
                smallest=array[i];
                smallestIndex=i;
            }
        }

        return smallestIndex;
    }
    
}
