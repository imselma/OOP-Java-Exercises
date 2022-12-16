import java.util.Scanner;
public class MainOnlineShop {
    public static void main(String[] args) {

        StoreHouse store = new StoreHouse();

       // store.addProduct("milk", 3, 10);
       // store.addProduct("coffe", 5, 7);

       // System.out.println("Prices:");;
       // System.out.println("Milk:" + store.price("milk"));
       // System.out.println("Coffe:" + store.price("coffe"));
       // System.out.println("Sugar:" + store.price("sugar"));

       //store.addProduct("coffee", 5, 1);
       //store.addProduct("milk", 5, 1);
       //store.addProduct("chocolate", 5, 1);
       //store.addProduct("kahva", 5, 1);

       //System.out.println("stocks");
       //System.out.println("coffee: " + store.stock("coffee"));
       //System.out.println("sugar: " + store.stock("sugar"));

       //System.out.println("we take a coffee: " + store.take("coffee"));
       //System.out.println("we take a coffee: " + store.take("coffee"));
       //System.out.println("we take sugar: " + store.take("sugar"));

       //System.out.println("stocks");
       //System.out.println("coffee: " + store.stock("coffee"));
       //System.out.println("sugar: " + store.stock("sugar"));

       //System.out.println("Products:");
       //store.products();

       //Purchase purchase = new Purchase("milk", 4, 2);
       //System.out.println("Total pricae of purchase containing four milks is: "+ purchase.price());

       //System.out.println(purchase);
       //purchase.increaseAmount();
       //System.out.println(purchase);

       ShoppingBasket basket = new ShoppingBasket();

       basket.add("milk", 1, 3);
       basket.add("buttermilk", 1, 2);
       basket.add("cheese", 1, 5);


      // basket.add("computer", 1, 899);
      // System.out.println("New basket price: " + basket.price());

       basket.print();
       System.out.println("Basket price: " + basket.price());

       basket.add("milk", 1, 3);
       basket.print();
       System.out.println("New basket price: " + basket.price());


       basket.add("milk", 1, 3);
       basket.print();
       System.out.println("New basket price: " + basket.price());

       Shop shop = new Shop(store, new Scanner(System.in));
       shop.manage("Pekka");






    
    }
    
}
