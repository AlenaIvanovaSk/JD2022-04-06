package by.it.ragach.jd02_01;

public class Customer {
    public final String name;

    public Customer(long number){ this.name = "Customer №"+number;
    }
    @Override
    public String toString() { return name;
    }

    public int speedOfOperation (int millis){
        return millis;
    }

    public int quantityOfGoods(){
        return RandomGenerator.get(2,5);
    }



}
