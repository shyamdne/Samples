package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
	    private String name;
	    private int age;
public Person() {
	
	
}
	    public Person(String name, int age) {
	    	super();
	        this.name = name;
	        this.age = age;
	    }
public String getname() {
	return name;
	
}
public void setName(String name) {
	this.name = name;



}
@Override
public int compareTo(Person o) {
	// TODO Auto-generated method stub
	return 0;
}
	    
	        
	    }

		
		
	
	
