package com.homework4;

public class Main {

    public static void main(String[] args) {
        float sum = 0;
        int count = 0;
        for (int i=1; i<=100; i++) {
            sum = sum + i;
            count++;
        }
        float avg;
        avg = sum/count;
        System.out.println("Среднее значение суммы чисел от 1 до 100 равно " + avg);
    }
}

Output:
Среднее значение суммы чисел от 1 до 100 равно 50.5
