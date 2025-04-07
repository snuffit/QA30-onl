package homework.homework_10.string_manipulation;

import homework.homework_10.num_of_doc.NumOfDoc;

import static homework.homework_5.HM.row;

public class StringManipulation {
    //Вывести на экран в одну строку два первых блока по 4 цифры.
    //Вывести на экран номер документа, но блоки из трех букв заменить
    //на *** (каждая буква заменятся на *).
    //Вывести на экран только одни буквы из номера документа в
    //формате yyy/yyy/y/y в нижнем регистре.
    //Вывести на экран буквы из номера документа в формате
    //"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
    //класса StringBuilder).
    //Проверить содержит ли номер документа последовательность abc и
    //вывети сообщение содержит или нет(причем, abc и ABC считается
    //одинаковой последовательностью).
    //Проверить начинается ли номер документа с последовательности 555
    //Проверить заканчивается ли номер документа на
    //последовательность 1a2b.
    public static void printFirstTwoDigits(String numOfDoc, int[] arrayOfNumIndex){
        System.out.print("Два первых блока по 4 цифры: ");
        for (int i = 0; i < 8; i++){
            System.out.print(numOfDoc.charAt(arrayOfNumIndex[i]));
        }
        System.out.println();
        row();
    }
    public static void changeLettersToAsterisks(String numOfDoc, int[] arrayOfLetterIndex){
        StringBuilder  strB = new StringBuilder(numOfDoc);
        for(int i = 0; i < 6; i++){
            strB.setCharAt(arrayOfLetterIndex[i], '*');
        }
        System.out.println(strB);
        row();
    }
    public static void printAllLetters(String numOfDoc, int[] arrayOfLetterIndex){
        StringBuilder strB = new StringBuilder();
        strB = onlyLetters(strB, numOfDoc, arrayOfLetterIndex);

        String lowerStrB = strB.toString().toLowerCase();
        System.out.println(lowerStrB);
        row();
    }
    public static StringBuilder onlyLetters(StringBuilder strB, String numOfDoc, int[] arrayOfLetterIndex){
        for(int i = 0; i < arrayOfLetterIndex.length; i++){
            if(i > 0){
                if((arrayOfLetterIndex[i - 1] + 1) == arrayOfLetterIndex[i]){
                    strB.append(numOfDoc.charAt(arrayOfLetterIndex[i]));
                }else {
                    strB.append('/');
                    strB.append(numOfDoc.charAt(arrayOfLetterIndex[i]));
                }

            }else {
                strB.append(numOfDoc.charAt(arrayOfLetterIndex[0]));
            }
        }
        return strB;
    }
    public static void  printAllLettersWithWord(String numOfDoc, int[] arrayOfLetterIndex){
        StringBuilder strB = new StringBuilder("Letters:");
        strB = onlyLetters(strB, numOfDoc, arrayOfLetterIndex);

        String lowerStrB = strB.toString().toUpperCase();
        System.out.println(lowerStrB);
        row();
    }
    public static void isAbcIn(String numOfDoc){
        if(numOfDoc.toLowerCase().contains("abc")){
            System.out.println("В номере документа есть последовательность abc.");
        }else {
            System.out.println("В номере документа нет последовательности abc.");
        }
        row();
    }
    public static void is555Start(String numOfDoc){
        if(numOfDoc.startsWith("555")){
            System.out.println("Документ начинается с 555.");
        }else {
            System.out.println("Документ не начинается с 555.");
        }
        row();
    }
    public static void is1a2bInEnd(String numOfDoc){
        if(numOfDoc.endsWith("1a2b")){
            System.out.println("Документ заканчивается на 1a2b.");
        }else {
            System.out.println("Документ не заканчивается на 1a2b.");
        }
        row();
    }
}
