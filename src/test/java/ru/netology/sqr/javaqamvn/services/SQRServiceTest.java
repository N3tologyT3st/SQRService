package ru.netology.sqr.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "3, 200, 300",
//            "0, 10, 99",
//            "1, 100, 100",
//            "90, 100, 9801",
//            "90, 100, 10000"
//    })
    @CsvFileSource(files="src/test/resources/SQR.csv")
    public void calcSQR(int expected, int minValue, int maxValue) {
        SQRService service = new SQRService();

        //int expected = 3;
        int actual = service.calcSQR(minValue,maxValue);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//   void shouldCalculateNumberOfSquaresExceedingMinimumLimit() {
//        SQRService service = new SQRService();
//
//        int expected = 0;
//        int minValue = 10;
//        int maxValue = 99;
//
//        int actual = service.calcSQR(minValue, maxValue);
//
//        Assertions.assertEquals(expected, actual);
//
//    }

//    @Test
//    void shouldCalculateNumberOfSquaresMinimumLimit() {
//        SQRService service = new SQRService();
//
//        int expected = 1;
//        int minValue = 100;
//        int maxValue = 100;
//
//        int actual = service.calcSQR(minValue, maxValue);
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//    void shouldCalculateNumberOfSquaresMaximumLimit() {
//        SQRService service = new SQRService();
//
//        int expected = 90;
//        int minValue = 100;
//        int maxValue = 9801;
//
//        int actual = service.calcSQR(minValue, maxValue);
//
//        Assertions.assertEquals(expected, actual);
//    }

//    @Test
//    void shouldCalculateNumberOfSquaresExceedingMaximumLimit() {
//        SQRService service = new SQRService();
//
//        int expected = 90;
//        int minValue = 100;
//        int maxValue = 10000;
//
//        int actual = service.calcSQR(minValue, maxValue);
//
//        Assertions.assertEquals(expected, actual);
}