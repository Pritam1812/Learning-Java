package LabCode; //Lab Class Date: 22/11/2022

import java.util.Scanner;

public class Palindrome {
	
public static void main(String[] args) {
		
		System.out.println("Enter Number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = n;
		int r, rev = 0;
		while (n!=0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		if(t==rev) {
			System.out.print("Palindrome Number!");
		} else {
			System.out.print("Not a Palindrome Number!");
		}
	}
}
