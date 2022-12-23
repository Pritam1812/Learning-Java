package Code;
import java.util.Scanner;

public class CalculatorMethod {
	
	public class Method{
		public static void add(int a, int b){
			System.out.println("Addition:"+(a+b));
		}
		public static void sub(int a, int b){
			System.out.println("Substraction:"+(a-b));
		}
		public static void mul(int a, int b){
			System.out.println("Multiplcation:"+(a*b));
		}
		public static void div(int a, int b){
			System.out.println("Division:"+(a/b));
		}
		public static void rem(int a, int b){
			System.out.println("Remainder:"+(a%b));
		}
	}
	
	public static void main(String[] args) {
		int num1, num2, choice;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Calculator Using Methods");
		System.out.println("\n1.Addititon \n2.Substraction \n3.Multiplication \n4.Division \n5.Remainder");
		
		System.out.println("Enter Choice: ");
		choice = in.nextInt();
		
		System.out.println("Enter First Number:");
		num1 = in.nextInt();
		System.out.println("Enter Second Number:");
		num2 = in.nextInt();
		
		switch(choice) {
		case 1:
			Method.add(num1, num2);
			break;
		case 2:
			Method.sub(num1, num2);
			break;
		case 3:
			Method.mul(num1, num2);
			break;
		case 4:
			Method.div(num1, num2);
			break;
		case 5:
			Method.rem(num1, num2);
			break;
		}
	}
}
