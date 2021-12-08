import java.util.Random;
import java.util.Scanner;

public class Student implements Student_Interface {
	public static String firstName;
	public static String lastName;
	public static String studentLevel;
	public static int studentID;
	public static boolean active;


	// Constructor: Prompt user to to enter students name and year
	public Student() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name of student: ");
		this.firstName = scanner.nextLine();
		
		System.out.println("Enter last name of student: ");
		this.lastName = scanner.nextLine();
		
		System.out.println("Enter Student Level: ");
		this.studentLevel = scanner.nextLine();
		
		this.studentID = getID();
		this.active = true;
	}
	
	@Override
	public void getName() {
		System.out.println("Name: " + this.firstName + " " + this.lastName);
	}
	
	public void printID() {
		System.out.println("ID: " + this.studentID);
	}
	
	public int getID() {
		Random rand = new Random(); 
		// return random number from [0 - 99]. 
		int n = rand.nextInt(100);
		return n;
	}



}
