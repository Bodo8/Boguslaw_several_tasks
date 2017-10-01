package interfacFigure;

public class Square extends Quadrangle {

  public Square(double a) {
    super(a);
  }

  @Override
  public void getArea() {
    double area = getA() * getA();
    System.out.println("Square area = " + area);
  }

}
