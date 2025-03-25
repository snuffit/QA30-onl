package homework.homework_6;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        row();
        //Задание 1 - Напишите программу, которая создает три объекта класса CreditCard у
        //которых заданы номер счета и начальная сумма
        // Тестовый сценарий для проверки:
        //Положите деньги на первые две карточки и снимите с третьей.
        //Выведите на экран текущее состояние всех трех карточек.
        task1();

        //Дополнительные задания
        // Задание 1 - Тестовый сценарий для проверки:
        //создать объект "компьютер 1" с помощью первого конструктора и
        //вывести информацию на экран;
        //создать объект "компьютер 2" с помощью второго конструктора и
        //вывести информацию на экран.
        task2();

        // Задание 2 - Создать класс, описывающий банкомат.
        //Набор купюр, находящихся в банкомате, должен задаваться тремя
        //свойствами:
        //количеством купюр номиналом 20, 50 и 100
        //Сделать метод для добавления денег в банкомат.
        //Сделать функцию, снимающую деньги, которая принимает сумму денег,
        //а возвращает булевое значение - успешность выполнения операции.
        //При снятии денег функция должна распечатывать каким количеством
        //купюр какого номинала выдаётся сумма.
        //Создать конструктор с тремя параметрами - количеством купюр каждого
        //номинала.
        task3();
    }
    public static void row() {
        System.out.println("*******************************************");
    }
    public static void task1(){
        CreditCard firstCard = new CreditCard(1234_5678_1234_1234l, 20);
        CreditCard secondCard = new CreditCard(4567_5678_1234_1234l, 2067);
        CreditCard thirdCard = new CreditCard(9877_5678_1234_1234l, 1356);

        firstCard.addMoneyToBalance(15);
        secondCard.addMoneyToBalance(450);
        thirdCard.delMoneyFromBalance(123);
        System.out.println();

        firstCard.allInfo();
        System.out.println();
        secondCard.allInfo();
        System.out.println();
        thirdCard.allInfo();
        row();
    }
    public static void task2(){
        Computer firstPC = new Computer(399,"MD35464");
        Computer secondPC =
                new Computer(649, "FX507-56",
                        "rm20", 256,
                        "hd-d2", 1024, false);
        firstPC.allInfo();
        System.out.println();
        secondPC.allInfo();
        row();
    }
    public static void task3(){
        ATM myATM = new ATM(15, 30, 10);
        myATM.showNumOfBills();
        System.out.println();
        //myATM.addToATM();
        myATM.showNumOfBills();
        System.out.println();

        myATM.withdrawMoney();
        myATM.showNumOfBills();
        row();
    }
}
