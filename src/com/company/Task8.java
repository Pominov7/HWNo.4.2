package com.company;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//создали сканер
        // Объявление переменой num и ввод с клавиатуры
        System.out.print("Введите число: ");
        int num = in.nextInt();
        in.close();

        // С помощью  1-го цикла for определяем из скольки цифр состоит введенное число
        int res = 0; // здесь накапливается ко-во цифр
        int sum = 0; // здесь накапливается сумма цифр
        for (int i = 1; num / i >= 1; i *= 10) {
            res++;
        }
        System.out.println("Количество цифр в этом числе: " + res);

        // С помощью  2-го цикла for перебираем каждую цифру введенного числа
        for (int i; num > 0; i++) {
            i = num % 10; //получаем в остатке от деления последнюю цифру введенного числа
            sum += i; // прибавляем к полученному остатку от деления i
            num /= 10; //последняя цифра удаляется из num после деления на 10.
        }
        System.out.println("Сумма цифр в этом числе: " + sum);
    }
}
