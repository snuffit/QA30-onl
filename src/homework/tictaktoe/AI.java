package homework.tictaktoe;

import java.util.Random;

public class AI {
    private int sequence;

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
    public char getSymbol() {
        if(this.sequence == 1) {
            return 'X';
        }else {
            return 'O';
        }
    }

    public void inputSymbol(char[][] field){
        Random random = new Random();
        do {
            int num = random.nextInt(9) + 1;
            if(!inputCheck(num, field)){
                return;
            }

        }while (true);
    }
    private boolean inputCheck(int random, char[][] field){
        int index = 1;
        for (int outer = 0; outer < field.length; outer++){
            for (int inner = 0; inner < field[outer].length; inner++){
                if(index == random){
                    if(field[outer][inner] == '*'){
                        field[outer][inner] = getSymbol();
                        return false;
                    }else {
                        return true;
                    }
                } else {
                    index++;
                }
            }
        }
        return true;
    }
}
