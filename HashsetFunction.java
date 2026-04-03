package Hash;

import java.util.*;

public class HashsetFunction {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		boolean flag = true;
		while(flag!=false) {
			System.out.println("----------------------Choice Option----------------------");
			System.out.println("1. Add element in HashSet");
			System.out.println("2. Check if Element Contain in hashset");
			System.out.println("3. Remove Element");
			System.out.println("4. Size of Hashset");
			System.out.println("5. Check All Element");
			System.out.println("0. Exit");
			System.out.println("Enter the your Choice :");
			int c = s.nextInt();
			switch(c) {
			case 1:addElement(set);
				break;
			case 2:checkContain(set);
				break;
			case 3:removeElement(set);
				break;
			case 4:checkSize(set);
				break;
			case 5 :checkAllElement(set);
				break;
			case 0:flag=false;
				break;
			default:System.out.println("Invaild Option!!!!");
			}
			
		System.out.println("--------------Thank You Have A WonderFull Day!!!!!!!!!!!---------------");
		}		
	}
	
	
	private static void checkAllElement(HashSet<Integer> set) {
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}		
	}
	
	
	private static void checkSize(HashSet<Integer> set) {
		System.out.println("Size of HashSet : "+set.size());		
	}
	
	
	private static void removeElement(HashSet<Integer> set) {
		System.out.println("Enter Element to Remove: ");
		if(set.remove(s.nextInt()))
			System.err.println("Element Removed Successfully");
		else
			System.out.println("Element Not removed!!!!");		
	}
	
	
	private static void addElement(HashSet<Integer> set) {
		System.out.println("Enter the Element: ");
		int ele = s.nextInt();
		set.add(ele);
	}
	
	
	private static void checkContain(HashSet<Integer> set) {
		System.out.println("Enter Element to Check: ");
		int ele=s.nextInt();
		if(set.contains(ele)){
			System.out.println(ele+" Present in HashSet!!!!!!");
		}else {
			System.out.println(ele+" Not Present in Hashset!!!!!");
		}
	}
}
