package homework.homework_8.figures;

public class Circle extends Figures{
    private double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        super.perimeter();
        return 2 * 3.16 * radius;

    }

    @Override
    public double square() {
        super.square();
        return 3.16 * Math.pow(radius, 2);
    }
}
