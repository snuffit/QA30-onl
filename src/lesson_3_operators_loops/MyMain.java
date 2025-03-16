package lesson_3_operators_loops;

public class MyMain {
    public static void main(String[] args){
        //
        setLocalVariables();
    }

    public static void setLocalVariables(){
        // Local variables
        // Если переменная или любой код пишется в рамках какого-либо блока, то он обычно называется локальным
        // Например, код, который я написал в методе - это локальный код уровня метод
        // Если я объявил переменные в каком-либо блоке, например, метод - это локальные переменные уровня метод
        int myValue = 100;

        // Существование локальной переменной лишь в границах от кавычки до кавычки
        {
            // Как только программа выйдет на видимость переменной примитивного типа
            // Переменная просто удаляется из памяти
            int myDoubleLocalValue = 100;
            System.out.println("Get int myValue:" + myValue);
            System.out.println("Get my int myDoubleLocalValue: " + myDoubleLocalValue);
        }

        System.out.println("Get int myValue:" + myValue);
    }

    public static void setDefaultVariables(){
        // What are default values?
        // C/C++ и в некоторых языках программирование можно создать локальную переменную таким образом,
        // чтобы компилятор не ругался, в Джава такое нельзя
        String name = null; // null keyword, которое значит что не существует пока даже адреса, там ничего
        String surname = ""; // Пустая строка
        double weight = 0;

        // 2. В Джава дефолтные значения задаются лишь переменным уровня КЛАСС, но не локальным
        System.out.println(name);
        System.out.println(weight);
    }

}
