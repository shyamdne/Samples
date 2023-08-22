package String;

public class InserDelet {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("dhane nagapoor");
	System.out.println(sb);
	sb.insert(6, "shyam");
	System.out.println(sb);
	sb.delete(6, 11);
	System.out.println(sb);
	}

}
