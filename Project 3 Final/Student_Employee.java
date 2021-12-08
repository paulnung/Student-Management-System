import java.util.Scanner;

public class Student_Employee extends Student {
	
	public static String employmentType;
	public static String studentJob;
	
	public Student_Employee() { 
		
	}
	
	public static String displayStudents(Student_Employee [] array) {
		String ret = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i].employmentType != null) {
				ret += "Student Name: " + array[i].firstName + " " +  array[i].lastName + "  Student ID: " + array[i].studentID + "Employment Type: " + array[i].employmentType + "   Job Title: " + array[i].studentJob + "\n";
			}
		}
		return ret;
	}
	
	
	
	
	
}
