package homework.homework_9.documents;

import java.util.Date;

public abstract class Documents implements PrintDocInfo {
    Date date;
    public String numOfDoc;

    public Documents(){
        this.date = new Date();
        this.numOfDoc = "Null";
    }
    public Documents(String numOfDoc){
        this.date = new Date();
        try {
            checkException(numOfDoc);
        }catch (IsAbcInStr e){
            System.out.println("Ошибка: " + e);
        }catch (IsStart555 e){
            System.out.println("Ошибка: " + e);
        }catch (IsEnd1a2b e){
            System.out.println("Ошибка: " + e);
        }
        this.numOfDoc = numOfDoc;

    }
    @Override
    public void DocInfo() {
        System.out.println(this.date);
        System.out.println("Номер документа: " + numOfDoc);
    }

    private  void checkException(String num){
        isAbcInStr(num);
        isStart555(num);
        isEnd1a2b(num);
    }

    private void isAbcInStr(String num) throws IsAbcInStr{
        if (num.contains("abc")){
            throw new IsAbcInStr("В номере документа " + num + " есть abc.");
        }
    }

    private void isStart555(String num) throws IsStart555{
        if (num.startsWith("555")){
            throw new IsStart555("В номере документа " + num + " есть 555.");
        }
    }

    private void isEnd1a2b(String num) throws IsEnd1a2b{
        if (num.endsWith("1a2b")){
            throw new IsEnd1a2b("В номере документа " + num + " есть 1a2b.");
        }
    }
}
