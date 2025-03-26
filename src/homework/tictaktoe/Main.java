package homework.tictaktoe;

import java.util.Scanner;

public class Main {
    //1. Приветствие и инструкция
    //2. Вопрос - Хотите сыгрыть (да -продолжаем, нет - прощаемся)
    //3. Рандомно выбирается, кто первый будет ходить
    //4. Отрисовывается поле
    //5. Ходит первый игрок
    //6. Ходит второй игрок
    //7. Проверка поля - есть ли победные комбинации
    //8. Повтор пока кто-нибудь не победит

    public static void main(String[] args) {
        realStart();
    }

    public static void row(){
        System.out.println("*************************************************");
    }
    public static Scanner input(){
        return new Scanner(System.in);
    }

    public static void realStart(){
        Game tikTakToe = new Game();

        tikTakToe.startGame();
        if(!tikTakToe.doYouWantPlay()){
            return;
        }
        tikTakToe.whoFirst();
        tikTakToe.fillField();
        tikTakToe.congratulation();
    }



}
