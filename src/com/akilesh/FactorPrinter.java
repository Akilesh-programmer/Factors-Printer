package com.akilesh;

public class FactorPrinter {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int divisor = 0;
        while (divisor <= number) {
            divisor++;
            if (number % divisor == 0) {
                System.out.println(divisor);
            }
        }
    }
}
