package conditional_statements;

public class switch_statement {

	public static void main(String[] args) {
		
		int a=80;
		int b=40;
		int expression=9;
		
		switch(expression) {
		case 1:
			
			System.out.println("Addition of two numbers is:"+(a+b));
			break;
			
		case 2:
			
			System.out.println("Subtraction of two numbers is:"+(a-b));
			break;
			
		case 3:
			System.out.println("Multiplication of two numbers is:"+(a*b));
			break;
			
		case 4:
			System.out.println("Division of two numbers is:"+(a/b));
			break;
			
		case 5:
			System.out.println("Modulus of two numbers is:"+(a%b));
			break;
			
			default:
				System.out.println("Invalid Inputs");
				
		}

	}

}
