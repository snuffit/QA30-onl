package lesson_4_advanced_arrays.operatorsmore;
import java.util.Scanner;

public class OperatorsAdvanced {
    public static void main(String[] args){
        insertedOperators();
    }

    public static void returnMethod(int val){
        if (val == 1){
            System.out.println("You have 1 and it is ok");
            return; // return;
        }
    }

    public static void insertedOperators(){
        while(true){
            // создается бесконечный цикл и он должен быть изнутри
            // сломан при каком-то действии или решении программиста
            boolean isActive = false;

            System.out.print("Would you like to play?");

            String answer = null;

            // String == не будет сравнивать значение, а будет сравнивать адрес переменных
            // String name = "Archil";
            // String nameAnother = "Dima";
            // name == nameAnother -> !!! Archil == Dima, address переменной == адрес другой переменной
            // name -> address in stack, and stack address points to value in a heap
            // name == nameAnother, address of name is stack and address of nameAnother in stack
            // name.equals("___value");
            if ((answer = getInput().nextLine()).equalsIgnoreCase("y")){
                isActive = true;

                if (isActive){
                    System.out.println("Your player is active and you can move on now.");
                }
            } else {
                System.out.println("You don't want to play. GOODBYE");
                return;
            }
        }
    }

    // With LAMBDA
    public static void getModernSwitch(int dayWeek){
        switch (dayWeek){
            // Когда я убрал BREAK
            // if (dayWeek == 1 || dayWeek == 2 || dayWeek == 3 || dayWeek == 4 || dayWeek == 5) {"Working DAYS}
            // if (dayWeek == 6 || dayWeek == 7) {Holidays}
            case 1, 2, 3, 4, 5 -> System.out.println("It is from Monday to Friday. It is a working day.");
            case 6, 7 -> System.out.println("It is from Saturday to Sunday. It is a holiday.");
            default -> System.out.println("There is no such day in the week under the number: " + dayWeek);
        }
    }

    // Switch without BREAK
    public static void getSwitchNoBreak(int dayWeek){
        // What will happen if I forget BREAK?
        switch (dayWeek){
            // Когда я убрал BREAK
            // if (dayWeek == 1 || dayWeek == 2 || dayWeek == 3 || dayWeek == 4 || dayWeek == 5) {"Working DAYS}
            // if (dayWeek == 6 || dayWeek == 7) {Holidays}
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is from Monday to Friday. It is a working day.");
                break;
            case 6:
            case 7:
                System.out.println("It is from Saturday to Sunday. It is a holiday.");
                break;
            default:
                System.out.println("There is no such day in the week under the number: " + dayWeek);
                break;
        }
    }

    // Спрашивать день недели по числу до тех пор, пока я не дам какой-то знак окончания
    public static void checkDayWeek(){

        int day;

        do{
            System.out.print("Please, enter day of the week in integer number (1-7): ");
            day = getInput().nextInt();

            advancedSwitch(day);
        } while(day != -1);
    }

    public static void checkAge(){
        System.out.print("Please, tell us your age: ");

        int age;

        while((age = getInput().nextInt()) >= 18){
            System.out.println("You are adult or above: " + age);
            System.out.print("Please, tell us your age: ");
        }
    }

    // Check day behind a number
    public static void advancedSwitch(int dayWeek){
        switch (dayWeek){
            case 1:
                System.out.println("You have entered number " + dayWeek + ". It is MONDAY.");
                break;
            case 2:
                System.out.println("You have entered number " + dayWeek + ". It is TUESDAY.");
                break;
            case 3:
                System.out.println("You have entered number " + dayWeek + ". It is WEDNESDAY.");
                break;
            case 4:
                System.out.println("You have entered number " + dayWeek + ". It is THURSDAY.");
                break;
            case 5:
                System.out.println("You have entered number " + dayWeek + ". It is FRIDAY.");
                break;
            case 6:
                System.out.println("You have entered number " + dayWeek + ". It is SATURDAY.");
                break;
            case 7:
                System.out.println("You have entered number " + dayWeek + ". It is SUNDAY.");
                break;
            default:
                System.out.println("There is no such day in the week under the number: " + dayWeek);
                break;
        }
    }

    public static Scanner getInput(){
        return new Scanner(System.in);
    }
}
