package mooc.week6.ex_103_pack;
class Bird{

    protected String name;
    protected String latinName;
    protected int observation;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    @Override
    public String toString() {

        if(observation==1)
        {
            return name + " (" + latinName + ") : "+ observation+
                    " observation";
        }

        return name + " (" + latinName + ") : " + observation +
                " observations";
    }
}
