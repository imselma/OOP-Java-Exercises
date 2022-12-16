import java.util.Scanner;
public class Shop {

    private StoreHouse store;
    private Scanner reader;

    public Shop ( StoreHouse store, Scanner reader){

        this.store=store;
        this.reader=reader;
    }

    //The method to deal with the customer in shop

    public void manage(String customer){
        ShoppingBasket basket = new ShoppingBasket();
        
        System.out.println("Welcome to our shop " + customer);
        System.out.println("Below is our sale offer:");

        for(String product : store.products()){
            System.out.println(product);
        }

        while(true){
            System.out.println("What do you want to buy, press enter to pay!");
            String product = reader.nextLine();
            if(product.isEmpty()){

                break;
            }
            else{
            
                basket.add(product,1,3);

                int productsStock = this.store.stock(product);
                productsStock--;
            
            }


        }
        System.out.println("Your purchase are:");
        basket.print();
        System.out.println("Basket price: " + basket.price());
    }

}
