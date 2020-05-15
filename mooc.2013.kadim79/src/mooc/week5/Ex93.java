package mooc.week5;

import java.util.ArrayList;
import java.util.Calendar;

public class Ex93 {

    public static void main(String[] args) {

        Person1 pekka = new Person1("Pekka", 15, 2, 1993);
        Person1 steve = new Person1("Steve", 1, 3, 1955);
        Person1 martin = new Person1("Martin",2,7,1983);

        System.out.println( steve.getName() + " age " + steve.age() + " years");
        System.out.println( pekka.getName() + " age " + pekka.age() + " years");

        pekka.olderThen(steve);
        steve.olderThen(martin);
        martin.olderThen(pekka);

        ArrayList<Person1> personList = new ArrayList<>();
        personList.add(steve);
        personList.add(martin);
        personList.add(pekka);

        steve.olderThen(personList);

        Person1 today = new Person1("Today");

        System.out.println(today);

        today.olderThen(personList);
    }
}

class Person1 {

    private String name;
    private MyDate birthday;

    public Person1(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person1(String name) {
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE),
                Calendar.getInstance().get(Calendar.MONTH) + 1,
                Calendar.getInstance().get(Calendar.YEAR));
    }

    public int age() {

        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int year = Calendar.getInstance().get(Calendar.YEAR);

        if(month > birthday.getMonth() || month == birthday.getMonth() && day > birthday.getDay())
            return year - birthday.getYear();
        else
            return year - birthday.getYear()-1;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name +", born in "+ this.birthday + "!";
    }

    public boolean olderThen(Person1 compared){
        if(compared.age()>this.age())
        {
            System.out.println(compared.getName()+" is older then "+this.getName());
            return true;
        }

        else if(compared.age()==this.age())
        {
            System.out.println(compared.getName()+" has the same age as "+this.getName());
            return true;
        }

        System.out.println(this.getName()+" is older then "+ compared.getName());
        return false;
    }

    public void olderThen(ArrayList<Person1> list){

        for (Person1 person :list) {
            person.olderThen(this);
        }
    }
}

