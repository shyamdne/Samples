package oop.interfaces;

import java.beans.MethodDescriptor;







 class Addition{
	 
	public int add(int i, int j){
		 
		 int sum=i+j;
		 return sum;
	 }
	 
	 
	
	
	
}
public class MedthodTest {
	
// using main method
	public static void main(String[] args) {
		
		Addition res = new Addition();
	int  s = res.add(1, 2);
		System.out.println("addiing the number  :"+s);
		System.out.println("addiing the number  :"+res.add(1, 2));
		System.out.println();
		//predefined method declaration
         System.out.println("max number"  + Math.max(97, 99));
	
		
		 
	}

}
