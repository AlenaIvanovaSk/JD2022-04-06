package by.it.kameisha.jd02_03.entity;

public class Pensioner extends Customer {
    private final String name;

    public Pensioner(long number) {
        super(number);
        name = "Pensioner №" + number;
    }

    @Override
    public double getTimeoutFactor() {
        return 1.5;
    }

    public String toString() {
        return name;
    }
}
