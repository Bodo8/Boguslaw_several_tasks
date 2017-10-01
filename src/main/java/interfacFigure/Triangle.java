package interfacFigure;

public class Triangle implements Figure {

  private double basics;
  private double height;

  @Override
  public void getArea() {
    double area = 0.5 * basics * height;
    System.out.println("Triangle area : " + area);
  }

  public Triangle(double basics, double height) {
    this.basics = basics;
    this.height = height;
  }

  public double getBasics() {
    return basics;
  }
}