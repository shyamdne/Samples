package Array;

public class MultidimensionalArray {


	public static void main(String[] args) {
				//multi dimenstional array
		
		int arr1 [] [] = {{1,2,3},{4,5,6},{7,8,9}};
		int arr2 [] [] = {{10,11,12},{13,14,15},{16,17,18}};
		
		
		System.out.println("array1");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("array2");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			
			System.out.println();
		}
		// creating another array3 copping from 1*2
		
		
		int arr3  [] [] = new int [3] [3];
		
		System.out.println("arr3");
		
		for(int i =0;i<arr1.length;i++) {
			for(int j = 0;j<arr2.length;j++) { 
				arr3[i][j] = 0;
			}
			
			int j = 0;
			for(int k =0;k<arr3.length;k++) {
				
				
				arr3 [i][j] += arr1[i][j] * arr2 [i][j];
			}
			System.out.print( arr3 [i][j]+" ");
		}		
		
		System.out.println();
	}
	
	

}
