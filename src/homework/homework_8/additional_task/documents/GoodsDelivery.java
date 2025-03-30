package homework.homework_8.additional_task.documents;

import java.util.Date;

public class GoodsDelivery extends Documents{
    private int numOfDoc;
    private String typeOfGoods;
    private int amount;


    public GoodsDelivery(int numOfDoc, String typeOfGoods, int amount){
        super();
        this.numOfDoc = numOfDoc;
        this.typeOfGoods = typeOfGoods;
        this.amount = amount;
    }
    public GoodsDelivery(){
        super();
        this.numOfDoc = 0;
        this.typeOfGoods = "NULL";
        this.amount = 0;
    }



    @Override
    public void DocInfo() {
        super.DocInfo();
        System.out.println("Номер документа: " + this.numOfDoc + "\n" +
                "Тип товара: " + this.typeOfGoods + "\n" + "Количество: " + this.amount);
    }
}
