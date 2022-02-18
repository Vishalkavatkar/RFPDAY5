package largestamongthreenumbers;

import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = input.nextInt();
        System.out.print("Enter number b: ");
        int b = input.nextInt();
        System.out.print("Enter number c: ");
        int c = input.nextInt();
        int max = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		System.out.println("Largest number in given 3 numbers is " + max);
        input.close();

	}

}
