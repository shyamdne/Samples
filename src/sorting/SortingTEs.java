package sorting;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
;

public class SortingTEs {
	public static void main(String[] args) {
		
	/*	List<String> cities = new ArrayList<String>();
		
		cities.add("hyderabd");
		cities.add("kukatpally");
		cities.add("ameerpet");
		
		System.out.println("before  sorting:"+cities);
		Collections.sort(cities);
		System.out.println("after  sorting:"+cities);*/
		// how to sort employess
		
		Employee emp1 = new Employee(100,"shyam","dhane");
		Employee emp2 = new Employee(300,"adhya","kphb");
	Employee emp3 = new Employee(500,"chinni","ammerpet");
		Employee emp4 = new Employee(400,"ram","nagapur");
		List<Employee> employees = new ArrayList<Employee>();	
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		

		for(Employee e: employees) {
			
			System.out.println("before sorting"+ e.getfirstName());
		
		}	
		
		Collections.sort(employees);
		for(Employee ef: employees) {
			
			System.out.println("after soerting:" + ef.getfirstName());
		}
		


		}
		
		
	}		
	



