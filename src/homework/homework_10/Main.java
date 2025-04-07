package homework.homework_10;

import homework.homework_10.num_of_doc.NumOfDoc;

import static homework.homework_10.string_manipulation.StringManipulation.*;

public class Main {
    public static void main(String[] args) {
        NumOfDoc doc = new NumOfDoc();
        doc.setNumOfDoc();

        printFirstTwoDigits(doc.getNumOfDoc(), doc.getArrayOfNumIndex());
        changeLettersToAsterisks(doc.getNumOfDoc(), doc.getArrayOfLetterIndex());
        printAllLetters(doc.getNumOfDoc(), doc.getArrayOfLetterIndex());
        printAllLettersWithWord(doc.getNumOfDoc(), doc.getArrayOfLetterIndex());
        isAbcIn(doc.getNumOfDoc());
        is555Start(doc.getNumOfDoc());
        is1a2bInEnd(doc.getNumOfDoc());
    }

}

