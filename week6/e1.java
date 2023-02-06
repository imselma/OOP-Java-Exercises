public class e1 {
    public static void main(String[] args) {

        int[] values = {6,5,8,7,10};

        int result = smallest(values);
        System.out.println("The smallest number in array is: " + result);

    }

    public static int smallest(int[] array) {

        int min = array[0];
        for(int i=1;i<array.length;i++){

            if(array[i]<min){
                min=array[i];
            }
        }

        return min;
    
    }
}
