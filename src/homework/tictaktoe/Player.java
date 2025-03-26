package homework.tictaktoe;


import static homework.tictaktoe.Main.input;

public class Player {

    private int sequence;

    public char getSymbol() {
        if(this.sequence == 1) {
            return 'X';
        }else {
            return 'O';
        }
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
    public int getSequence() {
        return sequence;
    }

    public void inputSymbol(char[][] field){
        int num;
        do {
            System.out.println("Введите номер клетки, куда хотите поставить " + getSymbol() + ": ");
            num = input().nextInt();
            if (num >= 1 && num <= 9){
                numToXY(num, field);
                return;
            }else {
                System.out.println("Номер введен неправильно!");
            }
        }while (true);

    }
    private void numToXY(int num, char[][] field){
        int index = 1;
        for (int outer = 0; outer < field.length; outer++){
            for (int inner = 0; inner < field[outer].length; inner++){
                if(index == num){
                    if(field[outer][inner] == '*'){
                        field[outer][inner] = getSymbol();
                        return;
                    }else {
                        System.out.println("Эта клетка уже занята!");
                        return;
                    }
                } else {
                    index++;
                }
            }
        }

    }
}
