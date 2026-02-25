public class Circle extends GeometricObject{
    private double radius;
    public Circle(){}
    public Circle(double radius) { this.radius = radius;}

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {return radius;}

    public double getPerimeter() {
        return 2 * radius;
    }
    public void  printCircle(){
        System.out.println("El radio del circulo es: "+ radius);
    }
}
