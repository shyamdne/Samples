package Ifcondition;

public class StudentMarks {
	public static void main(String[] args) {
		
		int smarks = 101;
		String status=" ";
		if (smarks<35 && smarks >=0) {
			status = "FAIL";
		}else if(smarks >=35 && smarks <50){
			status = "3 st class";
		}else if(smarks >=50 && smarks <60) {
			status = "2nd class";
		}else if (smarks >= 60 && smarks < 70) {
			status = "1 st class";
		}else if (smarks >= 70 && smarks <= 100) {
			status = "topper";
	}else{
		status = "INVALID MARKS";
	}
	System.out.println("STudent Marks : "+smarks);
	System.out.println("Student Status : "+status);

		
		
		
}
}