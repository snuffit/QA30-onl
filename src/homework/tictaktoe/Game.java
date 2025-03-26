package homework.tictaktoe;

import java.util.Random;

import static homework.tictaktoe.Main.input;
import static homework.tictaktoe.Main.row;

public class Game {
    public char[][] field = new char[][]{
            {'*', '*', '*'},
            {'*', '*', '*'},
            {'*', '*', '*'}
    };
    private Player player = new Player();
    private AI ai = new AI();
    private int winPlayer = 0;

    public void startGame() {
        row();
        System.out.println("Добро пожаловать в игру TikTakToe!");
        System.out.println("Ты будешь играть с ИИ.");
        System.out.println("Чтобы поставить свой знак - введи номер ячейки");
        System.out.println("сетки игрового поля. (от 1 по 9)");
        row();
    }
    public Boolean doYouWantPlay() {
        System.out.println("Вы хотите сыграть?\n(Если да - y, если нет - то что-нибудь другое)");
        if (input().nextLine().compareToIgnoreCase("y") == 0) {
            row();
            System.out.println("Отлично, начнем игру!!!");
            row();
            return true;
        } else {
            System.out.println("Тогда прощайте");
            row();
            return false;
        }
    }
    public void whoFirst() {
        Random random = new Random();
        int s = random.nextInt(100);
        if (s > 50) {
            player.setSequence(1);
            ai.setSequence(2);
            System.out.println("Первым ходишь ты!");
            row();
        } else {
            player.setSequence(2);
            ai.setSequence(1);
            System.out.println("Первым ходит ИИ!");
            row();
        }
    }
    public void printField() {
        for (char[] outer : this.field) {
            for (char inner : outer) {
                System.out.print(inner + "\t");
            }
            System.out.println();
        }
        row();
    }
    public void fillField() {
        boolean someoneWin = false;
        if (player.getSequence() == 1) {
            while (!someoneWin) {
                printField();
                player.inputSymbol(this.field);
                printField();
                if(check(field)){
                    someoneWin = true;
                }
                ai.inputSymbol(this.field);
                if(check(field)){
                    someoneWin = true;
                }
            }
        } else {
            while (!someoneWin) {
                printField();
                ai.inputSymbol(this.field);
                printField();
                if(check(field)){
                    someoneWin = true;
                }
                player.inputSymbol(this.field);
                if(check(field)){
                    someoneWin = true;
                }
            }
        }

    }
    public void congratulation(){
        if(winPlayer == player.getSequence()){
            System.out.println("Поздравляем с победой!!!");
        }else {
            System.out.println("Победил ИИ, старайсля лучше!!!");
        }
    }
    private boolean check(char[][] field) {
        if((checkRow(field) != 0) ||
                (checkColomn(field) != 0) ||
                (checkCrossL(field) != 0) ||
                (checkCrossR(field) != 0)){
            return true;
        }
        return false;
    }

    private int checkRow(char[][] field) {
        for (int outer = 0; outer < 3; outer++) {
            int countFirstX = 0;
            int countSecondO = 0;
            for (int inner = 0; inner < 3; inner++) {
                if (field[outer][inner] == 'X') {
                    countFirstX++;
                    if (countFirstX == 3) {
                        winPlayer = 1;
                        return 1;
                    }
                } else if (field[outer][inner] == 'O') {
                    countSecondO++;
                    if (countSecondO == 3) {
                        winPlayer = 2;
                        return 2;
                    }
                }
            }
        }
        return 0;
    }
    private int checkColomn(char[][] field) {
        for (int inner = 0; inner < 3; inner++) {
            int countFirstX = 0;
            int countSecondO = 0;
            for (int outer = 0; outer < 3; outer++) {
                if (field[outer][inner] == 'X') {
                    countFirstX++;
                    if (countFirstX == 3) {
                        winPlayer = 1;
                        return 1;
                    }
                } else if (field[outer][inner] == 'O') {
                    countSecondO++;
                    if (countSecondO == 3) {
                        winPlayer = 2;
                        return 2;
                    }
                }
            }
        }
        return 0;
    }
    private int checkCrossL(char[][] field) {
        int countFirstX = 0;
        int countSecondO = 0;
        for (int outer = 0; outer < 3; outer++) {

            if (field[outer][outer] == 'X') {
                countFirstX++;
                if (countFirstX == 3) {
                    winPlayer = 1;
                    return 1;
                }
            } else if (field[outer][outer] == 'O') {
                countSecondO++;
                if (countSecondO == 3) {
                    winPlayer = 2;
                    return 2;
                }
            }
        }
        return 0;
    }
    private int checkCrossR(char[][] field) {
        int countFirstX = 0;
        int countSecondO = 0;
        for (int inner = 0; inner < 3; inner++) {

            if (field[0 + inner][2 - inner] == 'X') {
                countFirstX++;
                if (countFirstX == 3) {
                    winPlayer = 1;
                    return 1;
                }
            } else if (field[0 + inner][2 - inner] == 'O') {
                countSecondO++;
                if (countSecondO == 3) {
                    winPlayer = 2;
                    return 2;
                }
            }
        }
        return 0;
    }


}
