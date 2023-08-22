package String;

public class ResverseData {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("dhane shyam");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		// equals method
		StringBuffer sb1 = sb.reverse();
		if(sb.equals(sb1)) {
			System.out.println("polydrome syndrome");
		}else {
			System.out.println("not ploly syndrome");
		}
		
	}

}
