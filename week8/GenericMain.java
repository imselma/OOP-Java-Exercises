public class GenericMain {
    public static void main(String[] args) {

        GenericClass firstValue = new GenericClass<Integer,String>(10, "Hello world");

        System.out.println(firstValue);
        
    }
    
}
