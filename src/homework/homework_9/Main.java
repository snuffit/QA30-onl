package homework.homework_9;

import homework.homework_8.additional_task.documents.*;
import homework.homework_9.documents.Documents;
import homework.homework_9.documents.EmployeeContract;
import homework.homework_9.documents.FinanceInvoice;
import homework.homework_9.documents.GoodsDelivery;
import homework.homework_9.documents.Register;

import static homework.homework_5.HM.row;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        Documents gd = new GoodsDelivery("abc1234", "boxes", 32);
        Documents ec = new EmployeeContract("5553454", "2026-09-11", "Grisha");
        Documents fi = new FinanceInvoice("gfdegs1a2b", 45, 2098);
        Documents gd2 = new GoodsDelivery();
        Documents ec2 = new EmployeeContract();
        Documents fi2 = new FinanceInvoice();
        register.saveToRegister(gd);
        register.saveToRegister(ec);
        register.saveToRegister(fi);
        register.saveToRegister(gd2);
        register.saveToRegister(ec2);
        register.saveToRegister(fi2);
        row();
        for(int i = 1; i <= register.getSizeCounter(); i++){
            register.info(i);
            row();
        }

    }
}
