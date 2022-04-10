package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменой triangle и ввод с клавиатуры
        System.out.print("Введите высоту треугольника: ");
        int triangle = in.nextInt();
        in.close();
        //1.Прямоугольный треугольник, прямым углом вниз-вправо: заполненный
        for (int i = 0; i <= triangle; i++) { //Получаем строки
            for (int j = triangle; j > i; j--) { //Получаем пробелы
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) { //Выводим фигуру звездочками
                System.out.print("*");
            }
            System.out.println();//Переходим на новую строку после прохода основного цикла for
        }
        //2.Прямоугольный треугольник, прямым углом вниз-вправо: пустой
        for (int i = 0; i <= triangle; i++) { //Получаем строки
            for (int j = triangle; j > i; j--) { //Получаем пробелы
                System.out.print(" ");
            }
            for (int j = 0; j <= i - 1; j++) { // Общее количество звездочек и пробелов
                if (i == triangle) { // Получаем звездочки 1-й и последней строк
                    System.out.print("*");
                } else if (j == 0 || j == i - 1) { //Получаем звездочки 2-й и последущих строк
                    System.out.print("*");
                } else { // Получаем пробелы 2-й  и последущих строк
                    System.out.print(" ");
                }
            }
            System.out.println(); //Переходим на новую строку после прохода основного цикла for
        }
    }
}