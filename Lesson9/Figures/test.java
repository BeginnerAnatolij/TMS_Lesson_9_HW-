package Lesson9.Figures;

import Lesson9.Figures.Circle;
import Lesson9.Figures.Figure;
import Lesson9.Figures.Rectangle;
import Lesson9.Figures.RightTraingle;

public class test {
    public static void main(String[] args) {
/* Создание массива объектов, получение суммы периметра всех объектов*/
    Figure[] name = { new RightTraingle(2,8,16),
            new Circle(5),
            new Circle(18),
            new Rectangle(9,19),
            new Circle(7)};
    double sum = 0;
         for(Figure figure : name){
             sum=sum+ figure.Perimeter();
        //System.out.println("Периметр:" + figure.Perimeter()+ "  Площадь фигуры:" + figure.Square());
    }
        System.out.println("Сумма периметров:" + sum);
    }
}
