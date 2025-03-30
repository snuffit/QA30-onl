package homework.homework_8.additional_task.documents;

public class Register {
    private Documents[] documents = new Documents[10];
    private int sizeCounter = 0;

    public void saveToRegister(Documents doc){
        if (sizeCounter < documents.length) {
            this.documents[sizeCounter] = doc;
            sizeCounter++;
        }else {
            System.out.println("В Регистре больше нет места!");
        }
    }
    public void info(int numOfDoc){
        if(numOfDoc <= (this.sizeCounter)){
            documents[numOfDoc - 1].DocInfo();
        }else {
            System.out.println("Документа под этим номером нету!");
        }
    }

    public int getSizeCounter() {
        return sizeCounter;
    }
}
