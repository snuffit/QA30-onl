package homework.guess_word;

public class Main {
    //1. Приветствие и правила
    //2. Хотите сынрать?
    //3. Из базы слов выбирается слово для игры
    //4. Пользователь вводит букву и выводится слово со звездочкачи вместо неразгаданных букв
    //5. Игра идет, пока пользователь не отгадает все буквы
    public static void main(String[] args) {
        WordGame game = new WordGame();
        game.randomWord();
        game.printGuessWord();
    }
}
