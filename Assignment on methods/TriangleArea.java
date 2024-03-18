import java.util.Scanner;
public class TriangleArea {
    private double base;
    private double height;

    public TriangleArea() {
        this.base = 0;
        this.height = 0;
    }

    public void inputValues () {
     Scanner  scanner = new Scanner(System.in);
     System.out.println("Enter the base of the triangle:");
        this.base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle:");
        this.height = scanner.nextDouble();
    }

    public double calculateArea() {
        return 0.5 * this.base * this.height;
    }

    public void displayArea() {
        System.out.println("The area of the triangle is: " + calculateArea());
    }

    public static void main(String[] args) {
        TriangleArea triangle = new TriangleArea();
        triangle.inputValues();
        triangle.displayArea();
    }
}
    
