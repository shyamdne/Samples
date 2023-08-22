package String;

public class StringCharat {
	public static void main(String[] args) {

		String str = "dhane shyam";
		char name = str.charAt(0);
		System.out.println(name);
		System.out.println("====================");
		// print resverse string
		
		for(int i = str.length()-1; i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		

	}

}
