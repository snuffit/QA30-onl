package lesson_2_varibles_github.example;

import java.util.Scanner;

public class MyBMICalculator {
    public static void main(String[] args){
        // BMI Calculator
        // Body Mass Index Calculator - это формула, которая высчитывает ваши данные исходя из роста и веса.
        // Есть стандартная таблица проверки пропорций, если вы меньше, надо поднабрать веса, если вы в рамках - отлично,
        // если вы больше - надо скинуть вес.

        // 1. Пригласить пользователя и объяснить
        // 2. Позволить ему ввести данные
        // 3. Обработать данные
        // 4. Вывести результаты данных
        introduceBMICalculator();
    }

    // Информирует пользователя о программе и правилах
    public static void introduceBMICalculator(){
        System.out.println("Welcome to BMI calculator. It counts proportion of your height and weight.");
        System.out.println("You will be able to enter a value of your height in cm, your weight in kg.");
    }

    // Запрашивает данные
    public static void getData(){
        System.out.print("Please, enter your height in cm: ");
        int height = inputData().nextInt();
        System.out.print("Please, enter your weight in kg: ");
        double weight = inputData().nextDouble();
    }

    // Может прочитать с терминала введенные вами данные
    public static Scanner inputData(){
        return new Scanner(System.in);
    }
}
