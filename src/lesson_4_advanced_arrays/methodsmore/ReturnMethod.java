package lesson_4_advanced_arrays.methodsmore;
import java.util.Scanner;
public class ReturnMethod {
    public static void main(String[] args){
        String myFullName = getMyFullName();

        System.out.println(myFullName);
        System.out.println(getMyFullName());

        System.out.println(getFullName("Ivan", "Davidov"));

        System.out.println(getFullDetails("Archil", "Sikharulidze", 36, "Java Developer"));

        // Тернарный оператор проверки истины
        // (логическое условие) ? _если_истина : _если_ложь
        System.out.println((checkStatus(false)) ? "WON" : "LOST");

        System.out.println((10 < 5) ? "10" : "5");

        System.out.println("What is you sex (fEMALE, mALE, uNKNOWN: " + getSex('r'));
        System.out.println("What is you sex (fEMALE, mALE, uNKNOWN: " + getSexTernary('f'));
    }

    // () ? _true : _false
    // () ? _true : () ? _true : _false
    public static char getSexTernary(char symbol){
        // if (symbol == 'f') 'f' : else if (symbol == 'm') 'm' else 'u'
        return (symbol == 'f') ? 'f' : (symbol == 'm') ? 'm' : 'u';
    }

    // if (f) female, (m) male, (?) WRONG - via IF
    public static char getSex(char symbol){
        if (symbol == 'f') return 'f';
        else if (symbol == 'm') return 'm';

        return 'u';
    }

    public static boolean checkStatus(boolean won){
        if (won)
            return true;
        return false;
    }

    public static String getFullDetails(String name, String surname, int age, String occupation){
        return "Your personal data is:\n" +
                "Name: " + name + "\n" +
                "Surname: " + surname + "\n" +
                "Age: " + age + "\n" +
                "Occupation:" + occupation + ".\n";
    }

    public static String getFullName(String name, String surname){
        return name + " " + surname;
    }

    // Signature
    public static void getMyName(String name, int age){

    }

    // Метод может не просто принимать данные, но и возвращать их
    public static String getMyFullName(){
        // void значит, что метод ничего не возвращает
        // если заменить ключевое слово void на любую другой тип переменной
        // то метод обязан его вернуть

        return "Archil Sikharulidze";
    }

    // Когда ты вызовешь этот метод
    // Создай временный Сканнер и дай мне возможность его использовать
    // Когда метод перестанет использоваться, закрой сканер и убери его
    // В Джаве если вы что-то объявили в рамках метода - он самостоятельно умрет
    // Поскольку сканнер здесь временный и этот метод больше не используется
    // Он откроет ресурс Сканнера, а потом сам его закроет.
    public static Scanner getInput(){
        /*
        Scanner scan = new Scanner(System.in);

        scan.close();

         */

        return new Scanner(System.in);
    }
}
