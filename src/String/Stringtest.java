package String;

public class Stringtest {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "hello";
		System.out.println("S1 HASHCODE   :" + s1.hashCode());
		System.out.println("S1 HASHCODE   :" + s2.hashCode());
		if (s1.hashCode() == s2.hashCode()) {
			System.out.println("two sa and s2 hash codes are same: true");
		}
		if (s1 == s2) {
			System.out.println("comapare s1==s2: true");
		}
		if (s1.equals(s1)) {
			System.out.println("s1 euals to s2: true");// euals method comapre content
		}

	}

}
