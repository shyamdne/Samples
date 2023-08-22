package overidding;




class Account{
	public void add() {
		System.out.println("this account class  method");
	}
}
class SavingsAccount extends Account{
	public void add() {
		System.out.println("this is saving class account method");
			}
}

public class OverridingExample {
	public static void main(String[] args) {
	/*	Account acc = new Account();
		acc.add();//op:this account class  method because we superclass object called*/

/*	SavingsAccount sa = new SavingsAccount();
	sa.add();// this sub class object calling sub class method , we need super class refernce,*/
		
		
		//so we need super class object assingn to subclass object
		Account acc= new SavingsAccount();
		acc.add();
	}
	

}
