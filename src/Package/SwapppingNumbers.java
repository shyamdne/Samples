package Package;

public class SwapppingNumbers {
	
	public static void main(String[] args) {
		
		int[] array = { 20, 50, 70, 10, 60, 30, 40 };
		System.out.println("before asorting.............");
		for(int num: array) {
			System.out.print(num+" ");
		}
			for(int i = 0; i<array.length-1;i++) {
				for(int j = i+1; j<array.length;j++) {
					if(array[i]> array[j] ){
						
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
						
					}
				}
			}
			
			System.out.println("after sorting........");
			for(int num1 : array) {
				System.out.println(num1+ " ");
			}
		}
		
		
		
	}


