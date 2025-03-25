package homework.homework_6;

public class RAM {
    private String name;
    private int size;
    public RAM(){
        name = "Unknown";
        size = 0;
    }
    public RAM(String name, int size){
        this.name = name;
        this.size = size;
    }
    public void allInfo(){
        System.out.println("Название: " + name);
        System.out.println("Размер: " + size);
    }
}
