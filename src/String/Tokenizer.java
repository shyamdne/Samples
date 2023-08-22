package String;
import java.util.*;

public class Tokenizer {
	
	public static void main(String[] args) {
		
		
		StringTokenizer st= new  StringTokenizer("durga soft solutions");
		
		System.out.println("number of Tokens:"+st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		
		
		}
	}

}
