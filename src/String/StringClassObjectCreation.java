package String;

public class StringClassObjectCreation {
	
	public static void main(String[] args) {
		
		
		String str = new String();// without specified data
		// creating string class object with speciafied data
		String str1 = new String("shyam");
		System.out.println(str);
	 System.out.println();
		System.out.println("this  data   :"+str1);
	System.out.println();
	
	
	String str3= "abc";//inthis senerio 2 rf values to single object
String str4="abc";
System.out.println(str3==str4);
System.out.println();
// with new key word creating diff 2  object
String str5 = new String("abc");
String str6 = new String("abc");
System.out.println(str5==str6);


		
	}

}
