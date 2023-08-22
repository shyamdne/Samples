package oop.interfaces;

public class StudentArray {
	public static void main(String[] args) {
		String [] studentarr = {"ram", "shyam", "adhya","ramakanth","kiran"};
		
		
		/*for(String elements:studentarr) {
			
			System.out.println("STUDENT NAMES:"+elements);
			
			System.out.println();
			System.out.println(studentarr.length);*/
			// when use normal forloop inside for mention  int for strings
			for(int i=0; i<studentarr.length ; i ++) {
				System.out.println("STUDENT NAMES:"+studentarr[i]);
				
			}
		}

		
	}
	
	
	

