package mooc.week5;

public class Ex85 {

    public static void main(String[] args) {
        Reformatory eastHelsinkiReformatory = new Reformatory();

        Person brian = new Person("Brian", 1, 110, 7);
        Person pekka = new Person("Pekka", 33, 176, 85);

        System.out.println(brian.getName() + " weight: " +
                eastHelsinkiReformatory.weight(brian) + " kilos");
        System.out.println(pekka.getName() + " weight: " +
                eastHelsinkiReformatory.weight(pekka) + " kilos");

        eastHelsinkiReformatory.feed(brian);
        eastHelsinkiReformatory.feed(brian);
        eastHelsinkiReformatory.feed(brian);

        System.out.println("");

        System.out.println(brian.getName() + " weight: " +
                eastHelsinkiReformatory.weight(brian) + " kilos");
        System.out.println(pekka.getName() + " weight: " +
                eastHelsinkiReformatory.weight(pekka) + " kilos");
        System.out.println();

        Reformatory eastHelsinkiReformatory1 = new Reformatory();

        Person brian1 = new Person("Brian", 1, 110, 7);
        Person pekka1 = new Person("Pekka", 33, 176, 85);

        System.out.println("total weights measured " +
                eastHelsinkiReformatory1.totalWeightsMeasured());

        eastHelsinkiReformatory1.weight(brian1);
        eastHelsinkiReformatory1.weight(pekka1);

        System.out.println("total weights measured "+
                eastHelsinkiReformatory1.totalWeightsMeasured());

        eastHelsinkiReformatory1.weight(brian1);
        eastHelsinkiReformatory1.weight(brian1);
        eastHelsinkiReformatory1.weight(brian1);
        eastHelsinkiReformatory1.weight(brian1);

        System.out.println("total weights measured "+
                eastHelsinkiReformatory1.totalWeightsMeasured());
    }

}

class Reformatory{

    private int i;

    public int weight(Person person) {
        // returns the weight of the parameter
        i++;
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }

    public int totalWeightsMeasured(){
        return i;
    }
}


class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name,int age,int height,int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void printPerson() {
        System.out.println(this.name + " I am " + this.age + " years old");
    }

    public void becomeOlder() {
        this.age++;
    }

    public boolean adult(){
        return this.age >= 18;
    }

    public double weightIndex(){
        double heightInMeters = this.height/100.0;

        return this.weight / (heightInMeters*heightInMeters);
    }

    public String toString(){
        return this.name + " I am " + this.age + " years old, my weight index is " + this.weightIndex();
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }
}
