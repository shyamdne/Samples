package String;

import java.util.StringTokenizer;

public class StrinkTest {
	
	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("dhane shya nagapoor kammarpally");
		System.out.println("number of tokens:"+st.countTokens());
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken()); 
			
		}
		
	}

}
