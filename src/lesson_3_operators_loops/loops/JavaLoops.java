package lesson_3_operators_loops.loops;

public class JavaLoops {
    public static void main(String[] args){
        // Basic loops
        // Цикл это код, который будет повторяться определенное количество раз, пока логическое условие не будет
        // выполнено

        // В Джава есть три базовых цикла: do while, while, for
        keyWords();
    }

    public static void setDoWhile(){
        int numbers = 1;

        // From 1 to 10
        // Если логическое условие нельзя выполнить, у вас будет бесконечный цикл
        // который, скорее всего, просто убьет вашу память

        // В этом цикле - ТЕЛО КОДА ХОТЯ БЫ ОДИН РАЗ ВЫПОЛНИТСЯ!!!!!
        do{
            System.out.println(numbers);
            // Постфиксный инкремент
            numbers++; // numbers += 1, numbers = numbers + 1;
        } while(numbers <= 10);
    }

    public static void setWhile(){
        int numbers = 1;

        while(numbers <=10){
            // Пока проверка логического условия, а потом уже выполнение тела
            // В отличии от do while где тело хотя бы раз выполнится, здесь если логическое условие уже нарушено
            // такого просто не может быть
            System.out.println(numbers);
            numbers++;
        }
    }

    public static void setFor(){
        // for (объявление переменной, проверка логики, изменение переменной)
        // Все части необязательны, можно некоторые вещи и упустить
        for (int number = 1; number <= 10; number++){
            System.out.println(number);
        }

        /*
        for (; ;){
            // Бесконечный цикл, без переменной, без логического условия, и без изменения переменной
        }
         */
    }

    public static void keyWords() {
        // break - ломает оператор или цикл
        // continue - пропускает повтор код в цикле
        // return - ломает весь метод

        for (int num = 1; num <= 10; num++) {
            if (num == 5) {
                break;
            }
            System.out.println(num);
        }

        System.out.println("*******************");

        for (int num = 1; num <= 10; num++) {
            if (num == 5) {
                continue;
            }
            System.out.println(num);
        }

        System.out.println("****************************");

        for (int num = 1; num <= 10; num++) {
            if (num == 7) {
                return;
            }
            System.out.println(num);
        }

        System.out.println("YOU CAN'T ACCESS BECAUSE RETURN KILLED THE METHOD!");
    }
}
