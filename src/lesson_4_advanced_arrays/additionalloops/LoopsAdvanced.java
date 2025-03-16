package lesson_4_advanced_arrays.additionalloops;

public class LoopsAdvanced {
    public static void main(String[] args){
        // Advanced LOOPS

        // Если нам нужно банально записывать, обрабатывать данные, притворять в жизнь больше коды
        // То мы используем классические массивы: do while, while, fore

        // Но если нам нужно обеспечить защиту данных и просто что-то читать
        // То мы используем т.н. усиленный вариант for, for-loop
        advancedFor();
    }

    public static void advancedFor(){
        String java = "Welcome to Java";

        // string.toCharArray() - превращает вашу строчку в набор символов отдельный
        // 'W', 'e', 'l', 'c', 'o', 'm', 'e'...
        for (char letter : java.toCharArray()){
            System.out.println("Your letter is: " + letter);
        }
    }

    public static void readLetters(){
        // ASCII Table
        // From big A to big Z
        // ASCII Table 65 == 'A'
        for (int index = 1, letter = 65; index <= 26; index++, letter++){
            System.out.println("ASCII Table " + letter + " equals to " + (char) letter);
        }
    }
}
