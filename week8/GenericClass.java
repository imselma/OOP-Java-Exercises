public class GenericClass<K,V> {

    private K value1;
    private V value2;

    public GenericClass (K value1, V value2){
        this.value1=value1;
        this.value2=value2;
    }

    public K getValue1() {

        return this.value1;
        
    }

    public V getValue2() {

        return this.value2;
        
    }

    public String toString(){
        return this.value1.getClass().getSimpleName() + " value: " + this.value1 + "\n" + this.value2.getClass().getSimpleName() + " value: " + this.value2;
    }

}
