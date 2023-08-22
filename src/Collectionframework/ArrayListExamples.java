package Collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExamples {
	public static void main(String[] args) {
		List<String> namelist = new ArrayList<String>();
		namelist.add("shyam");
		namelist.add("ram");
		namelist.add("ramakanth");
		namelist.add("shyam");
		namelist.add("null");
		namelist.add("null");
		System.out.println(namelist);
		
		List<String> namelist1 = new ArrayList<String>();
		namelist1.add("chinni");
		namelist.addAll(namelist1);
		System.out.println(namelist);
	System.out.println("-------------------------");
		System.out.println("retrive elements using for loop");
for(int i= 0; i<namelist.size();i++) {
	System.out.println(namelist.get(i)+"");}

	System.out.println("-------------------------");
	System.out.println("retrive elements using for FOREACHLOOP");
	for(String name:namelist) {
		
		System.out.println(name);
	}
	System.out.println("-------------------------");
	System.out.println("retrive elements using for ITERATOR");
	
	Iterator<String> iterator = namelist.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	System.out.println("--------------------------");
	System.out.println("forward way using lLISTITERATER");
	ListIterator<String> li=namelist.listIterator();
	while(li.hasNext()) {
		System.out.println(li.next());
		
	}
	
	System.out.println("--------------------------");
	System.out.println("backrward way using lLISTITERATER");
	
	while(li.hasPrevious()) {
		System.out.println(li.previous());
		}
	
		
	}
	
	
}

