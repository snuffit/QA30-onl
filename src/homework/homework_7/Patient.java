package homework.homework_7;

public class Patient {
    private String name;
    private TreatmentPlan treatmentPlan;
    private Doctor doctor;

    public Patient(String name, TreatmentPlan treatmentPlan){
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }
    public void addDoctor(Doctor doctor){
        this.doctor = doctor;
    }
    public int getTreatmentPlan(){
        return treatmentPlan.getCode();
    }
    public void healByDoctor(){
        System.out.println(doctor.getName() + " " + doctor.heal() + ", пациенту по имени " + this.name + ".");
    }
}
