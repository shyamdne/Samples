package String;

public class StringComparetoTest {
	public static void main(String[] args) {
		

			// How to sort the elements
			// output Aadhya,Dhane,Ram,Shyam
			String names[] = { "Shyam", "Ram", "Aadhya", "Dhane" };
			System.out.println("Before sorting...");
			for(String str : names) {
				System.out.print(str + "  ");
			}
			System.out.println("######" + names[0].compareTo(names[1]));

			for (int i = 0; i < names.length - 1; i++) {

				for (int j = i + 1; j < names.length; j++) {
					if (names[i].compareTo(names[j]) > 0) {
						// swpapping
						String temp = names[i];
						names[i] = names[j];
						names[j] = temp;
					}
				}
			}
			System.out.println("After sorting...");
			for(String str : names) {
				System.out.print(str + "  ");
			}

		}


	

	}

