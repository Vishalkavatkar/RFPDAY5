package functionalQuadratic;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print(" Please enter value of a: ");
		int a = scanner.nextInt();

		System.out.print(" Please enter value of b: ");
		int b = scanner.nextInt();

		System.out.print(" Please enter value of c: ");
		int c = scanner.nextInt();

		int delta = b * b - 4 * a * c;
		double root1 = (-b + Math.sqrt(delta)) / (2 * a);
		double root2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.println(" The first root is : " + root1);
		System.out.println(" The second roots is: " + root2);
	}
}