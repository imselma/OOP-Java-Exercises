import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

    PromissoryNote mattisNote = new PromissoryNote();
    
    mattisNote.setLoan("Arto", 51.5);
    mattisNote.setLoan("Mikale", 30.0);

    System.out.println(mattisNote.howMuchIsDept("Arto"));
    System.out.println(mattisNote.howMuchIsDept("Joel"));

    dictionary dictionary = new dictionary();
    dictionary.add("apina", "monkey");
    dictionary.add("banaani", "banana");
    System.out.println(dictionary.amountOfWords());


    dictionary.add("cembalo", "harpsichord");
    System.out.println(dictionary.amountOfWords());

    dictionary.add("apina", "monkey");
    dictionary.add("banaani", "banana");
    dictionary.add("cembalo", "harpsichord");


    ArrayList<String> translations = dictionary.translationList();
    for(String translation: translations) {
        System.out.println(translation);
    }


  }
        
}
    

