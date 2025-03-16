package lesson_3_operators_loops.scannerbasic;
import java.util.Scanner;
public class Sanner {
        public static void main(String[] args) {
            getMyPersonalData();
        }

        public static void getMyPersonalData(){
            // Usually, all data comes into STRING FORMAT
            Scanner input = new Scanner(System.in);
            System.out.print("Please, enter your name: ");
            String name = input.nextLine();
            System.out.print("Please, enter your family name: ");
            String familyName = input.nextLine();
            System.out.print("Please, enter your age: ");
            String age = input.nextLine();
            System.out.print("Please, enter your occupation: ");
            String occupation = input.nextLine();

            System.out.println("*******************************************");
            System.out.println("Name: " + name);
            System.out.println("Family name: " + familyName);
            System.out.println("Age: " + age);
            System.out.println("Occupation: " + occupation);
        }
}
