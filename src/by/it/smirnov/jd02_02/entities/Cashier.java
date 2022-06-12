package by.it.smirnov.jd02_02.entities;

public class Cashier {

    public final String name;

    public Cashier(int number) {
        this.name = "Cashier №" + number;
    }

    @Override
    public String toString() {
        return "\t" + name;
    }
}
