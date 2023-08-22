package oop.interfaces;

public class Arraytest {
	public static void main(String[] args) {
	// one dimestional array declaration
	//	int [] a = {10,20,30,40,50};
		int [] a = new int [5];
		a [0] =10;
		a [1] =20;
		a [2] =30;
		a [3] =40;
		a [4] =50;
	
		System.out.println(a);//[I@15db9742
		System.out.println(a.length);//5
		System.out.println(a[2]);//30
		System.out.println(a[4]);//50
		//System.out.println(a[7]);//java.lang.ArrayIndexOutOfBoundsException
		System.out.println(a[a.length-3]);//30
		System.out.println(a[a[0]-10]);//10
		//System.out.println(a[a.length]);// java.lang.ArrayIndexOutOfBoundsException:
		System.out.println();
		for(int index=0;  index<a.length; index++) {
			System.out.println(a[index]);
		}
		System.out.println();
		for(int val: a) {
				System.out.println(val);
	}
	
	

}
}