package Code;
import java.util.Scanner;

public class SumOfNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int r, s = 0;
		while (n!=0) {
			r = n % 10;
			s = s + r;
			n = n / 10;
		}
		System.out.print("Answer: " + s);
	}
}
