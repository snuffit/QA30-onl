package homework.homework_9.documents;

public class FinanceInvoice extends Documents {
    private int departmentCode;
    private int finalSum;


    public FinanceInvoice(String numOfDoc, int departmentCode, int finalSum){
        super(numOfDoc);
        this.departmentCode = departmentCode;
        this.finalSum = finalSum;
    }
    public FinanceInvoice(){
        super();
        this.departmentCode = 0;
        this.finalSum = 0;
    }



    @Override
    public void DocInfo() {
        super.DocInfo();
        System.out.println("Код департамента: " + this.departmentCode + "\n" + "Итоговая сумма: " + this.finalSum);
    }
}
