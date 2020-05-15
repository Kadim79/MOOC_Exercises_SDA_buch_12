package mooc.week6;

import java.util.ArrayList;

public class Ex94 {

    public static void main(String[] args) {

        Person pekka = new Person("Pekka Mikkola", "040-123123");

        System.out.println(pekka.getName());
        System.out.println(pekka.getNumber());

        System.out.println(pekka);
        pekka.changeNumber("050-333444");
        System.out.println(pekka);

        Phonebook phonebook = new Phonebook();
        phonebook.add("Pekka Mikkola","040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");
        phonebook.printAll();

        String number = phonebook.searchNumber("Pekka Mikkola");
        number = phonebook.searchNumber("Martti Tienari");
    }
}


class Person{

    private String name;
    private String number;

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void changeNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return name + "  Number= " + number;
    }
}

class Phonebook{

    ArrayList<Person> list;

    public Phonebook() {
        this.list = new ArrayList<>();
    }

    public void printAll(){
        System.out.println("----------------------------------");
        for (Person person : list ) {
            System.out.println(person);
        }
    }

    public void add(String name, String number){
        Person newPerson = new Person(name,number);
        list.add(newPerson);
    }

    public String searchNumber(String name){

        for (Person person:list) {
            if(person.getName().equalsIgnoreCase(name)) {
                System.out.println("Your name is on the phonebook -> " + person.toString());
                return "Number from phonebook : " + person.getNumber();
            }
        }
        return "This name -> " + name + " is not on the phonebook!";
    }
}
