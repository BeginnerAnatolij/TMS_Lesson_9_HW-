package Lesson9.Figures;

import Lesson9.Figures.Figure;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle (int length, int width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double Square() {
        return getLength()*getWidth();
    }
    /*Получение площади прямоугольника*/

    @Override
    public double Perimeter() {
        return 2*(getLength()+getWidth());
    }
    /*Получение периметра прямоугольника*/
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
