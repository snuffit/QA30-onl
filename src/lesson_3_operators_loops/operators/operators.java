package lesson_3_operators_loops.operators;
import java.util.Scanner;
public class operators {
    public static void main(String[] args){
        // Basic operators
        // Есть три логических оператора в Джава
        // Логический т.е. проверяет истину того или иного положения
        // Если Я программист, тогда в случае истины - одно действие, если нет - ложь - другое

        // if один логический оператор
        // else if многослоенный логический оператор
        // switch упорядоченный логический оператор
        setSwitch();
    }

    public static void getIfOperator(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter your age: ");
        int age = input.nextInt();

        // if (логическое условие)
        // Если выполняемое тело в одну строку, можно кавычки не давать
        // Но если выполняемое тело больше одной строчки, кавычки обязательны

        // >, <, >=, <=, ==, !=
        if (age >= 18) {
            System.out.println("Вам уже минимум 18 лет, а то и больше.");
            System.out.println("Вам возможно даже уже 65 лет, т.е. вы пенсионер.");
        }

        if (age < 18){
            System.out.println("Господи, да вы совсем ребенок!");
        }
    }

    public static void nonLogicalIf(){
        boolean isMarried = false;
        boolean isEmployed = true;

        // if (_true)
        if (isMarried == false){
            System.out.println("Your are not married.");
        }

        // if (isEmployed == true)
        // by default, if проверяет для типа boolean истину
        // т.е. сразу же смотрит, истина или нет
        if (isEmployed){
            System.out.println("Your are employed, you have job.");
        }

        // if (isEmployed != true)
        // в if ! - означает, НЕ
        if (!isEmployed){
            System.out.println("Your are not employed!");
        }
    }

    public static void setElseIf(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter your age: ");
        int age = input.nextInt();

        // Если мне больше или равно 18 и меньше 65, то я ВЗРОСЛЫЙ
        // Если же мне больше или равно 65 - я ПЕНСИОНЕР
        // Если же мне меньше 18 и больше 0 - я малолетка
        // Если же я ввел какую-то чушь - выведи сообщение
        // && логическое И
        // || логическое ИЛИ
        if (age >= 18 && age < 65) {
            System.out.println("Вы совершеннолетний человек.");
        } else if (age >= 65){
            System.out.println("Вам уже больше или равно 65 - вы официально ПЕНСИОНЕР.");
        } else if (age < 18 && age > 0){
            System.out.println("Господи, да вы совсем ребенок!");
        } else {
            System.out.println("Вы ввели какую-то чушь!");
        }
    }

    public static void setLogicalOr(){
        boolean isMarried = false;
        boolean isEngaged = true;

        if (isMarried || isEngaged){
            System.out.println("If you are married or engaged you will have this message.");
        }
    }

    public static void setSwitch(){
        String day = "Friday";

        switch (day){
            // if (day == "Monday")
            case "Monday":
                System.out.println("Today is: " + day);
                break; // keyword который ломает оператор и цикл
            case "Tuesday":
                System.out.println("Today is: " + day);
                break;
            case "Wednesday":
                System.out.println("Today is: " + day);
                break;
            case "Thursday":
                System.out.println("Today is: " + day);
                break;
            case "Friday":
                System.out.println("Today is: " + day);
                break;
            case "Saturday":
                System.out.println("Today is: " + day);
                break;
            case "Sunday":
                System.out.println("Today is: " + day);
                break;
            // else {}
            default:
                System.out.println("There is no such day in a week.");
        }
    }
}
