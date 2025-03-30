package homework.guess_word;

import java.util.Random;

public class WordGame {
    private String[] words = new String[]{"СЛОВО", "ДЖАВА", "ИГРОК", "СЛОН", "ДЕНЬГИ",
            "АЛКОГОЛЬ", "КОМПИЛЯТОР" , "НОВОСТИ", "ПЕРСОНАЖ"};
    private char[] guessWord;

    public WordGame(){}
    public void randomWord(){
        Random random = new Random();
        this.guessWord = this.words[random.nextInt(this.words.length)].toCharArray();
    }

    public void printGuessWord(){
        for(char ch : this.guessWord){
            System.out.print(ch);
        }
        System.out.println();
    }

    public void game(){}
}
