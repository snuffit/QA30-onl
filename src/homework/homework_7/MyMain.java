package homework.homework_7;

public class MyMain {
    public static void main(String[] args) {
        task1();

        task2();
    }
    public static void row() {
        System.out.println("*******************************************");
    }

    public static void task1(){
        row();
        Phone firstPhone = new Phone("Samsung 3s", 375298584433l, 233);
        Phone secondPhone = new Phone("Iphone 11", 375298545633l);
        Phone thirdPhone = new Phone();

        testForTask1(firstPhone, secondPhone, thirdPhone);

    }
    public static void testForTask1(Phone... phones){
        for (Phone el : phones){
            el.allInfo();
            el.receiveCall("Босс");
            System.out.println("На номер +" + el.getNumber());
            el.receiveCall("Босс 2", 375441234567l);
            el.sendMessage(375441234567l, 375297654321l, 48222123456l);
            row();
        }
    }

    public static void task2(){
        Patient petya = new Patient("Petya", TreatmentPlan.CodeOne);
        Patient alla = new Patient("Alla", TreatmentPlan.CodeTwo);
        Patient sasha = new Patient("Sasha", TreatmentPlan.CodeTwo);
        Patient nadya = new Patient("Nadya", TreatmentPlan.CodeThree);
        Patient tolik = new Patient("Tolik", TreatmentPlan.CodeOne);

        Hospital petrushkino = new Hospital(petya, alla, sasha, nadya, tolik);
        petrushkino.getAllInfo();
        row();
    }
}
