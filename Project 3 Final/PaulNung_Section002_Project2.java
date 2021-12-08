import java.util.Scanner;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;

public class PaulNung_Section002_Project2 {


	public static void main(String[] args) {
		
		System.out.println("***Welcome to Student and Course Management System***\n" + "Press ‘1’ for Student Management System (SMS)\n" + 
				"Press ‘2’ for Course Management System (CMS)");

		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();

		while (choice != 1 && choice != 2) {
			System.out.println("Press ‘1’ for Student Management System (SMS)\n" + 
				"Press ‘2’ for Course Management System (CMS)");
		}
		
		if (choice == 1) {
		System.out.println("Welcome to Student Management System\n" + 
				"This system will allow to manage students. Let's start with the number of students this system will have %s");
		
		
		// get number of students for object array
		int numStudents = 0;
		int idx = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("How many students will your system have?: ");
		numStudents = in.nextInt();
		Student_Employee studentArray[];
		studentArray = new Student_Employee[numStudents];
		while (idx <= numStudents) {
		System.out.print("***Welcome to Student Management System***\n" + 
				"Press ‘1’ to add a student\n" + 
				"Press ‘2’ to deactivate a student\n" + 
				"Press ‘3’ to display all students\n" + 
				"Press ‘4’ to search for a student by ID\n" + 
				"Press ‘5’ to assign on-campus job\n" + 
				"Press '6' to display all students with on-campus jobs" +
				"Press ‘0’ to exit the system\n");
		
		int action = in.nextInt();
		
		while(action != 0 && action != 1 && action != 2 && action != 3 && action != 4 && action != 5 && action != 6) {
			System.out.print("Enter a proper value: ");
			action = in.nextInt();
		}
		// Switch statement to perform action that user inputs
		switch (action) {
		// Logic to instantiate new student and add to student object array
		case 1:
			studentArray[idx] = new Student_Employee();	
			System.out.println(studentArray[idx].firstName + " " + studentArray[idx].lastName + 
					" has been added as a " + studentArray[idx].studentLevel + " with ID " + studentArray[idx].studentID);
			idx++;
			break;
		// Logic to loop through student array and find student with corresponding student ID to change status to inactive
		case 2:
			System.out.print("Enter the ID for the student you want to deactivate: ");
			int newid = in.nextInt();
			for (int i = 0; i < idx; i++) {
				if (studentArray[i].studentID == newid) {
					studentArray[i].active = false;
				}
			}
			break;
			// Logic to loop through student array and display information for each student that has been added
		case 3:
			for (int i = 0; i < idx; i++) {
				System.out.println(studentArray[i].firstName + " " + studentArray[i].lastName);
				System.out.println("ID: " + studentArray[i].studentID);
				System.out.println("Level: " + studentArray[i].studentLevel);
				
				if (studentArray[i].active == true) {
					System.out.println("Status: Active");
				}
				else {
					System.out.println("Status: Inactive");
				}
				
				try {
					FileWriter myWriter = new FileWriter("StudentReport.txt");
					myWriter.write(studentArray[i].firstName + " " + studentArray[i].lastName);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println();
			}
			break;
		// Logic to loop through student array to find student by ID and display information for the student
		case 4:
			System.out.print("Enter the student ID: ");
			int searchID = in.nextInt();
			for (int i = 0; i < idx; i++) {
				if (studentArray[i].studentID == searchID) {
					System.out.println(studentArray[i].firstName + " " + studentArray[i].lastName);
					System.out.println("ID: " + studentArray[i].studentID);
					System.out.println("Level: " + studentArray[i].studentLevel);
					if (studentArray[i].active == true) {
						System.out.println("Status: Active");
					}
					else {
						System.out.println("Status: Inactive");
					}
				}
			}
			break;
			
		case 5: 
			System.out.print("Enter the student ID");
			searchID = in.nextInt();
			for (int i = 0; i < idx; i++) {
				while (searchID != studentArray[i].studentID) {
					System.out.println("Enter a valid student ID.");
					searchID = in.nextInt();
				}
				System.out.println("Enter Employment Type: ");
				studentArray[i].studentJob = in.nextLine();
				
				System.out.println("Enter Job Title: ");
				studentArray[i].employmentType = in.nextLine();
			}
			
			break;
		
		case 6:
			System.out.print("All Employed Students: ");
			System.out.print(Student_Employee.displayStudents(studentArray));
		// Exit program if user inputs '0'
		default:
			System.exit(0);
		}

		}		
		}
		else if (choice == 2) {
			System.out.println("***Welcome to Course Management System!***");
			System.out.println("Press ‘1’ to add a new course\n" + 
					"Press ‘2’ to assign student a new course\n" + 
					"Press ‘3’ to display student with assigned courses\n" + 
					"Press ‘0’ to exit CMS\n");
			
			Scanner inp = new Scanner(System.in);
			int option = inp.nextInt();
			
			while (option != 1 || option != 2 || option != 3 || option != 0) {
				System.out.println("Enter a proper option.");
				option = inp.nextInt();
			}
			
			switch (option) {
			
			case 1:
				
				
				
				break;
				
			case 2:
				System.out.println();
				break;
				
				
			case 3:
				
				break;
				
				
			default:
				System.exit(0);
			}
		}
	}

}
