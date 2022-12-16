public class BoxMain {
    public static void main(String[] args) {

        Book book1 = new Book("Writer 1", "Name 1", 2);
        Book book2 = new Book("Writer 2", "Name 2", 1);
        Book book3 = new Book("Writer 3", "Name 3", 0.7);

        CD cd1 = new CD("Artist1","Title1",2020);
        CD cd2 = new CD("Artist2","Title2",2021);
        CD cd3 = new CD("Artist3","Title3",2022);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);

        Box box = new Box(10);
        box.add(book1);
        box.add(book2);
        box.add(book3);

        box.add(cd1);
        box.add(cd2);
        box.add(cd3);

        System.out.println(box);
    }
    
}
