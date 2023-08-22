package oop.interfaces;
// iterface is like class it contains only abstract methods and constants.
// constants are variables we can never modify, theseare static values
// Abstract method is incomplete method or it has only method defination.
public interface Account{
	
	public Long createAccount(AccountBean acc);
	public void deleteAccount(Long accId);
	public  AccountBean updateAcount(AccountBean acc);
	public AccountBean findAccounDetailst(Long accId);
	
	// This a variable , it is constant value, we never modify
	public static final Long ACCOUNT_NUM = 1000L;
}   
