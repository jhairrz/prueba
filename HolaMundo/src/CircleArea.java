import java.util.Scanner;

public class CircleArea {

	// Constant PI is defined at the class level
	static final double PI = 3.14;

	void getArea() {
		// Method used to calculate area of a circle
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = scanner.nextDouble();
		double elevado = 2;
		double radiusE = Math.pow(radius, elevado);
		double area = PI * radiusE;
		System.out.print("Area of circle is: " + area);
	}

	public static void main(String args[]) {
		CircleArea c1 = new CircleArea();
		c1.getArea();
	}

}
