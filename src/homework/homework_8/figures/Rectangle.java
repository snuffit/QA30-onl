package homework.homework_8.figures;

public class Rectangle extends Figures {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double perimeter() {
        super.perimeter();
        return (firstSide * 2) + (secondSide * 2);

    }

    @Override
    public double square() {
        super.square();
        return firstSide * secondSide;
    }
}
