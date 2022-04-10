package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Введите размер: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.close();

        //Часть.1  Выводим заполненный ромб верхнюю часть (верхний треугольник):
        for (int i = 1; i < size; ++i) { //Получаем строки
            for (int j = size; j > i; --j) { //Получаем пробелы
                System.out.print(" ");
            }
            for (int j = 1; j < 2 * i; ++j) { // Выводим фигуру звездочками
                System.out.print("*");
            }
            System.out.println();//Переходим на новую строку после прохода основного цикла for
        }
        //Выводим заполненный ромб нижнюю часть (нижний треугольник):
        for (int i = size; i >= 1; --i) { //Получаем строки

            for (int j = size; j > i; --j) { //Получаем пробелы
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; ++j) { // Выводим фигуру звездочками
                System.out.print("*");
            }
            System.out.println();//Переходим на новую строку после прохода основного цикла for
        }
        System.out.print("\n"); //Ставим пробел между заполненным и пустым треугольником

        //Часть.2  Выводим пустой ромб верхнюю часть (верхний треугольник):
        for (int i = 1; i <= size; i++) { //Получаем строки
            for (int j = 1; j <= size - i; j++) { // Получаем пробелы
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // Общее количество звездочек и пробелов
                if (i == 1) { // Получаем звездочки 1-й и последней строк
                    System.out.print("*");
                } else if (j == 1 || j == 2 * i - 1) { //Получаем звездочки 2-й и последущих строк
                    System.out.print("*");
                } else { // Получаем пробелы 2-й  и последущих строк (пустая середина)
                    System.out.print(" ");
                }
            }
            System.out.println(); //Переходим на новую строку после прохода основного цикла for
        }
        //Выводим пустой ромб нижнюю часть (нижний треугольник):
        for (int i = 1; i < size; i++) { //Получаем строки
            for (int j = 1; j <= i; j++) { // Получаем пробелы
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (size - i) - 1; j++) { // Общее количество звездочек и пробелов
                if (j == 1 || j == 2 * (size - i) - 1) {  // Получаем звездочки 1-й и последней строк
                    System.out.print("*");
                } else { // Получаем пробелы 2-й  и последущих строк (пустая середина)
                    System.out.print(" ");
                }
            }
            System.out.println(); //Переходим на новую строку после прохода основного цикла for
        }
    }
}