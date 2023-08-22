package methods;

public class Methods {

	int a;
	int b;

	public Methods() {

	}

	public Methods(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public int getInfo() {

		return a + b;
	}

	public static void main(String[] args) {
		Methods methods = new Methods(20, 30);
		int r = methods.getInfo();
		System.out.println(r);

		Shyam a =Shyam.getDetails();
		System.out.println(a.info());
		System.out.println();

	}
}

class Shyam {

	private  String a;

	private Shyam(String a) {
this.a=a;
	}

	public static Shyam getDetails() {
		return new Shyam("bbb");
	}
	
	public String info() {
	return a; 
	}

}
