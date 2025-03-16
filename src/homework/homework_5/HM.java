package homework.homework_5;

import java.util.Scanner;

public class HM {
    public static void main(String[] args){
        row();

        //Задание 0 - Создать трехмерный массив из целых чисел.
        //С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
        //заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
        //задается из консоли.
        increaseArrayTest();

        //Задание 1 - Шахматная доска
        //Создать программу для раскраски шахматной доски с помощью цикла.
        //Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам
        //циклам значения B(Black) или W(White). Результат работы программы:
        chessBoardArray();

        //Дополнительное задание
        //Задание 2 - Умножение двух матриц
        //Создайте два массива целых чисел размером 3х3 (две матрицы).
        //Напишите программу для умножения двух матриц.
        //Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
        //Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
        //Ожидаемый результат: 1 2 3 1 1 1 0 0 0
        multMatrixTest();

        //Задание 3 - Создайте двумерный массив целых чисел. Выведите на консоль сумму всех
        //элементов массива.
        countArray();


        //Задание 4 - Создайте двумерный массив. Выведите на консоль диагонали массива.
        diagonalArray();

        //Задание 5 - Создайте двумерный массив целых чисел. Отсортируйте элементы в строках
        //двумерного массива по возрастанию.
        arraySort();
    }
    public static Scanner input(){
        return new Scanner(System.in);
    }
    public static void row() {
        System.out.println("*******************************************");
    }

    //Задание 0
    public static void increaseArrayTest(){
        int[][][] tripleArray = new int[][][]{
                {{1, 2, 3}, {5, 7, 3}, {9, 4, 7}},
                {{6, 4, 2}, {8, 5, 7}, {3, 3, 6}},
                {{1, 3, 7}, {5, 4, 9}, {2, 6, 4}}
        };
        System.out.println("Изначальный массив:");
        printTripleArray(tripleArray);
        System.out.print("На какое число увеличить каждый элемент массива? ");
        increaseArray(tripleArray, input().nextInt());
        System.out.println("Итоговый массив:");
        printTripleArray(tripleArray);
        row();
    }
    public static void increaseArray(int[][][] tripleArray, int increaseNum){
        for (int outer = 0; outer < tripleArray.length; outer++){
            for(int inner = 0; inner < tripleArray[outer].length; inner++){
                for(int deep = 0; deep < tripleArray[outer][inner].length; deep++){
                    tripleArray[outer][inner][deep] += increaseNum;
                }
            }
        }
    }
    public static void printTripleArray(int[][][] tripleArray){
        for (int outer = 0; outer < tripleArray.length; outer++){
            for(int inner = 0; inner < tripleArray[outer].length; inner++){
                for(int deep = 0; deep < tripleArray[outer][inner].length; deep++){
                    System.out.print(tripleArray[outer][inner][deep] + " ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    //Задание 1
    public static void chessBoardArray(){
        String[][] chessBoard = new String[8][8];

        for(int outer = 0; outer < chessBoard.length; outer++){
            for(int inner = 0; inner < chessBoard[outer].length; inner++){
                if ((outer + inner) % 2 == 0){
                    chessBoard[outer][inner] = "W";
                }else {
                    chessBoard[outer][inner] = "B";
                }
                System.out.print(chessBoard[outer][inner] + " ");
            }
            System.out.println();
        }

        row();
    }

    //Дополнительное задание
    //Задание 2
    public static void multMatrixTest(){
        int[][] firstMatrix = new int[][]{
                {1,0,0,0},
                {0,1,0,0},
                {0,0,0,0}};
        int[][] secondMatrix = new int[][]{
                {1,2,3},
                {1,1,1},
                {0,0,0},
                {2,1,0}};
        sizeMatrix(firstMatrix, secondMatrix);
        row();
    }
    public static void sizeMatrix(int[][] firstMatrix, int[][] secondMatrix){
        int outer = 0;
        int inner = 0;
        if(firstMatrix.length < secondMatrix.length){
            outer = firstMatrix.length;
        }else {
            outer = secondMatrix.length;
        }
        if(firstMatrix[0].length < secondMatrix[0].length){
            inner = firstMatrix[0].length;
        }else {
            inner = secondMatrix[0].length;
        }
        int[][] finalMatrix = new int[outer][inner];
        multMatrix(firstMatrix, secondMatrix, finalMatrix);
    }
    public static void multMatrix(int[][] firstMatrix, int[][] secondMatrix, int[][] finalMatrix){
        for(int outer = 0; outer < finalMatrix.length; outer++){
            for (int inner = 0; inner < finalMatrix[outer].length; inner++){
                int num = 0;
                for(int index = 0; index <finalMatrix.length; index++){
                    num += firstMatrix[outer][index] * secondMatrix[index][inner];
                }
                finalMatrix[outer][inner] = num;
            }
        }
        printDArray(finalMatrix);
    }
    public static void printDArray(int[][] yourMatrix){
        for(int outer = 0; outer < yourMatrix.length; outer++){
            for(int inner = 0; inner < yourMatrix[outer].length; inner++){
                System.out.print(yourMatrix[outer][inner] + " ");
            }
            System.out.println();
        }
    }

    //Задание 3
    public static void countArray(){
        int[][] array = new int[][]{
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
                {10}
        };
        System.out.println("Число элементов двумерного массива: " + count(array));
        row();
    }
    public static int count(int[][] array){
        int count = 0;
        for(int outer = 0; outer < array.length; outer++){
            for(int inner = 0; inner < array[outer].length; inner++){
                count++;
            }
        }
        return count;
    }

    //Задание 4
    public static void diagonalArray() {
        int[][] array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9,}
        };

        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index][index] + " ");
        }
        System.out.println();

        for (int index = 0; index < array.length; index++) {
            System.out.print(array[0 + index][array.length - 1 - index] + " ");
        }
        System.out.println();
        row();
    }

    //Задание 5
    public static void arraySort(){
        int[][] array = new int[][]{
                {3, 5, 7, 9},
                {1, 7, 6},
                {8, 3, 5, 7, 4}
        };
        bubblesSortArray(array);
        printDArray(array);
        row();
    }
    public static void bubblesSortArray(int[][] yourArray){
        int[] array = new int[count(yourArray)];
        fromTwoToOne(yourArray, array);
        for(int delIndex = 1; delIndex < array.length - 1; delIndex++){
            for (int index = 0; index < (array.length - delIndex); index++){
                if (array[index] > array[index + 1]){
                    int arrayNum = array[index + 1];
                    array[index + 1] = array[index];
                    array[index] = arrayNum;
                }
            }
        }
        fromOneToTwo(yourArray, array);

    }
    public static void fromTwoToOne(int[][] twoArray, int[] oneArray){
        int index = 0;
        for(int outer = 0; outer < twoArray.length; outer++){
            for(int inner = 0; inner < twoArray[outer].length; inner++){
                oneArray[index] = twoArray[outer][inner];
                index++;
            }
        }
    }
    public static void fromOneToTwo(int[][] twoArray, int[] oneArray){
        int index = 0;
        for(int outer = 0; outer < twoArray.length; outer++){
            for(int inner = 0; inner < twoArray[outer].length; inner++){
                twoArray[outer][inner] = oneArray[index];
                index++;
            }
        }
    }
}
