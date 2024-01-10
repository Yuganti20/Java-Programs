package ItsCoding;

import java.util.Scanner;

public class Yuganti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temperatue;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the temperature");
		temperatue = in.nextInt();
		temperatue = ((temperatue - 32)*5)/9;
		System.out.println(temperatue);
	}
}
	 