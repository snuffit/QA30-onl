package homework.homework_10.num_of_doc;

import static homework.homework_5.HM.input;
import static homework.homework_5.HM.row;

public class NumOfDoc {
    private String numOfDoc;
    private int[] arrayOfNumIndex = new int[]{0,1,2,3, 9,10,11,12, 18, 20};
    private int[] arrayOfLetterIndex = new int[]{5,6,7, 14,15,16, 19, 21};

    private void instrution(){
        System.out.println(
                "Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква. " +
                        "\nСтрока для проверки 5556-aBc-1234-asd-1a2b");
        System.out.print("Введите номер документа: ");
    }

    public void setNumOfDoc(){
        String input = "NULL";
        boolean correct = false;
        row();
        while (!correct){
            instrution();
            input = input().nextLine();
            if(checkCorrectInput(input)){
                correct = true;
                continue;
            }
            System.out.println("Номер введен не верно!");
            row();
        }
        System.out.println("Номер введен верно!");
        this.numOfDoc = input;
        row();
    }

    public String getNumOfDoc() {
        return numOfDoc;
    }

    public int[] getArrayOfNumIndex() {
        return arrayOfNumIndex;
    }

    public int[] getArrayOfLetterIndex() {
        return arrayOfLetterIndex;
    }

    private boolean checkCorrectInput(String numOfDoc){
        if(checkHyphen(numOfDoc) && checkLength(numOfDoc)
                && checkNumInDoc(numOfDoc) && checkLetters(numOfDoc)){
            return true;
        }
        return false;
    }
    private boolean checkLetters(String numOfDoc){
        for(int i = 0, count = 0; i < numOfDoc.length(); i++){
            if(i == arrayOfNumIndex[count]){
                if(count < (arrayOfNumIndex.length - 1)){
                    count++;
                }
            }else{
                if(checkNumbers(numOfDoc, i)){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean checkNumInDoc(String numOfDoc){

        for (int el : this.arrayOfNumIndex){
            if(!checkNumbers(numOfDoc, el)){
                return false;
            }
        }
        return true;
    }
    private boolean checkNumbers(String numOfDoc, int indexOfChar){
        return Character.isDigit(numOfDoc.charAt(indexOfChar));
    }
    private boolean checkHyphen(String numOfDoc){
        if((numOfDoc.charAt(4) == numOfDoc.charAt(8)) &&
                (numOfDoc.charAt(8) == numOfDoc.charAt(13)) &&
                (numOfDoc.charAt(13) == numOfDoc.charAt(17)) &&
                (numOfDoc.charAt(17) == '-')){
            return true;
        }
        return false;
    }
    private boolean checkLength(String numOfDoc){
        if(numOfDoc.length() == 22){
            return true;
        }
        return false;
    }




}
