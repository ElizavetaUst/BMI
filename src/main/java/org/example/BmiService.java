package org.example;

public class BmiService {
    public int calculate(double weight, double height) {
        double index;
        double bmi;
        bmi = weight / (height * height);
        index = (int) bmi;

        return (int) index;
    }
}
