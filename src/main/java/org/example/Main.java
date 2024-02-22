package org.example;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98; // килограмм
        double height = 1.87; //метров
        double index = service.calculate(weight, height); // должно получиться 28
        System.out.println((int) index);
    }
}