package homework_3;

import java.util.Scanner;

public class HmOperators {

    public static void main(String[] args) {
        row();
        //Управляющие конструкции
        //Задание 1 - Написать программу для вывода названия поры года по номеру
        //месяца. При решении используйте оператор switch-case.
        timeOfYear();

        //Задание 2 - Написать программу для вывода названия поры года по номеру
        //месяца. При решении используйте оператор if-else-if.
        timeOfYearIfElse();

        //Задание 3 - Напишите программу, которая будет принимать на вход число и на
        //выход будет выводить сообщение четное число или нет.
        //Для определения четности числа используйте операцию получения
        //остатка от деления - операция выглядит так: '% 2').
        evenOdd();

        //Задание 4 - Для введенного числа t (температура на улице) вывести
        //Если t>–5, то вывести «Тепло».
        //Если –5>= t > –20, то вывести «Нормально».
        //Если –20>= t, то вывести «Холодно».
        temperature();

        //Задание 5 - По введенному номеру определить цвет радуги (1 –
        //красный, 4 – зеленый и т. д.).
        color();

        //Циклы
        //Задание 1 - При помощи цикла for вывести на экран нечетные числа от 1 до 99
        //При решении используйте операцию инкремента (++).
        oddNumbers();

        //Задание 2 - Необходимо вывести на экран числа от 5 до 1
        //При решении используйте операцию декремента (--).
        fiveToOne();

        //Задание 3 - Напишите программу, где пользователь вводит любое целое
        //положительное число. А программа суммирует все числа от 1 до
        //введенного пользователем числа.
        //Для ввода числа воспользуйтесь классом Scanner.
        sumAllNum();

        //Задание 4 - Необходимо, чтоб программа выводила на экран вот такую
        //последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        //В решении используйте цикл while.
        sequence();

        //Задание 5 - Вывести 10 первых чисел последовательности 0, -5,-10,-15..
        firstTen();

        //Задание 6 - Составьте программу, выводящую на экран квадраты чисел от 10 до
        //20 включительно.
        square();

        //Дополнительные задания
        //Задание 1 - Выведите на экран первые 11 членов последовательности Фибоначчи.
        fibonacci();

        //Задание 2 - За каждый месяц банк начисляет к сумме вклада 7% от суммы.
        //Напишите программу, в которую пользователь вводит сумму вклада и
        //количество месяцев. А банк вычисляет конечную сумму вклада с учетом
        //начисления процентов за каждый месяц.
        //Для вычисления суммы с учетом процентов используйте цикл for. Пусть
        //сумма вклада будет представлять тип float.
        deposit();

        //Задание 4 - Напишите программу, которая выводит на консоль таблицу
        //умножения.
        mTable();
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

    public static void row() {
        System.out.println("*******************************************");

    }
    public static void timeOfYear() {

        System.out.print("Введите номер месяца: ");
        int month = input().nextInt();

        switch (month){
            case (12):
            case (1):
            case (2):
                System.out.println("Сейчас зима");
                break;

            case (3):
            case (4):
            case (5):
                System.out.println("Сейчас весна");
                break;

            case (6):
            case (7):
            case (8):
                System.out.println("Сейчас лето");
                break;

            case (9):
            case (10):
            case (11):
                System.out.println("Сейчас осень");
                break;

            default:
                System.out.println("Такого месяца нет");
        }
        row();
    }
    public static void timeOfYearIfElse(){
        System.out.print("Введите номер месяца: ");
        int month = input().nextInt();

        if (month == 12 || (0 < month && month <= 2)){
            System.out.println("Сейчас зима");
        } else if(3 <= month && month <= 5){
            System.out.println("Сейчас весна");
        } else if(6 <= month && month <= 8){
            System.out.println("Сейчас лето");
        } else if(9 <= month && month <= 11){
            System.out.println("Сейчас осень");
        } else {
            System.out.println("Такого месяца нет");
        }
        row();
    }
    public static void evenOdd(){
        System.out.print("Напишите число, чтобы узнать четное оно или нечетное: ");
        int num = input().nextInt();
        if(num % 2 == 0){
            System.out.println("Это число четное");
        } else {
            System.out.println("Это число нечетное");
        }
        row();
    }
    public static void temperature(){
        System.out.print("Введите температуру: ");
        int t = input().nextInt();

        if (t > -5){
            System.out.println("Тепло");
        } else if(-5 >= t && t > -20){
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
        row();
    }
    public static void color(){
        System.out.print("Введите номер цвета: ");
        int color = input().nextInt();

        switch (color){

            case (1):
                System.out.println("Красный");
                break;

            case (2):
                System.out.println("Оранжевый");
                break;

            case (3):
                System.out.println("Желтый");
                break;

            case (4):
                System.out.println("Зеленый");
                break;

            case (5):
                System.out.println("Голубой");
                break;

            case (6):
                System.out.println("Синий");
                break;

            case (7):
                System.out.println("Фиолетовый");
                break;

            default:
                System.out.println("Такого цвета нет");
        }
        row();
    }

    public static void oddNumbers() {
        for(int a = 1; a <= 99; a++){
            if(a % 2 != 0){
                System.out.print(a + " ");
            }
        }
        System.out.println();
        row();
    }
    public static void fiveToOne(){
        for (int a = 5; a > 0; a--){
            System.out.println(a);
        }
        row();
    }
    public static void sumAllNum(){
        System.out.print("Введите любое целое положительное число: ");
        int num = input().nextInt();
        int sum = 0;
        for (int a = 1; a <= num; a++){
            sum += a;
        }
        System.out.println("Сумма: " + sum);
        row();
    }
    public static void sequence(){
        int a = 7;
        while (a < 100){
            System.out.print(a + " ");
            a += 7;
        }
        System.out.println();
        row();
    }
    public static void firstTen(){
        int num = 0;
        for (int a = 1; a <= 10; a++){
            System.out.print(num + " ");
            num -= 5;
        }
        System.out.println();
        row();
    }
    public static void square(){
        for (int a = 10; a <= 20; a++){
            int num = a * a;
            System.out.print(num + " ");
        }
        System.out.println();
        row();
    }

    public static void fibonacci(){
        int f0 = 0;
        int f1 = 1;
        System.out.print(f0 + " " + f1 + " ");
        for (int a = 3; a <= 11; a++){
            int b = f1;
            f1 = f1 + f0;
            f0 = b;
            System.out.print(f1 + " ");
        }
        System.out.println();
        row();
    }
    public static void deposit(){
        System.out.print("Введите сумму вклада: ");
        float money = input().nextFloat();
        System.out.println();

        System.out.print("Введите количество месяцев: ");
        int month = input().nextInt();
        System.out.println();
        System.out.printf("Возможно будет так %.2f \n", (money + (month * (money * 0.07))));
        for (int a = 1; a <= month; a++){
            money = (float) (money + (money * 0.07));
        }
        System.out.printf("Или итоговая сумма за %d месяцев будет %.2f \n", month, money);

        row();

    }
    public static void mTable(){
        for (int a = 1; a <= 10; a++){
            for (int b = 1; b <= 10; b++){
                System.out.printf("%d * %d = %d\n", a, b, (a * b));
            }
            System.out.println();
        }
    }
}
