package homework_3;

import java.util.Scanner;

public class HmOperators {

    public static void main(String[] args) {
        row();
        //Задание 1
        timeOfYear();

        //Задание 2
        timeOfYearIfElse();

        //Задание 3
        evenOdd();

        //Задание 4
        temperature();

        //Задание 5
        color();
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
                System.out.println("Сейчас весно");
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
            System.out.println("Сейчас весно");
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
        System.out.print("Write your temperature: ");
        int t = input().nextInt();

        if (t > -5){
            System.out.println("Тепло");
        } else if(-5 >= t && t > -20){
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
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
}
