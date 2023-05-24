package session36;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

class Student {

}

public class ArrayListDemo {

	public static void main(String[] args) {
		
		int numbers[] = {10, 20, 30, 40, 50};
		
		//Generic ArrayList with Raw type
		//Hetrogenous
		ArrayList list1 = new ArrayList();
		
		//Homogeneous
		ArrayList<String> list2 = new ArrayList<String>();
		Student s1 = new Student();

		//1. adding data to list
		list1.add(10); //autoBoxed : list1.add(Integer.valueOf(10)); //0
		list1.add("john");
		list1.add(2.2);
		list1.add('A');
		list1.add(s1); //n-1
		
		//list2 can only accomodate Strings
		//list2.add(10); //error
		//list2.add(2.2); //error
		
		list2.add("john"); //0
		list2.add("Kim");
		list2.add("jennie");
		list2.add("Mike");
		list2.add("Leo");
		list2.add("Kim");
		list2.add("Anna"); //n-1
		
		//2.read data from list
		System.out.println("list is: ");
		System.out.println(list1);
		
		System.out.println();
		
		System.out.println("list2 is: ");
		System.out.println(list2);
		
		System.out.println();
		
		//3. read a single element from list
		System.out.println(list1.get(2));
		System.out.println(list2.get(3));
		
		//4. update data in list
		list1.set(1, "John watson");
		list2.set(3, "mike");
		
		System.out.println();
		
		System.out.println("list1 after update is: ");
		System.out.println(list1);
		
		System.out.println();
		
		System.out.println("List2 after updates: ");
		System.out.println(list2);
		
		//5.Delete the data from list
		list1.remove(2);
		list2.remove(3);
		
		list1.clear();
		
		System.out.println();
		
		System.out.println("list1 after delete is: ");
		System.out.println(list1);
		
		System.out.println();
		
		System.out.println("List2 after delete: ");
		System.out.println(list2);
		
		ArrayList<String> moreNames = new ArrayList<String>();
		moreNames.add("George");
		moreNames.add("Harry");
		moreNames.add("Mike");
		
		list1.addAll(moreNames);
		
		System.out.println("list after adding more names is: ");
		System.out.println(list1);
		
		System.out.println("list1 size is: "+list1.size());
		System.out.println("list2 size is: "+list2.size());
		
		System.out.println();
		
		//iterate in list
		//1. using basic for loop
		
		System.out.println("basic For loop");
		
		for(int i=0; i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		//2. using Enhanced for loop
		System.out.println("enhanced For loop");
		
		for(Object o :list1) {
			System.out.println(o);
		}
		
		System.out.println();
		
		for(String s : list2) {
			System.out.println(s);
		}
		
		//3.Using the API Iterator
		
		System.out.println();
		System.out.println("Iterator API");
		
		Iterator itr1 =  list1.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println();
		
		Iterator<String> itr2 = list2.iterator();
		while(itr2.hasNext()) {
			
			String name = itr2.next();
			if(name.equals("John")) {
				itr2.remove();
			}
			System.out.println(name);
		}
		
		System.out.println("list2 now is: "+list2);
	}
	
	
	
	

}
