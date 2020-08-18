package com.homework1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Метод if");
        System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        if (i == 1) {
            System.out.println("Вы ввели 1");
        } else if (i == 2) {
            System.out.println("Вы ввели 2");
        } else if (i == 3) {
            System.out.println("Вы ввели 3");
        } else {
            System.out.println("Вы не ввели 1,2 или 3");
        }
        System.out.println("Метод switch");
        System.out.println("Введите число 1, 2 или 3: ");
        i = inputFigure.nextInt();
        switch (i) {
            case 1:
                System.out.println("Вы ввели 1");
                break;
            case 2:
                System.out.println("Вы ввели 2");
                break;
            case 3:
                System.out.println("Вы ввели 3");
                break;
            default:
                System.out.println("Вы не ввели 1,2 или 3");
                break;
        }
    }
}

Output:
Метод if
Введите число 1, 2 или 3: 
5
Вы не ввели 1,2 или 3
Метод switch
Введите число 1, 2 или 3: 
3
Вы ввели 3
