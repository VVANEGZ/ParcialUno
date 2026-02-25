import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido a este programa donde puede crear un triángulo.");
        System.out.println("Por favor introduzca los tres lados de su triángulo a continuación: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        System.out.println("Los lados se han ingresado exitosamente.");
        System.out.println("Ahora ingrese el color que desea su triángulo: ");
        input.nextLine();
        String color = input.nextLine();
        System.out.println("Se ha registrado su color con éxito.");
        System.out.println("Indique si el triángulo está lleno o no con un true (relleno) o false (no relleno)");
        boolean filled = input.nextBoolean();
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setFilled(filled);
        triangle.setColor(color);
        System.out.println(triangle.toString());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getColor());
        System.out.println(triangle.isFilled());
    }
}
