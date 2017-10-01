package interfacFigure;

public abstract class Quadrangle implements Figure {

  private double a;
  private double b;

  public Quadrangle(double a) {
    this.a = a;
  }

  public Quadrangle(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }
}