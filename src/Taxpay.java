
public class Taxpay {
	public static void main(String[] args) {
		long income = 560000L;
		float taxpay = 0.0f;
		
	if (income <300000 ) {
		taxpay = 0.0f;
	}else if(income>=300000 && income <500000 ) {
		taxpay = income*12/100;
	} else if(income >=500000 && income<1000000) {
		taxpay = income*18/100;
} else if(income >=1000000 && income<2000000) {
 
taxpay = income*22/100;
}

	System.out.println("income:"+ income);
	System.out.println("taxpay:"+taxpay);
	}
}