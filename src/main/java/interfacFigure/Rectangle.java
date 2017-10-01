package interfacFigure;


public class Rectangle extends Quadrangle {

  public Rectangle(double a, double b) {
    super(a, b);
  }

  @Override
  public void getArea() {
    double area = getA() * getB();
    System.out.println("Rectangle area : " + area);
  }

}