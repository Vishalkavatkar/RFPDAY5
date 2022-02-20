package functionalDistanceJava;

import java.util.Scanner;

public class DistanceJava {

	public static void main(String[] args) {
		int x1, y1;
		double dis;

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter x1 point");
		x1 = scanner.nextInt();

		System.out.println("enter y1 point");
		y1 = scanner.nextInt();

		dis = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));

		System.out.println("The distance of the point from (" + x1 + ", " + y1 + ") to the origin is: " + dis);

	}

}