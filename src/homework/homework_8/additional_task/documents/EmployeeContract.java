package homework.homework_8.additional_task.documents;

import java.time.LocalDate;

public class EmployeeContract extends Documents{
    private int numOfDoc;
    LocalDate endDate ;
    private String nameOfEmp;


    public EmployeeContract(int numOfDoc, String yyyy_mm_dd, String nameOfEmp){
        super();
        this.numOfDoc = numOfDoc;
        this.endDate = LocalDate.parse(yyyy_mm_dd);
        this.nameOfEmp = nameOfEmp;
    }
    public EmployeeContract(){
        super();
        this.numOfDoc = 0;
        this.endDate = LocalDate.parse("0000-01-01");
        this.nameOfEmp = "NULL";
    }



    @Override
    public void DocInfo() {
        super.DocInfo();
        System.out.println("Номер документа: " + this.numOfDoc + "\n" +
                "Имя работника: " + this.nameOfEmp + "\n" + "Дата окончания контракта: " + this.endDate);
    }
}
