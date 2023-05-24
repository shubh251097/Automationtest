package conditional_statements;

public class sswitch {

	public static void main(String[] args) {
		 String str="Wed";
		 switch(str) {
		 case "Mon":
			 System.out.println("Today is Monday");
			 break;
		 case "Tue":
			 System.out.println("Today is Tuesday");
			 break;
		 case "Wed":
			 System.out.println("Today is Wednesday");
			 break;
		 case "Thrus":
			 System.out.println("Today is Thrusday");
			 break;
			 
		 case "Fri":
			 System.out.println("Today is Friday");
			 break;
		 case "Sat":
			 System.out.println("Today is Saturday");
			 break;
		 case "Sun":
			 System.out.println("Today is Sunday");
			 break;
			 default:
				 System.out.println("Invalid Day");
		 }

	}

}
