package String;


public class Swapping {

	public static void main(String[] args) {

		// declaring array string
		String names1[] = { "kiran","pottodu","chinni","anna","ramakanth","ravi" };
		System.out.println("before sorting.........:");

		for (String str : names1) {

			System.out.println(str+" ");
		}
			for (int i = 0; i < names1.length-1; i++) {
				for (int j = i + 1; j < names1.length; j++) {
if(names1[i].compareTo(names1[j])>0){
					String temp = names1[i];
					names1[i] = names1[j];
					names1[j] = temp;
				}
			}
		
			}
		System.out.println("after sorting........");
		for(String str : names1 ) {
			System.out.print(str + " ");
		}
		
		
	}
}

