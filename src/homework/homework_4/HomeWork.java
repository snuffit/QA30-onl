package homework.homework_4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args){
        row();

        //Задание 0 -  Создайте массив целых чисел. Напишете программу, которая выводит
        // сообщение о том, входит ли заданное число в массив или нет.
        //Пусть число для поиска задается с консоли (класс Scanner).
        arrayNumberFind();

        //Задание 1 - Создайте массив целых чисел. Удалите все вхождения заданного
        //числа из массива.
        //Пусть число задается с консоли (класс Scanner). Если такого числа нет -
        //выведите сообщения об этом.
        //В результате должен быть новый массив без указанного числа.
        arrayNumberDel();

        //Задание 2 - Создайте и заполните массив случайным числами и выведете
        //максимальное, минимальное и среднее значение.
        //Для генерации случайного числа используйте метод Math.random().
        //Пусть будет возможность создавать массив произвольного размера.
        //Пусть размер массива вводится с консоли.
        averageValueArray();

        //Задание 3 - Создайте 2 массива из 5 чисел.
        //Выведите массивы на консоль в двух отдельных строках.
        //Посчитайте среднее арифметическое элементов каждого массива и
        //сообщите, для какого из массивов это значение оказалось больше (либо
        //сообщите, что их средние арифметические равны).
        equalsArithmeticArray();

        //Дополнительные задания
        //Задание 4 - Создайте массив из n случайных целых чисел и выведите его на
        //экран.
        //Размер массива пусть задается с консоли и размер массива может быть
        //больше 5 и меньше или равно 10
        //Если n не удовлетворяет условию - выведите сообщение об этом.
        //Если пользователь ввёл не подходящее число, то программа должна
        //просить пользователя повторить ввод.
        //Создайте второй массив только из чётных элементов первого массива,
        //если они там есть, и вывести его на экран.
        evenArray();

        //Задание 5 - Создайте массив и заполните массив.
        //Выведите массив на экран в строку.
        //Замените каждый элемент с нечётным индексом на ноль.
        //Снова выведете массив на экран на отдельной строке.
        oddIndexArray();

        //Задание 6 - Создайте массив строк. Заполните его произвольными именами людей.
        //Отсортируйте массив.
        //Результат выведите на консоль.
        sortStringArray();

        //Задание 7 - Реализуйте алгоритм сортировки пузырьком.
        bubblesSortArrayTest();
    }
    public static Scanner input(){
        return  new Scanner(System.in);
    }
    public static void row() {
        System.out.println("*******************************************");
    }
    public static int getRandomNum(int minNum, int maxNum){
        return (int) (Math.random() * maxNum) + minNum;
    }
    public static void getRandomArray(int[] yourArray, int minNum, int maxNum){
        for (int index = 0; index < yourArray.length; index++){
            yourArray[index] = getRandomNum(minNum, maxNum);
        }
    }
    public static void printYourArray(int[] yourArray){
        for(int el : yourArray){
            System.out.print(el + " ");
        }
    }

    //Задание 0
    public static void arrayNumberFind(){
        int[] array = new int[10];
        getRandomArray(array, 1, 11);
        System.out.print("Введите число, чтобы проверить является ли это число частью массива: ");
        int num = input().nextInt();

        System.out.print("В массиве - ");
        printYourArray(array);
        System.out.println(findNumber(array, num));
        row();
    }
    public static String findNumber(int[] yourArray, int num){
        for(int el : yourArray){
            if(el == num){
                return " - есть число " + num;
            }
        }
        return " - нет числа " + num;
    }

    //Задание 1
    public static void arrayNumberDel(){
        int[] array = new int[10];
        getRandomArray(array, 1, 10);

        System.out.print("Старый массив: ");
        printYourArray(array);
        System.out.println();
        System.out.print("Введите число, которое нужно удалить из массива: ");
        int num = input().nextInt();
        int count = 0;

        for(int index = 0; index < array.length; index++){
            if(num != array[index]){
                count++;
            }
        }
        if(count == array.length){
            System.out.println("Такого числа в массиве нет");
            row();
            return;
        }
        int[] newArray = new int[count];

        for(int index = 0, newIndex = 0; index < array.length; index++){
            if(num != array[index]){
                newArray[newIndex] = array[index];
                newIndex++;
            }
        }
        System.out.print("Новый массив: ");
        printYourArray(newArray);
        System.out.println();
        row();
    }

    //Задание 2
    public static void averageValueArray(){
        System.out.print("Введите размер массива: ");
        int[] array = new int[input().nextInt()];
        getRandomArray(array, 1, 10);
        System.out.print("Среднее значение массива: ");
        printYourArray(array);
        System.out.print(" - равно " + arithmeticAverage(array) + "\n");
        System.out.println("Максимальное значени - " + maxNumInArray(array));
        System.out.println("Минимальное значени - " + minNumInArray(array));
        row();
    }
    public static int arithmeticAverage(int[] array){
        int sum = 0;
        for(int el : array){
            sum += el;
        }
        return sum  / array.length;
    }
    public static int maxNumInArray(int[] array){
        int max = 0;
        for(int index = 0; index < array.length; index++){
            if(max < array[index]){
                max = array[index];
            }
        }
        return max;
    }
    public static int minNumInArray(int[] array){
        int min = array[0];
        for(int index = 0; index < array.length; index++){
            if(min > array[index]){
                min = array[index];
            }
        }
        return min;
    }

    //Задание 3 !Неправильно понял задание и реализовал создание массива через ввод в консоль в одну строку
    public static void equalsArithmeticArray(){
        int[] firstArray = new int[5];
        int[] secondArray = new int[5];
        System.out.println("Введите значения для двух массивов(размером в 5), чтобы узнать какой из них больше.");
        System.out.print("Значения Первого массива(5 чисел через пробел, можно и отрицательные и числа больше 10) - ");
        convertInputToIntArray(firstArray);
        System.out.print("Значения Второго массива(5 чисел через пробел, можно и отрицательные и числа больше 10) - ");
        convertInputToIntArray(secondArray);
        System.out.println(equalsArrays(firstArray, secondArray));
        row();
    }
    public static void convertInputToIntArray(int[] intArray){
        String[] strArray = input().nextLine().split("\\s+");
        for(int index = 0; index < intArray.length; index++){
            intArray[index] = Integer.parseInt(strArray[index]);
        }
    }
    public static String equalsArrays(int[] firstArray, int[] secondArray){
            if(arithmeticAverage(firstArray) > arithmeticAverage(secondArray)){
                return "Первый массив больше";
            }
            else if(arithmeticAverage(firstArray) == arithmeticAverage(secondArray)){
                return "Массивы равны";
            }
            else{
                return "Второй массив больше";
            }
    }

    //Дополнительные задания
    //Задание 4
    public static void evenArray(){
        int[] array = new int[sizeTest()];
        getRandomArray(array, 1, 20);
        System.out.print("Изначальный массив - ");
        printYourArray(array);
        System.out.println();
        getEvenArray(array);


    }
    public static void getEvenArray(int[] array){

        if(counterForEvenNum(array) == 0){
            System.out.println("В массиве нет четных чисел");
            row();
            return;
        }

        getNewArray(array);
    }
    public static void getNewArray(int[] array){
        int[] newArray = new int[counterForEvenNum(array)];
        for(int index = 0, newIndex = 0; index < array.length; index++){
            if(array[index] % 2 == 0){
                newArray[newIndex] = array[index];
                newIndex++;
            }
        }
        System.out.print("Итоговый массив - ");
        printYourArray(newArray);
        System.out.println();
        row();
    }
    public static int counterForEvenNum(int[] array){
        int count = 0;

        for(int index = 0; index < array.length; index++){
            if(array[index] % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static int sizeTest(){
        int size;
        do {
            System.out.print("Введите размер массива из n случайных целых чисел (он должен быть от 5 и по 10): ");
            size = input().nextInt();
            if(size < 5 || size > 10){
                System.out.println("Вы ввели некорректное число!");
            }
        }while (size < 5 || size > 10);
        return size;
    }

    //Задание 5
    public static void oddIndexArray(){
        int[] array = new int[10];
        getRandomArray(array, 0, 10);

        System.out.print("Изначальный массив - ");
        printYourArray(array);
        System.out.println();

        System.out.print("Новый массив - ");
        printYourArray(editOddIndexArray(array));
        System.out.println();

        row();
    }
    public static int[] editOddIndexArray(int[] array){
        for(int index = 2; index < (array.length + 2); index++){
            if(index % 2 != 0){
                array[index - 2] = 0;
            }
        }
        return array;
    }

    //Задание 6
    public static void sortStringArray(){
        String[] names = new String[]{"Boris", "Anton", "Kate", "Roma", "Jack", "Kirill", "Oleg", "Petr"};
        System.out.println(Arrays.toString(names));
        bubblesSortArrayUniversal(names);
        System.out.println(Arrays.toString(names));
        row();
    }
    public static <T extends Comparable<T>> void bubblesSortArrayUniversal(T[] array){
        for(int delIndex = 1; delIndex < array.length - 1; delIndex++){
            for (int index = 0; index < (array.length - delIndex); index++){
                if (array[index].compareTo(array[index + 1]) > 0){
                    T arrayNum = array[index + 1];
                    array[index + 1] = array[index];
                    array[index] = arrayNum;
                }
            }
        }
    }

    //Задание 7
    public static void bubblesSortArrayTest(){
        int[] array = new int[10];
        getRandomArray(array, 1, 10);
        printYourArray(array);
        System.out.println();
        bubblesSortArray(array);
        printYourArray(array);
        System.out.println();
        row();
    }
    public static void bubblesSortArray(int[] array){
        for(int delIndex = 1; delIndex < array.length - 1; delIndex++){
            for (int index = 0; index < (array.length - delIndex); index++){
                if (array[index] > array[index + 1]){
                    int arrayNum = array[index + 1];
                    array[index + 1] = array[index];
                    array[index] = arrayNum;
                }
            }
        }
    }
}
