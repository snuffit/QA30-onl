package homework.homework_8.additional_task.documents;

public class FinanceInvoice extends Documents{
    private int numOfDoc;
    private int departmentCode;
    private int finalSum;


    public FinanceInvoice(int numOfDoc, int departmentCode, int finalSum){
        super();
        this.numOfDoc = numOfDoc;
        this.departmentCode = departmentCode;
        this.finalSum = finalSum;
    }
    public FinanceInvoice(){
        super();
        this.numOfDoc = 0;
        this.departmentCode = 0;
        this.finalSum = 0;
    }



    @Override
    public void DocInfo() {
        super.DocInfo();
        System.out.println("Номер документа: " + this.numOfDoc + "\n" +
                "Код департамента: " + this.departmentCode + "\n" + "Итоговая сумма: " + this.finalSum);
    }
}
