package Lesson9.Figures;

public class Circle extends Figure {
    private double radius;
    final double Pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Square() {
        return Pi * getRadius() * getRadius();
    }
    /*Площадь круга*/

    @Override
    public double Perimeter() {
        return 2 * Pi * getRadius();
    }
    /*Периметр круга*/

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
