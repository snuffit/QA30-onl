package homework.homework_8.additional_task.documents;

import java.util.Date;

public abstract class Documents implements PrintDocInfo {
    Date date;

    public Documents(){
        this.date = new Date();
    }
    @Override
    public void DocInfo() {
        System.out.println(this.date);
    }
}
