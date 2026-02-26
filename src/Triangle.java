import java.util.*;

public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;
    public Triangle(){}
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){return side3;}
    public double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
    public double getPerimeter(){
        double perimeter= (side1 + side2 + side3);
        return perimeter;
    }
    @Override
    public String toString(){
        return "Triángulo: side 1= " + side1 + ", side 2= " + side2 + ", side 3= " + side3;
    }
    static void IllegalTriangleException(double side1, double side2, double side3) throws IllegalArgumentException{
        if(side1 + side2 <= side3 && side2 + side3 <= side1){
            throw new IllegalArgumentException("Los lados no forman un triángulo válido.");
        }
    }
}
