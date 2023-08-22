package String;

import java.util.StringTokenizer;

public class EXxample2 {
	
public static void main(String[] args) {
		                                    // we can give ifondelimeter  other wise its single string
		StringTokenizer st = new StringTokenizer("1986-02-25", "-");
		System.out.println("number of tokens:"+st.countTokens());
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken()); 
		}

}
}