import java.util.ArrayList;
import java.util.HashMap;

public class dictionary {

    private HashMap<String, String> dictionary;

  public dictionary() {
    this.dictionary = new HashMap<String, String>();
  }

  public String translate(String word) {
    if(dictionary.get(word) != null) {
      return dictionary.get(word);
    } else {
      return null;
    }
  }

  public void add(String word, String translation) {
    dictionary.put(word, translation);
  }

  public int amountOfWords() {
    return dictionary.size();
  }

  public ArrayList<String> translationList() {
    ArrayList<String> translationList = new ArrayList<String>();

    for(String i: dictionary.keySet()) {
      translationList.add(i + " = " + dictionary.get(i));
    }

    return translationList;
  }
    
}
