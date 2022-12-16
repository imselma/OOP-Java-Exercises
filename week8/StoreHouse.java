import java.util.HashMap;
import java.util.HashSet;
public class StoreHouse{

    private HashMap<String,Integer> productsPrice;
    private HashMap<String,Integer> productsStock;


    public StoreHouse(){
         this.productsPrice = new HashMap<String,Integer>();
         this.productsStock = new HashMap<String,Integer>();
    }

    public void addProduct(String product, int price, int stock){

        this.productsPrice.put(product, price);
        this.productsStock.put(product, stock);
    }

    public int price(String product){

        if(this.productsPrice.containsKey(product)){
                return this.productsPrice.get(product);
        }
        else{
                return -99;
        }
    }

    public int stock(String product){
        if(this.productsStock.containsKey(product)){

            return this.productsStock.get(product);
        }

        return 0;
     
    }

    public boolean take(String product){
        if (this.productsStock.containsKey(product)){
            if (this.productsStock.get(product)==0){
                return false;
            }
            else{

                this.productsStock.put(product, this.productsStock.get(product)-1);
                return true;
            }

        }

        else{
            return false;
        }
    }

    public HashSet<String> products(){

        HashSet<String> set = new HashSet<String>();
        for (String key : this.productsPrice.keySet()){

            set.add(key);
        }

        return set;
    }
}

