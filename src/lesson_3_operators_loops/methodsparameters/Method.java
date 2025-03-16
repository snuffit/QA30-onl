package lesson_3_operators_loops.methodsparameters;

public class Method {
    public static void main(String[] args) {
        getPersonalData("Archil", "Sikharulidze", 36, "Java Developer");
        System.out.println("***********************************************");
        calculateSum(45, 109);
        System.out.println("Once again...");

        double x = 167.5;
        double y = 67.190;
        calculateSum(x, y);

        String message = "Welcome to a method with parameters. I understand, it is a bit complicated.";
        System.out.println("***********************************************");
        getMsg(message);

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------");
    }

    // Каждый метод выполняет одно действие
    // Каждый метод может получать определенные параметры из другого метода
    public static void getPersonalData(String name, String surname, int age, String occupation) {
        System.out.println("Your name is: " + name);
        System.out.println("Your surname is: " + surname);
        System.out.println("Your age is: " + age);
        System.out.println("Your occupation is: " + occupation);
    }

    // Вычисли сумму двух переменных типа double и выведи мне сообщение - результат
    public static void calculateSum(double x, double y) {
        double sum = x + y;

        System.out.println("Sum of " + x + " and " + y + " equals to: " + sum);
    }

    // Method signature или подпись метода
    // Это имя метода и принимаемые им параметры в том порядке, в котором они были заданы
    public static void getMsg(String msg) {
        System.out.println("Your message is: " + msg);
    }
}
