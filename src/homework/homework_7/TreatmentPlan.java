package homework.homework_7;

public enum TreatmentPlan {
    CodeOne(1), CodeTwo(2), CodeThree(3);

    private final int code;

    TreatmentPlan(int code){
        this.code = code;
    }
    public int getCode(){
        return code;
    }
}
