package LabCode;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int i, sum = 0;
		
		for (i=1; i<=n; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
				sum= sum + i;
			}
		}
		System.out.println("\nSum of Even Number:" + sum);
	}

}
