package interfacFigure;

public class Circle implements Figure {

  private double r;

  @Override
  public void getArea() {
    double circleArea = PI * r * r;
    System.out.println("Circle Area : " + circleArea);
  }

  public Circle(double r) {
    this.r = r;
  }

  public double getR() {
    return r;
  }

  public void setR(double r) {
    this.r = r;
  }
}