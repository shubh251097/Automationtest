package conditional_statements;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		System.out.println("Enter operator:");
		char s=sc.next().charAt(0);
		
		switch(s) {
		case '+':
			System.out.println("Addition of two numbers is:"+ (a+b));
			break;
		case '-':
			System.out.println("Subtraction of two numbers is:"+ (a-b));
			break;
		case '*':
			System.out.println("Multiplication of two numbers is:"+(a*b));
			break;
		case '/':
			System.out.println("Division of two numbers is:"+(a/b));
			break;
		case '%':
			System.out.println("Modulus of two numbers is:"+(a%b));
			break;
			default:
				System.out.println("Invalid Opertor");
		}
	}

}
