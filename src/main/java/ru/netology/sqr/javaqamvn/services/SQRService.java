package ru.netology.sqr.javaqamvn.services;

public class SQRService {

    public int calcSQR(int minValue, int maxValue) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minValue) {
                if (i * i <= maxValue) {
                    counter = counter + 1;
                }
            }
        }
        System.out.println("counter " + counter);
        return counter;
    }
}
