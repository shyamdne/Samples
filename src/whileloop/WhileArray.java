package whileloop;

public class WhileArray {

	
	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50,60};
		int index =0;
		boolean isFlage = true;
		while(isFlage) {
			
			System.err.println(arr[index]);
			++index;
			if (arr.length==index) {
				isFlage=false;
			}
		}
		
		
	}
}
