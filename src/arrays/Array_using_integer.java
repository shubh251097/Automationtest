package arrays;
import java.util.*;
public class Array_using_integer {

	public static void main(String[] args) {
		
		ArrayList <Integer> marklist =new ArrayList<>();
		
		marklist.add(34);
		marklist.add(67);
		marklist.add(45);
		marklist.add(89);
		marklist.add(78);
		marklist.add(69);
		
		marklist.size();
		System.out.println(marklist.size());
		System.out.println(marklist.get(0));
		System.out.println(marklist.get(1));
		System.out.println(marklist.get(2));
		System.out.println(marklist.get(3));
		System.out.println(marklist.get(4));
		System.out.println(marklist.get(5));
		
		marklist.set(1, 26);
		System.out.println("After Replacing");
		System.out.println(marklist.get(0));
		
		System.out.println(marklist.get(1));
		System.out.println(marklist.get(2));
		System.out.println(marklist.get(3));
		System.out.println(marklist.get(4));
		System.out.println(marklist.get(5));
		
		
		marklist.remove(3);
       System.out.println(marklist.contains(2));
       System.out.println(marklist.indexOf(30));
		
	}

}
