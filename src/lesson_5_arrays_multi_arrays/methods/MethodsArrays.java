package lesson_5_arrays_multi_arrays.methods;
import java.util.Scanner;
public class MethodsArrays {
    public static void main(String[] args){
        // Пожалуйста объяви анонимный экземпляр класса Сканнер
        // Анонимный экземпляр класса - это объект у которого нет имени
        // Т.е. он одноразово создается, выполняет свою миссию и удаляется
        // Поскольку у него нет имени, то нет и постоянного адреса в памяти
        // К нему нельзя обратиться вновь
        char[] letters = setLetters();
        readCharArray(letters);

        System.out.println("********************");

        getVarArgs("Archil", "Andro", "Yulia", "Nadezhda", "Olga");
    }

    // String[] names
    public static void getVarArgs(String... names){
        // var-arg
        // Переменные неопределенной длины
        // Возможность передать в метод любое количество переменны, как массив одного типа
        readArray(names);
    }

    // WRONG: int height, int... values, double value
    public static void getVarArgsRules(int height, int... values){
        // var-arg cannot be in the beginning or in the middle of the parameters
    }

    public static char[] setLetters(){
        return new char[]{
                'A', 'B', 'C', 'D', 'E','F', 'G', 'H', 'I', 'J', 'K'
        };
    }

    public static void setTwoArraysOneAddress(){
        char[] letters = new char[]{'A', 'B', 'C', 'E'};
        char[] aliasLetters = letters;

        readCharArray(letters);
        System.out.println("*******");
        readCharArray(aliasLetters);

        letters[0] = '&';
        letters[1] = '*';
        System.out.println("***********");

        readCharArray(letters);
        System.out.println("*******");
        readCharArray(aliasLetters);
    }

    public static void readCharArray(char[] letters){
        for (char letter : letters){
            System.out.print(letter + "\t");
        }
    }

    public static void callPassArrays(){
        passArrays(100, new String[] {"Archil", "Ylia", "Oolga"}, "Java", 14.5);
    }

    public static void passArrays(int number, String[] numbers, String name, double weight){
        // JUST GET
    }

    public static void keyWordFinal(){
        final int num = 10; //

        // final + Object, final int[] nums -> nums указывает на что-то, сделай это окончательным
        // это адрес первого элемента
        int[] nums = new int[]{1, 2, 3};

        // numsCopy -> nums
        final int[] numsCopy = nums;

        int[] anotherNums = new int[]{6,9, 10};
        // numsCopy = anotherNums;

        System.out.println(numsCopy[0]);
    }

    public static void callByValueByReference(){
        int num = 5;
        System.out.println(num);
        passNum(num);
        System.out.println(num);

        System.out.println("***********************");

        // final делает переменную константой, т.е. нельзя менять значение
        // final int num = 1; нельзя менять
        // Имя массива это не значение, это его адрес
        // Поэтому если вы зададите final массив, то он сделает окончательным адрес массива
        // а не значения внутри него
        final int[] nums = new int[]{1, 2, 3};

        for (int index = 0; index < nums.length; index++){
            System.out.println(nums[index]);
        }

        passObject(nums);

        for (int index = 0; index < nums.length; index++){
            System.out.println(nums[index]);
        }
    }

    // ADDRESS
    public static void passObject(int[] nums){
        for (int el : nums){
            System.out.println(el);
            el = 11;
        }
    }

    public static void passNum(int num){
        num = 10;
    }

    public static void setNames(){
        String[] names = new String[getArrayLength()];

        for (int index = 0; index < names.length; index++){
            System.out.print("Please enter names for the array: ");
            String name = new Scanner(System.in).nextLine();
            names[index] = name;
        }

        readArray(names);
    }

    public static int getArrayLength(){
        do{
            int length;

            System.out.print("Please, enter how many names we should store in an array (>0): ");
            if ((length = new Scanner(System.in).nextInt()) > 0) return length;
        } while (true);
    }

    // Передача по значению и по ссылке
    public static void readArray(String[] names){
        System.out.print("These are the names:\n");
        for (String name : names){
            System.out.printf("%s.\n", name);
        }
    }
}
