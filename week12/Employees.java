import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Employees{

    private ArrayList<Person> employees;

  public Employees() {
    this.employees = new ArrayList<Person>();
  }

  public void add(Person person) {
    this.employees.add(person);
  }

  public void add(List<Person> peopleArray) {
    for(Person peorson: peopleArray) {
      this.employees.add(peorson);
    }
  }

  public void print(Education education) {
    Iterator<Person> iterator = employees.iterator();
    
    while(iterator.hasNext()) {
      Person nextPerson = iterator.next();

      if(nextPerson.getEducation() == education) {
        System.out.println(iterator.next());
      }
    }
  }

  public void fire(Education education) {
    Iterator<Person> iterator = employees.iterator();

    while(iterator.hasNext()) {
      Person nextPerson = iterator.next();

      if(nextPerson.getEducation() == education) {
        employees.remove(iterator.next());
      }
    }
  }
}
