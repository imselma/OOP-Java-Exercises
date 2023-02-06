public class e3 {
    public static void main(String[] args) {

        int[] values={-1,6,9,8,12};
        System.out.println("The index od the smallest value in array is: " + indexOfTheSmallest(values, 1));
        System.out.println("The index od the smallest value in array is: " + indexOfTheSmallest(values, 2));
        System.out.println("The index od the smallest value in array is: " + indexOfTheSmallest(values, 4));
     }
    public static int indexOfTheSmallest (int[] array, int startingIndex){

        int smallest = array[startingIndex];
        int smallestIndex = startingIndex;
        for(int i=startingIndex+1; i<array.length; i++){
            if(array[i]<smallest){
                smallest=array[i];
                smallestIndex=i;
            }
        }

        return smallestIndex;
    }
    
}
