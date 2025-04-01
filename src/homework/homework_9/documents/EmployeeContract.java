package homework.homework_9.documents;

import java.time.LocalDate;

public class EmployeeContract extends Documents {
    LocalDate endDate ;
    private String nameOfEmp;


    public EmployeeContract(String numOfDoc, String yyyy_mm_dd, String nameOfEmp){
        super(numOfDoc);
        this.endDate = LocalDate.parse(yyyy_mm_dd);
        this.nameOfEmp = nameOfEmp;
    }
    public EmployeeContract(){
        super();
        this.endDate = LocalDate.parse("0000-01-01");
        this.nameOfEmp = "NULL";
    }



    @Override
    public void DocInfo() {
        super.DocInfo();
        System.out.println("Имя работника: " + this.nameOfEmp + "\n" + "Дата окончания контракта: " + this.endDate);
    }
}
