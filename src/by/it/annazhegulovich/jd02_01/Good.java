package by.it.annazhegulovich.jd02_01;

public class Good {

    public final String name;

    public Good(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Good name " + name;
    }

    public Good(){
        name = "unknown good";
    }
}
