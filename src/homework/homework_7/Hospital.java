package homework.homework_7;

public class Hospital {
    //Создать программу для имитации работы клиники.
    //Пусть в клинике будет три врача: хирург, терапевт и дантист.
    //Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
    //Так же предусмотреть класс «Пациент» и класс «План лечения».
    //Создать объект класса «Пациент» и добавить пациенту план лечения.
    //Так же создать метод, который будет назначать врача пациенту согласно
    //плану лечения.
    //Если план лечения имеет код 1 – назначить хирурга и выполнить метод
    //лечить.
    //Если план лечения имеет код 2 – назначить дантиста и выполнить метод
    //лечить.
    //Если план лечения имеет любой другой код – назначить терапевта и
    //выполнить метод лечить.

    private Doctor surgeon = new Doctor("Хирург", "вправляет ногу");
    private Doctor therapist = new Doctor("Терапевт", "выписывает таблетки");
    private Doctor dentist = new Doctor("Дантист", "лечит зубы");
    private Patient[] patients;

    public Hospital(Patient... patients){
        this.patients = patients;
    }

    public void addDoctorToAllPatients(){
        for(Patient pt : this.patients){
            addDoctorToPatient(pt);
            System.out.println("-----------------");
        }
    }
    public void addDoctorToPatient(Patient patient){
        switch (patient.getTreatmentPlan()){
            case 1:
                patient.addDoctor(surgeon);
                patient.healByDoctor();
                break;
            case 2:
                patient.addDoctor(dentist);
                patient.healByDoctor();
                break;
            case 3:
                patient.addDoctor(therapist);
                patient.healByDoctor();
                break;
        }
    }
    public void getAllInfo(){
        System.out.printf("В больнице находится %d пациентов.\n" +
                "Информация по лечению в данный момент:\n", patients.length);
        addDoctorToAllPatients();

    }
}

class Doctor{
    private String name;
    private String typeOfHeal;

    public Doctor(String name, String typeOfHeal){
        this.name = name;
        this.typeOfHeal = typeOfHeal;
    }

    public String heal() {
        return typeOfHeal;
    }

    public String getName(){
        return name;
    }
}

