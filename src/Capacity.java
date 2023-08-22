
public class Capacity {

	public static void main(String[] args) {
		
		StringBuffer str= new StringBuffer("shyam");
	System.out.println(str.capacity());
				
	// new capacity= incial capacity+ lenght of the data
	
	System.out.println("===================");
	
	// ensure capacity method explicitly add capacity
	
	StringBuffer sb= new StringBuffer();
	sb.ensureCapacity(60);
	System.out.println(sb.capacity());
	}
}
