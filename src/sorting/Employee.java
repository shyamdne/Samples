package sorting;

public class Employee implements Comparable <Employee>{
	
	private static final String String = null;
	private long id;
	private String firstName;
	private String lastName;
	
	public Employee(){
		
	}
	public Employee(long id, String firstname, String lastName) {
		
		super();
		this.id= id;
		this.firstName=firstname;
		this.lastName = lastName;
		
		
	}
	
	public long  getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
		
		
	}
	
	public String getfirstName() {
		
		return firstName;
		
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
		
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void setlastName(String lastName) {
		this.lastName = this.lastName;
	}
	
	//public int compareTo(Employee employee) { return (int)
	//	    (this.getId() - employee.getId()); }

	 public int compareTo(Employee employee) {
	      return this.getfirstName().compareTo(employee.getfirstName());

	 }
	}
	


