package homework.homework_9.documents;

public class GoodsDelivery extends Documents {

    private String typeOfGoods;
    private int amount;


    public GoodsDelivery(String numOfDoc, String typeOfGoods, int amount){
        super(numOfDoc);
        this.typeOfGoods = typeOfGoods;
        this.amount = amount;
    }
    public GoodsDelivery(){
        super();
        this.typeOfGoods = "NULL";
        this.amount = 0;
    }



    @Override
    public void DocInfo() {
        super.DocInfo();
        System.out.println("Тип товара: " + this.typeOfGoods + "\n" + "Количество: " + this.amount);
    }
}
