package homework.homework_6;

public class HDD {
    private String name;
    private int size;
    private String type;

    public HDD(){
        name = "Unknown";
        size = 0;
        type = "Внутренний";
    }
    public HDD(String name, int size, boolean isInternal){
        this.name = name;
        this.size = size;
        if(isInternal){
            this.type = "Внутренний";
        }else {
            this.type = "Внешний";
        }
    }
    public void allInfo(){
        System.out.println("Название: " + name);
        System.out.println("Размер: " + size);
        System.out.println("Тип: " + size);
    }
}
