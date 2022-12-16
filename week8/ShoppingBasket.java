import java.util.HashMap;
public class ShoppingBasket {

    private HashMap<String, Purchase> basket;

    public ShoppingBasket (){

        this.basket= new HashMap<String, Purchase>();
    }

    public void add(String product, int amount, int price){

        Purchase purchase = new Purchase(product,amount,price);
        if(this.basket.containsKey(product)){

            this.basket.get(product).increaseAmount();

        }
        else{
            this.basket.put(product,purchase);
        }
         
    }

    public int price(){

        int totalPrice=0;
        for (Purchase value:this.basket.values()){
            totalPrice+= value.price();
        }

        return totalPrice;

    }

    public void print(){
        for(Purchase values : this.basket.values()){
            System.out.println(values);
        }
    }
    
}
