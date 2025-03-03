// Директория в Джава называется пакет
package lesson_2_varibles_github;

public class MyMain {
    public static void main(String[] args){
        // Method call
        getArithmeticOperations();
    }

    // Methods
    public static void getBasicVariables(){
        // Empty method yet
        System.out.println("Welcome to Java variables basics.");

        // Primitive types - примитивные типы
        // INTEGER - целочисленные

        // Все, что окрашено оранжевым является ключевым словом (keyword)
        // Ключевое слово в Джава, это зарезервированное самим языков слово, его нельзя отель использовать
        // Минимальная единица работы для программиста это 1 байт, который вмещает в себя 8 битов
        // byte может в себя вмещать 8 битов, это 1 байт
        // -128...... (-0) 0, 1, 2 = (максимальное значение в минусе - 1)
        // Если вы попытались вставить значение, которое больше того, что может в себя вместить
        // переменная = переполнение;
        // В таком случае, или значения пойдут по кругу или будет неопределенное поведение.
        byte myByte = 124;
        short myShort = 21345;
        int myInteger = 2_000_294_000; // _ просто виделитель для программиста, чтобы понять количество числ,
        // компилятор его не видит
        // int -2_000_000_000 til 2_000_000_000
        // long > int, long value = 2_000_000_000 -> int, long value = 10L;
        long myLong = -4_985_738_759_985L; // l, L указывает компилятору, чтобы он точно создал переменную типа long

        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInteger);
        System.out.println("long: " + myLong);

        // ЦЕЛОЧИСЛЕННЫЙ, НО ЗНАК, CHAR -> CHARACTER
        // ASCII Table
        // Это таблица символов, char показывает символ, но под копотом у него таблица с числовыми значения
        char letter = 'G';
        System.out.println("Character: " + letter + ". Let's is its integer value: " + (int) letter);
        letter = 'g';
        System.out.println("Character: " + letter + ". Let's is its integer value: " + (int) letter);
        // Приведение типа, значение операции letter + 10 преврати мне в тип char
        letter = (char) (letter + 10);
        System.out.println("Character: " + letter + ". Let's is its integer value: " + (int) letter);

        // 5 + 6 * 10 -- 6 * 10 + 5, (5+6)*10

        // ЗНАЧЕНИЯ С ПЛАВАЮЗЩЕЙ ЗАПЯТОЙ
        float myFloat = 45.3457F;
        double myDouble = 45.4571658498;

        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);

        // ЛОГИЧЕСКОЕ ЗНАЧНИЕ ИСТИНА ИЛИ ЛОЖЬ
        // Keyword: true правда (истина) false (ложь)
        // Java boolean чистого вида, т.е. в отличии от других языков, где 0 - означает ложь, а все что не ноль - истину,
        // здесь есть только ключевые слова - true это true, а false это false
        // Во многих языках программирования, можно заменить истину на любое числовое значение кроме 0
        // а ложь значением 0, поскольку именно так видит ситуацию компьютер, но не Джава
        boolean isAlive = true;
        boolean turnOff = false;
        boolean isActivated = true;

        System.out.println("Is you friend alive? " + isAlive);
        System.out.println("Is my TV turned off? " + turnOff);
        System.out.println("Is my account activated? " + isActivated);

        isAlive = false;
        isActivated = false;
        turnOff = true;

        // Reference types - ссылочные типы
        String string = "My first name is Archil and my last name is Sikharulidze" + ". And my age is 36.";

        // String myAge = 36; -> компилятор подумает, что вы пытаетесь обычное число вставить в строчку
        String myAge = 36 + " is my age"; // Компилятор поймет, что надо все превратить в строчку
        System.out.println("This is a String variable: " + string);
    }

    public static void getMyPrivateData(){
        String name = "Archil";
        String surname = "Sikharulidze";
        int age = 36;
        float height = 172.6F;

        // My occupation?
        String myOccupation = "Java Developer";

        // C++ my_name, my_full_name - snake style
    }

    public static void getArithmeticOperations(){
        // +, -, /, *, %
        int myHeight = 171;
        int yourHeight = 90;
        int difference = myHeight - yourHeight;

        // int 156.78 = 156, просто отбрасывается дробная часть
        System.out.println("The difference is: " + difference);
        System.out.println("The difference directly: " + (myHeight - yourHeight));

        double myAge = 36;
        double yourAge = 14.5;
        System.out.println("Multiply: " + (myAge * yourAge));

        int days = 366;
        int months = 12;
        double weeks = (double) days / months; // days int months int, division gives us int, (double) result
        System.out.println("Weeks in the year: " + weeks);

        // % modulus остаток
        // Четные и нечетные числа 21, остаток 1, 20 четные остаток 0
        System.out.println("How many times we can store 5 in 20: " + (20%5)); // 4, 4*5 = 20, 20-20 = 0

        // +, num = num + 2; -- num += 2 (num = num + 2)
        // num = num / val; -- num /= val;
        int var = 100;
        int pixels = 105;
        var = var + pixels;
        var -= pixels; // var = var - pixels, /=, *=, +=, -=, %=
    }

    public static void casting(){
        // Приведение типов
        // 1. Автоматическое
        // 1.1. Когда компилятор может самостоятельно расширить значение, для этого две или более переменные
        // должны иметь достаточное пространство и тип данных
        short value = 31_456;
        int intValue = value; // автоматическое расширение типа, потому что значение типа short может свободно уложиться
        // в тип данных int
        long myLong = intValue; // int меньше по размеру и меньше по данным нежели long, поэтому автоматически сделает

        double myDouble = intValue; // double 8 bytes и может свободно хранить значения типа int

        // 2. Принудительное
        double doubleBigValue = 34_568;
        int storeDouble = (int) doubleBigValue; // когда идет сужение данных от большего к наименьшему я обязан
        // это принудить сделать компилятор

        // 56.567 (int) 56

        // Есть типы, которые нельзя ни к чему привести
        boolean isAlive = true;
        // MISTAKE: int booleanValue = (int) isAlive;

        int age = 36;
        // Из целого числа в строчку можно лишь через специальный метод
        // String name = 35; -> MISTAKE
        // From Integer to String
        String stringAge = String.valueOf(age);
        // From String to Integer
        int stringAgeConverted = Integer.parseInt(stringAge);
    }
}