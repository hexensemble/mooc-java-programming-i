
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (persons.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }

        Person shortestPerson = persons.get(0);

        for (Person person : persons) {
            if (shortestPerson.getHeight() > person.getHeight()) {
                shortestPerson = person;
            }
        }

        return shortestPerson;
    }

    public Person take() {
        Person shortestPerson = shortest();

        if (persons.isEmpty()) {
            return null;
        }

        for (Person person : persons) {
            if (person.equals(shortestPerson)) {
                persons.remove(person);
                break;
            }
        }

        return shortestPerson;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

}
