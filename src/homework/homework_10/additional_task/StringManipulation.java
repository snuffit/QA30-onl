package homework.homework_10.additional_task;

import java.util.Scanner;

import static homework.homework_3.HmOperators.row;

public class StringManipulation {


    public static void printShortLongWordInLine(){
        System.out.println("Введите строку и программа напечатает самое короткое и самое длинное слово.");
        System.out.print("Ваша строка: ");
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        row();
        printShortWordInLine(line);
        printLongWordInLine(line);
    }
    private static void printShortWordInLine(String line){
        String[] words = line.split("\\s+");
        String shortWord = words[0];
        for(String word : words){
            if(shortWord.length() >= word.length()){
                shortWord = word;
            }
        }
        System.out.println("Самое короткое слово: " + shortWord);
        row();
    }
    private static void printLongWordInLine(String line){
        String[] words = line.split("\\s+");
        String longWord = words[0];
        for(String word : words){
            if(longWord.length() <= word.length()){
                longWord = word;
            }
        }
        System.out.println("Самое короткое слово: " + longWord);
        row();
    }

    public static void uniqueCharsFinder(){
        System.out.println("Введите строку и программа напечатает слово с наименьшим количеством уникальных символов.");
        System.out.print("Ваша строка: ");
        String line = input().nextLine();
        row();

        String[] words = line.split("\\s+");
        String result = words[words.length - 1];

        for(int i = (words.length - 1); i >= 0; i--){
            if(counterUniqueChars(result) >= counterUniqueChars(words[i])){
                result = words[i];
            }
        }
        System.out.println("Слово с наименьшим количеством уникальных символов: " + result);
        row();
    }

    private static int counterUniqueChars(String line){
        boolean[] uniqueChars = new boolean[128];
        char[] word = line.toLowerCase().toCharArray();
        int counter = 0;
        for(char el : word){
            if(!uniqueChars[el]){
                uniqueChars[el] = true;
                counter++;
            }
        }
        return counter;
    }

    public static void isPalindrome(){
        System.out.print("Введите строку: ");
        String line = input().nextLine();
        row();

        String[] words = line.split("\\s+");
        int numOfWord = checkNumOfWord(words);
        if(checkPalindrome(words, numOfWord)){
            System.out.println("Слово " + words[numOfWord] + " - полиндром");
        }else{System.out.println("Слово " + words[numOfWord] + " - не полиндром");}
        row();
    }
    private static boolean checkPalindrome(String[] words, int numOfWord){
        StringBuilder word = new StringBuilder(words[numOfWord]);
        if(words[numOfWord].equalsIgnoreCase(String.valueOf(word.reverse()))){
            return true;
        }
        return false;
    }
    private static int checkNumOfWord(String[] words){
        while (true){
            System.out.print("Введите номер слова, которорое нужно проверить, является ли оно палиндромом: ");
            int numOfWord = input().nextInt();
            row();
            if(numOfWord > 0 && numOfWord <= words.length){
                return numOfWord - 1;
            }
            System.out.println("Слова под этим номером нету!");
            row();
        }
    }

    public static void doubleAllLetters(){
        System.out.print("Введите слово, в котором хотите удвоить все буквы: ");
        StringBuilder line = new StringBuilder(input().nextLine());
        for (int i = 0; i < line.length(); i+=2){
            line.insert(i, line.charAt(i));
        }
        System.out.println(line);

    }

    private static Scanner input(){return new Scanner(System.in);}
}
