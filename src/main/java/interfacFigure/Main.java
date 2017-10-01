package interfacFigure;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Circle circle = new Circle(4);
    circle.getArea();
    Triangle triangle = new Triangle(4, 8);
    triangle.getArea();
    Square square = new Square(5);
    square.getArea();
    Rectangle rectangle = new Rectangle(4, 2);
    rectangle.getArea();

    Figure squa = new Square(5);
    squa.getArea();

    List<Figure> figures = Arrays.asList(circle, triangle, square, rectangle);
    figures.forEach(Figure::getArea);

  }
}