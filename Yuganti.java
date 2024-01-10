package ItsCoding;

import java.util.Scanner;

public class Yuganti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no x and y before swapping:");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Before Swapping\nx = " + x + "\ny = " + y);

		temp = x;
		x = y;
		temp = y;

		System.out.println("After swapping\nx = " + x + "\ny = " + y);

	}
}
