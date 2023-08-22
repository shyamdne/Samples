package oop.interfaces;

public class Arraysum {
 public static void main(String[] args) {	
	 int [] intarray= {10,11,12,13,14,15,16,17,18};
	 
	 int evenResult=0;
	 int oddResult=0;
	 System.out.print("INTARRAY ELEMENTS:");
	 
	 for(int elements:intarray) {
		 System.out.print(elements+" ");
		 
		 if(elements % 2 ==0) {
			 evenResult=evenResult+elements;
		 }else {
			 oddResult = oddResult+elements;
		 }
	
	 }
 System.out.println();
 System.out.println("EEVEN NUMBER SUM:"+evenResult);
 System.out.println("ODD NUMBER SUM:"+oddResult);
 
 }

}
