// Стандарты написания класса
// Класс всегда должен быть существительным
// Потому что КЛАСС это ОБЪЕКТ
// Класс всегда должен писать по принципу Upper Camel Case
// Например, класс Robot, RobotJohn, RobotJohnMacCain

// Когда мы говорим, что классический Джава является строгим языков ООП
// Это значит, что нельзя написать какой-либо код, вне объекта

/*
Welcome to multi-line comments in Java.
This is used for educational purposes.
 */

/**
 * JavaDoc
 * @author Archil Sikharulidze
 */

public class Main{
    // One-line comment
    // Entry-point, точка входа
    public static void main(String[] args){
        // Точка входа для всего кода
        // Method call вызов метода
        getBasicIO();
    }

    // Lower Camel Case
    // Первое слово всегда глагол, последующий может быть и существительным
    // public static void ring(), jump(), run(), getSum(), getMySum()
    // Действия, т.е. части кода, которые определяют действия, или глаголы
    // Глаголы в программировании называются ФУНКЦИЯМИ, если они не находятся в КЛАССЕ (ОБЪЕКТЕ)
    // Если же они, как во всех программах ДЖАВА, являются частью ОБЪЕКТА, то мы их называем МЕТОДАМИ
    // Следовательно, в ДЖАВЕ НЕТ ФУНКЦИЙ, ЕСТЬ ТОЛЬКО МЕТОДЫ, ПОСКОЛЬКУ ГЛАГОЛЫ ДОЛЖНЫ БЫТЬ В ТЕБЕ ОБЪЕКТА
    public static void getBasicIO(){
        // Однострочные комментарии
        // I/O Input/Output
        // Стандартный ввод и вывод
        System.out.println("Welcome to programming language Java."); // напечатай и добавь переход на следующую строчку
        System.out.print("This is the initial lesson on fundamentals of Java grammar."); // просто напечатай
        System.out.println("The last line after print().");

        // Process finished with exit code 0 -> Я прочитал твой код, и на уровне грамматики и стандартов
        // правописания все нормально. Я собрал твой код и вывел результат.

        // Если у вас будет любой другой результат кроме числа 0, это означает ошибку или принудительное
        // окончание программы
        System.out.println("------------------Problem------------------------");
        System.out.println(); // Что будет если ничего не передать println()?
        // println(->next line);

        // Специальный знак, указывающий не переход на следующую строчку
        System.out.print("\n"); // Escape sequences

        // Связывание данных и строчек в Java
        System.out.print("Let's make concatenation.");
        System.out.println(" Yes. We did it via print().");

        System.out.println("Let's use plus sign to combine stings." + " This has been added via + sign.");

        // Форматированный вывод, пришедший в Джава из С, но не являющийся его стандартной версией
        // В текст дать указатель на какое-то число и иметь возможность это число указывать вне самого текста

        String name = "Archil";
        int age = 36;

        System.out.println("My name is " + name + " and I am " + age + " years old.");

        // В форматированном выводе есть текст + флаги, которые позволяет внедрять переменные непосредственно
        // в текст, флаг начинается с знака % и + тип переменной. Если у нас строчка %s - s от String
        // Если у нас целочисленное значение, то %d - DECIMAL десятичный знак
        // Если у нас знак или символ (например, буква С, то %c - CHARACTER т.е. знак
        // Если у нас число с плавающей запятой (например, 16.9), то %f - FLOAT
        System.out.printf("My name is %s and I am %d years old.\n", name, age);
    }

    // Let's see what basic data types we have
    public static void getBasicVariables(){
        // Язык строгой типизации
        // Тип данных предопределяет возможные в нем сохраняемые значения
        byte myByte = 125;
        short myShort = 3245;
        int myInt = 14599;
        long myLon = 1929024900L;

        char letter = 'A';

        float myFloat = 13.4F;
        double myDouble = 456.3903;

        boolean myBoolean = true;

        String myName = "Archil Sikharulidze";
    }
}