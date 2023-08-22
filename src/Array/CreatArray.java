package Array;

public class CreatArray {
	public static void main(String[] args) {
		int [] a= {1,2,3,4};
		String [] myarray = new String[5];
		myarray [0] = "shyam";
		myarray [1] = "ram";
		myarray [2] = "amma";
		myarray [3] = "ravi";
		myarray [4] = "chinni";
		
		for(String as:myarray) {
			System.out.println(as);
			
			
			for(int i=0;i<myarray.length;i++) {
				System.out.println(myarray[i]);
			}
		}

		
		
		
		
		
	}
	

}
