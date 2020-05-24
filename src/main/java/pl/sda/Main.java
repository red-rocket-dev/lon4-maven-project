package pl.sda;


import org.apache.commons.math3.analysis.function.Abs;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double value = new Abs().value(-6.0);

        System.out.println(value);

    }
}
