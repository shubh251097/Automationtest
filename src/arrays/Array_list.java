package arrays;
import java.util.*;

public class Array_list {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ArrayList<String>carlist=new ArrayList<>();
		 carlist.add("car1");
		 carlist.add("car2");

		 carlist.add("car3");

		 carlist.add("car4");
		 System.out.println(carlist.size());
		 System.out.println(carlist.get(0));
		 System.out.println(carlist.get(1));
		 System.out.println(carlist.get(2));
		 System.out.println(carlist.get(3));
		
		 carlist.set(0,"New Car");
		 System.out.println("After Replacing");
		 System.out.println(carlist.get(0));
		 System.out.println(carlist.get(1));
		 System.out.println(carlist.get(2));
		 System.out.println(carlist.get(3));
		 
		 carlist.remove(3);
		 System.out.println(carlist.contains("car3"));
		 carlist.indexOf("car3");
		 System.out.println(carlist.indexOf("car3"));
		


	}

}
