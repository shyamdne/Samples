
public class StringBufferApend {
	public static void main(String[] args) {
		// mutable object means all data same only reffering variables are different 
		StringBuffer sb1 = new StringBuffer("dhane");
		StringBuffer sb2= sb1.append("shyam");
		StringBuffer sb3 = sb2.append("nagapoor");
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		
		System.out.println(sb1==sb2);
		System.out.println(sb2==sb3);
		System.out.println(sb3==sb1);
		
	}

}
