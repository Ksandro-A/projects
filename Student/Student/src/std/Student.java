package std;



import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int studentNumbers;
	private int studentYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Ask how many new students
	
	// constructor
public Student() {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter first name: ");
	this.firstName = in.nextLine();
	System.out.println("Enter last name: ");
	this.lastName = in.nextLine();
	System.out.println("Enter  class level \n1- Sophomore  \n2- Freshmen  \n3- Junior  \n4- Senior ");
	this.studentYear = in.nextInt();
	this.studentID = setID();
	System.out.println(firstName +" "+ lastName +" "+ studentYear + " " +studentID);
	
	
	
		
	}
	
	// Generate ID
private String setID() {
	id++;
	return studentYear + "" + id;
	
}


	
	// Enroll in course
public void enrollInCourse() {
	while(true) {
	System.out.print("Enter courses to enroll (D for done): ");
	Scanner in = new Scanner(System.in);
	String course = in.nextLine();
	if(!course.equals("D")){ 
		courses = courses + "\n" +course;
		tuitionBalance += costOfCourse;
		
	}else break;
	System.out.println("Enrolled in: " +courses );
	System.out.println("Tuition Balance: " + tuitionBalance );
} 
}

	
	// View balance
public void balance() {
	System.out.println("Your balance is: " + tuitionBalance + "you have 40 days to deposit the remaining sum");
	
}
	
	// Pay tuition
public void payTuition() {
	System.out.println("Enter payment for courses selected: ");
	Scanner in = new Scanner(System.in);
	int payment = in.nextInt();
	tuitionBalance -=  payment;
	
}
	
	// Show status
	
	
	

}

