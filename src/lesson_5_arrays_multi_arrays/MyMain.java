package lesson_5_arrays_multi_arrays;
import java.util.Arrays;
public class MyMain {
    public static void main(String[] args){
        getDoubleArray();

        System.out.println("****************************");

        char[][][] cube = new char[][][]{
                {
                        {'A', 'B'},
                        {'4'}
                },
                {
                        {'o'},
                        {'#', '*', 'I'}
                }
        };

        getTripleCharArray(cube);
    }

    // Чем больше внедрения, тем больше []
    public static void getNArrays(){
        int[][][][] nArray = new int[4][][][];
    }

    public static void getDoubleArray(){
        int[][] table = new int [][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        char[][] letters = new char[][]{
                {'a', '@'}, // [0][0], [0][1]
                {'%'},//[1][0]
                {'*', 'e', '?'}, //[2][0], [2][1], [2][2]
                {'-'}// [3][0]
        };

        getDoubleCharArray(letters);
    }

    public static void getDoubleCharArray(char[][] letters){
        for (int outer = 0; outer < letters.length; outer++){
            for (int inner = 0; inner < letters[outer].length; inner++){
                System.out.print(letters[outer][inner] + "\t");
            }
            System.out.println();
        }
    }

    public static void getTripleCharArray(char[][][] symbols){
        // [0][0][0]
        // [0][1][0]
        // [1][0][1]
        for (int outer = 0; outer < symbols.length; outer++){
            for (int inner = 0; inner < symbols[outer].length; inner++){
                for (int deep = 0; deep < symbols[outer][inner].length; deep++){
                    System.out.println(symbols[outer][inner][deep]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // Arrays.compare
    public static void compareTwoArrays(){
        int[] nums = new int[]{1, -1, 2, 5};
        int[] newNums = new int[]{-2, -1, 2, 5};

        // Если массивы равны = 0
        // Если левый операнд не равен правому по лексикографическому значению -1
        // Если наоборот, то есть правый операнд выше - 1
        System.out.println(Arrays.compare(nums, newNums));
    }

    // Arrays.copyOf()
    public static void copyOfArray(){
        int[] nums = new int[]{1, -1, 2, 5};
        int[] newNums = new int[nums.length];

        newNums = Arrays.copyOf(nums, newNums.length);

        for (int el: newNums){
            System.out.println(el);
        }
    }
    // Array copy CLASS ARRAYS, SYSTEM
    public static void copyArray(){
        int[] nums = new int[]{1, -1, 2, 5};
        int[] newNums = new int[nums.length];

        System.arraycopy(nums, 0, newNums, 0, nums.length);

        for(int el : newNums){
            System.out.println(el);
        }
    }

    // Array equals method from class Arrays, boolean result
    public static void checkArrayEquality(){
        int[] nums = new int[]{1, -1, 2, 5};
        int[] newNums = new int[]{2, -1, 2, 5};

        System.out.println(Arrays.equals(nums, newNums));
    }

    // Array Equals via loop
    public static void compareArrays(){
        // Compare two arrays
        // Через индексы с использованием цикла
        int[] nums = new int[]{1, -1, 2, 5};
        int[] newNums = new int[]{1, -1, 2, 5};

        if (nums.length == newNums.length){
            for (int index = 0, counter = 0; index < nums.length; index++){
                if (nums[index] == newNums[index]) counter++;
                if (counter == nums.length) {
                    System.out.println("Equals!");
                }
            }
        }
    }

    // C-style array
    public static void declareCStyleArray(){
        // int numbers[] = {1, 2, 3, 4}; -> C, C++ STACK
        int numbers[] = new int[] {1, 2, 3, 4};

        for (int index = 0; index < numbers.length; index++){
            System.out.printf("%d", numbers[index]);
        }
    }
}
