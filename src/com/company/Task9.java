package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменных tier, triangle и ввод с клавиатуры
        System.out.print("Введите количество ярусов: ");
        int tier = in.nextInt();
        System.out.print("Введите высоту треугольника: ");
        int triangle = in.nextInt();
        in.close();

        //Этот цикл for управляет кол-вом введённых ярусов
        for (int i = 1; i <= tier; ++i) {
            if (i > 1) {
                triangle += 1;//прибавляется к высоте +1, чтобы следующий ярус был шире предыдущего
            }
            //Этот цикл for рисует треугольник в зависимости от введённой высоты
            for (int a = 1; a <= triangle; ++a) { //Получаем строки
                for (int j = triangle; j > a; --j) {//Получаем пробелы
                    System.out.print(" ");
                }
                for (int j = 1; j < 2 * a; ++j) { // Выводим фигуру звездочками
                    System.out.print("*");
                }
                System.out.println();//Переходим на новую строку после прохода основного цикла for
            }
        }
    }
}


