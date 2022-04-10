package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменой size и ввод с клавиатуры
        System.out.print("Введите высоту параллелограмма: ");
        int size = in.nextInt();
        in.close();
        //1.Параллелограмм заполненный
        for (int i = 1; i <= size; i++) { //Получаем строки
            for (int j = size; j > i; j--) { //Получаем пробелы
                System.out.print(" ");
            }
            for (int j = size * 4; j > 0; j--) { //Выводим фигуру звездочками
                System.out.print("*");
            }
            System.out.println();//Переходим на новую строку после прохода основного цикла for
        }
        System.out.print("\n"); //Ставим пробел между заполненным и пустым параллелограмма
        //2.Параллелограмм пустой
        for (int i = 1; i <= size; i++) { //Получаем строки
            for (int j = size; j > i; j--) { //Получаем пробелы
                System.out.print(" ");
            }
            for (int j = size * 4; j > 0; j--) { // Общее количество звездочек и пробелов
                if (i == 1 || i == size) { // Получаем звездочки 1-й и последней строк
                    System.out.print("*");
                } else if (j / size == 4 || j == 1) { //Получаем звездочки 2-й и последущих строк
                    System.out.print("*");
                } else { // Получаем пробелы 2-й  и последущих строк
                    System.out.print(" ");
                }
            }
            System.out.println(); //Переходим на новую строку после прохода основного цикла for
        }
    }
}