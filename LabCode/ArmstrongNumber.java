package LabCode;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		
		System.out.println("Enter Number: ");
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int rem, res = 0;
		int t = n;
		
		while (n!=0) {
			rem = n % 10;
			res = (int) (res + Math.pow(rem,3));
			n = n / 10;
		}
		
		if (res == t) {
			System.out.print("Amstrong Number!");
		}
		else {
			System.out.print("Not a Amstrong Number!");
		}
	}
}