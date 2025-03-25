package homework.homework_7;

public class Phone {
    //Класс Phone.
    //Создайте класс Phone, который содержит переменные number, model и
    //weight.
    //Создайте три экземпляра этого класса.
    //Выведите на консоль значения их переменных.
    //Добавить в класс Phone методы: receiveCall, имеет один параметр – имя
    //звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber –
    //возвращает номер телефона. Вызвать эти методы для каждого из
    //объектов.
    //Добавить конструктор в класс Phone, который принимает на вход три
    //параметра для инициализации переменных класса - number, model и
    //weight.
    //Добавить конструктор, который принимает на вход два параметра для
    //инициализации переменных класса - number, model.
    //Добавить конструктор без параметров.
    //Вызвать из конструктора с тремя параметрами конструктор с двумя.
    //Добавьте перегруженный метод receiveCall, который принимает два
    //параметра - имя звонящего и номер телефона звонящего. Вызвать этот
    //метод.
    //Создать метод sendMessage с аргументами переменной длины. Данный
    //метод принимает на вход номера телефонов, которым будет отправлено
    //сообщение. Метод выводит на консоль номера этих телефонов.

    private String model;
    private long number;
    private int weight;

    public Phone(String model, long number, int weight){
        this(model, number);
        this.weight = weight;
    }
    public Phone(String model, long number){
        this.model = model;
        this.number = number;
        this.weight = 0;
    }
    public Phone(){
        this.model = "Unknown";
        this.number = 375000000000l;
        this.weight = 0;
    }
    public void receiveCall(String name){
        System.out.println("Зовонит " + name);
    }
    public long getNumber(){
        return number;
    }
    public void receiveCall(String name, long number){
        System.out.println("Зовонит " + name +", номер: +" + number);
    }
    public void sendMessage(long... nums){
        System.out.println("Отправить сообщения по этим номерам: ");
        for(long el : nums){
            System.out.println("+" + el);
        }
    }
    public void allInfo(){
        System.out.println("Номер: +" + number + "\n" +
                "Модель: " + model + "\n" +
                "Вес: " + weight);
    }
}
