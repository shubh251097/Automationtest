package conditional_statements;

public class if_elseif_else {

	public static void main(String[] args) {
	int marks=25;
	
	if(marks>90) {
		System.out.println("Distinction");
	} else if (marks>70) {
		System.out.println("Grade A");
	} else if(marks>50) {
		System.out.println("Grade B");
	}else if(marks>40) {
		System.out.println("Grade C");
	}else {
		System.out.println("Fail");
	}

	}

}
