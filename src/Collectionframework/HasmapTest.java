package Collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HasmapTest {
	
	public static void main(String[] args) {
		
		Map<String ,String> map = new HashMap<String, String>();
		map.put("Shyam", "dhane3");
		map.put("RAm", "dhane2");
		map.put("Adhya" , "dhane1");
		
		System.out.println("geting vales from using keys:"+map);
		System.out.println("==============================================================================");
	String value = 	map.get("Shyam");
	System.out.println(value);
		
		
	}
	
	
	
	
	

}
