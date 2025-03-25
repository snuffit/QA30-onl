package homework.homework_6;

public class Computer {
    //Создать класс для описания компьютера, в этом классе должны быть
    //поля: стоимость, модель(строковый тип), RAM и HDD.
    //Для полей RAM и HDD следует создать свои собственные классы.
    //Классы для RAM и HDD должны иметь конструктор по умолчанию и
    //конструктор со всеми параметрами.
    //Класс RAM имеет поля "название" и "объем".
    //Класс HDD имеет поля "название", "объем" и "тип" (внешний или
    //внутренний).
    //Класс Computer должен иметь два конструктора:
    //- первый - с параметрами стоимость и модель,
    //- второй - со всеми полями.
    //При создании объекта "компьютер" с помощью первого конструктора
    //должны создаваться поля RAM и HDD с помощью конструкторов по
    //умолчанию.
    //В каждом из классов предусмотреть методы для вывода полной
    //информации (вывод всех полей и всех значений).

    private int value;
    private String model;
    private HDD hdd;
    private RAM ram;

    public Computer(int value, String model){
        this.value = value;
        this.model = model;
        hdd = new HDD();
        ram = new RAM();
    }
    public Computer(int value, String model, String nameRAM, int sizeRAM, String nameHDD, int sizeHDD, boolean isInternalHDD){
        this.value = value;
        this.model = model;
        hdd = new HDD(nameHDD, sizeHDD, isInternalHDD);
        ram = new RAM(nameRAM, sizeRAM);
    }

    public void allInfo(){
        System.out.println("Модель: " + model);
        System.out.println("Цена: " + value);
        System.out.println("******RAM******");
        ram.allInfo();
        System.out.println("******HDD******");
        hdd.allInfo();
    }

}
