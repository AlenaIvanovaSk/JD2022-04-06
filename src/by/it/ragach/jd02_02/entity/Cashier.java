package by.it.ragach.jd02_02.entity;

public class Cashier {
    public final String name;

    public double revenue = 0.0;

    public Cashier(int number) {
        this.name = "Cashier №" + number;
    }

    @Override
    public String toString() {
        return "\t" + name;
    }
}
