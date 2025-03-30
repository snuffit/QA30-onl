package homework.homework_8;

import homework.homework_8.Workers.Accountant;
import homework.homework_8.Workers.Director;
import homework.homework_8.Workers.Worker;
import homework.homework_8.figures.Circle;
import homework.homework_8.figures.Figures;
import homework.homework_8.figures.Rectangle;
import homework.homework_8.figures.Triangle;

import static homework.homework_5.HM.row;

public class Main {
    public static void main(String[] args) {
        task1();
        row();
        task2();
        row();
    }
    public static void task1(){
        Figures firstCircle = new Circle(5);
        Figures secondCircle = new Circle(3);
        Figures rectangle = new Rectangle(2, 7);
        Figures firstTriangle = new Triangle(4, 4, 4);
        Figures secondTriangle = new Triangle(3, 4, 5);

        Figures[] figures = new Figures[]{firstCircle, secondCircle, rectangle, firstTriangle, secondTriangle};

        double sum = 0;
        for (Figures el : figures){
            sum += el.perimeter();
        }
        System.out.println(sum);
    }
    public static void task2(){
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        System.out.println(
                director.printPosition() + "\n" + worker.printPosition() + "\n" + accountant.printPosition());
    }
}
