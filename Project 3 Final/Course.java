import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Course {
	
	String courseID;
	String courseName;
	File file = new File("Courses.txt");
	
	public Course() throws IOException {
		// check if file exists, if not make file to write to
		if (!file.exists()) {
			
		}
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter course ID: ");
		courseID = scanner.nextLine();
		System.out.print("Enter Course Name: ");
		courseName = scanner.nextLine();
		
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		String line = null;  
		while ((line = br.readLine()) != null) {
			if (line == courseID + " " + courseName) {
				System.out.println("Course already entered.");
				System.out.print("Enter course ID: ");
				courseID = scanner.nextLine();
				System.out.print("Enter Course Name: ");
				courseName = scanner.nextLine();
			}
		}
		
		try {
			FileWriter myWriter = new FileWriter(file);
			myWriter.append(courseID + " " + courseName + "\n");
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
	}
}
