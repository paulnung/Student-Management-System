# Student-Management-System
Overview:
This is a Java program that creates a ‘Student Management System and Course Management System.' The Student Management System allows the user to add and delete students, display full list of students in order and lastly find a student by ID to assign them to an on-campus Job. The 'Course Management System’ assigns students to courses by their ID and course ID. 

Project Design:
In this project there were 3 classes. The student class, the student employee class, and the course class. The student class included attributes for the student data type such as student ID, student name, grade level, etc. The student employee class was a subclass of the employee class. This class inherited the methods and attributes from the parent class and also had attributes describing the employment status and job title of each student. The students were stored in a student object array and this array was used in many situations such as when the user wanted to display information about a certain student. In this case, the user would input a student ID number and the array would be traversed to find the student with the matching ID number. The information about the student was then displayed to the user. The course class included attributes for the course ID and course name. In this case, there were no arrays used to store data but it was rather directly written to a file. There is also some error handling implementation in the project. This was used when there were certain errors when reading, writing, or opening a file. 

To test the program, enter the following inputs when prompted:
First Name: Joe 
Last Name: Smith
Grade: Freshman

Mary 
Cane
Junior

Press ‘1’ to add a student
Press ‘2’ to deactivate a student
Press ‘3’ to display all students
Press ‘4’ to search for a student by ID
Press ‘5’ to assign on-campus job
Press ‘6’ to display all students with on-campus jobs
Press ‘0’ to exit SMS
By entering the numbers, you can use the program to carry out these functions. 
