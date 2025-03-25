package homework.homework_6;

import java.util.Scanner;

public class CreditCard {
    //Создать класс CreditCard c полями номер счета, текущая сумма на счету.
    //Добавьте метод, который позволяет начислять сумму на кредитную
    //карточку.
    //Добавьте метод, который позволяет снимать с карточки некоторую
    //сумму.
    //Добавьте метод, который выводит текущую информацию о карточке.
    //Напишите программу, которая создает три объекта класса CreditCard у
    //которых заданы номер счета и начальная сумма

    private long accountNum;
    private int balance;

    public CreditCard(long accountNum, int balance){
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void addMoneyToBalance(int money){
        balance += money;
        System.out.println("После пополнения на " + money + " у вас будет " + balance);
    }

    public void delMoneyFromBalance(int money){
        if(balance < money){
            System.out.println("Вы пытались снять " + money + " денег, но на вашем балансе только " + balance);
            return;
        }
        balance -= money;
        System.out.println("После снятия " + money + "у вас остается " + balance);
    }

    public void allInfo(){
        System.out.println("Номер счета - " + accountNum + "\n"
                + "Баланс счета - " + balance);
    }
}
