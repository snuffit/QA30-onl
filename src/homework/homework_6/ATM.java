package homework.homework_6;

import java.util.Scanner;

public class ATM {
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
    private int c20;
    private int c50;
    private int c100;
    private int allMoney = ((c100 * 100) + (c50 * 50) + (c20 * 20));

    public ATM(int c20, int c50, int c100){
        this.c20 = c20;
        this.c50 = c50;
        this.c100 = c100;
    }

    public void addToATM(){
        System.out.print("Сколько вы хотите внести купюр наминалом в 20: ");
        c20 += new Scanner(System.in).nextInt();

        System.out.print("Сколько вы хотите внести купюр наминалом в 50: ");
        c50 += new Scanner(System.in).nextInt();

        System.out.print("Сколько вы хотите внести купюр наминалом в 100: ");
        c100 += new Scanner(System.in).nextInt();

        System.out.println("Купюры успешно внесены!");
    }

    public boolean withdrawMoney(){
        boolean success = false;
        int w100 = 0;
        int w50 = 0;
        int w20 = 0;
        while (!success){
            System.out.print("Введите сумму, которую хотите снять (сумма должна быть кратной 50 или 20): ");
            int input = new Scanner(System.in).nextInt();
            success = checkCorrectNum(input, w100, w50, w20);
            if(success){
                continue;
            }
            System.out.println("Неккоректная сумма. повторите попытку.");
        }
        return true;
    }
    private boolean checkCorrectNum(int input, int w100, int w50, int w20){
            int balance = input;
            if(balance < allMoney){
                return false;
            }

            if((balance / 100) >= 1){
                w100 = balance / 100;
                balance -= w100 * 100;
            }
            if((balance / 50) >= 1){
                w50 = balance / 50;
                balance -= w50 * 50;
            }
            if((balance / 20) >= 1){
                w20 = balance / 20;
                balance -= w20 * 20;
            }
            if(balance == 0){
                c100 -= w100;
                c50 -= w50;
                c20 -= w20;
                System.out.println("Вам выданна сумма - " + allMoney + "\n" +
                        "Выданно:" + "\n" +
                        "Купюр по 100 - " + w100 + "\n" +
                        "Купюр по 50 - " + w50 + "\n" +
                        "Купюр по 20 - " + w20);

                return true;
            }else {
                return false;
            }
    }

    public void showNumOfBills(){
        System.out.println("Общая сумма - " + ((c100 * 100) + (c50 * 50) + (c20 * 20)) + "\n" +
                "В банкомате:" + "\n" +
                "Купюр по 100 - " + c100 + "\n" +
                "Купюр по 50 - " + c50 + "\n" +
                "Купюр по 20 - " + c20);
    }
}
