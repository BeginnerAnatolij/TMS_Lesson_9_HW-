package Lesson9.Figures;

import Lesson9.Figures.Figure;

public class RightTraingle extends Figure {
    private int leg1;
    private int leg2;
    private int hypotenuse;

    public RightTraingle(int leg1, int leg2, int hypotenuse) {
        this.hypotenuse = hypotenuse;
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double Square() {
        return 0.5 * (getLeg1() * getLeg2());
    }
    /*Получение площали прямоугольного треугольника*/

    @Override
    public double Perimeter() {
        return getLeg1() + getLeg2() + getHypotenuse();
    }
    /*Получение периметра прямоугольного треугольника*/

    public int getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(int hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public int getLeg1() {
        return leg1;
    }

    public void setLeg1(int leg1) {
        this.leg1 = leg1;
    }

    public int getLeg2() {
        return leg2;
    }

    public void setLeg2(int leg2) {
        this.leg2 = leg2;
    }
}
