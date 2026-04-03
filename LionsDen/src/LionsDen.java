
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import edu.una.registrations.Lion;
import edu.una.registrations.Student;

public class LionsDen {

	public static void main(String[] args) {
		Map<String, Student> students = new HashMap<String, Student>();

		Student s1 = new Lion("L123", "Larry", 3.3);
		Student s2 = new Lion("L011", "Moe", 3.0);
		Student s3 = new Lion("L233", "Curly", 3.6);
		Student s4 = new Lion("L999", "Sally", 3.1);
		Student s5 = new Lion("L555", "Judy", 3.2);

		students.put(s1.getStudentId(), s1);
		students.put(s2.getStudentId(), s2);
		students.put(s3.getStudentId(), s3);
		students.put(s4.getStudentId(), s4);
		students.put(s5.getStudentId(), s5);

//	      System.out.println(students);

		// Extra credit opportunities -- make the system interactive by
		// allowing the end-user to:
		//
		// a. add new Lions
		// b. remove exiting Lions
		// c. replace Lion info (using the same L-number)
		// d. display a particular Lion (given the L-number)
		// e. display all Students
		//
		// Make the system easy to use (e.g., a menu with selections for
		// the options above along with a sentinel value to quit.

		/**
		 * open my scanner to get input from a user and assign it to a variable
		 */
		Scanner inputNum = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		Scanner inputDouble = new Scanner(System.in);
		int num;

		/**
		 * opening remarks
		 */
		System.out.println("How can I help you today?");

		do {
			/**
			 * this is my interactive screen for getting user input for decisions
			 */
			System.out.println("Would you like to: ");
			System.out.println("1. add a new Lion");
			System.out.println("2. remove an existing Lion");
			System.out.println("3. replace Lion info unsing and L number");
			System.out.println("4. display a Lion's information using an L number");
			System.out.println("5. display all Students");
			System.out.println("6. to quit");
			
			/**
			 * get input from user
			 */
			num = inputNum.nextInt();

			switch (num) {
			
			case 1:
				System.out.println("Ok you would like to add a new Lion.");

				System.out.println("Please enter the new students first name");
				/**
				 * get the students name
				 */
				String firstLastName = inputString.nextLine();

				System.out.println("Please enter the students new L number");
				/**
				 * get the students L number
				 */
				String lNumber = inputString.next();
				lNumber.toUpperCase();
				System.out.println("Please enter the students grade");
				/**
				 * get the students grade
				 */
				double grade = inputDouble.nextDouble();
				if(!students.containsKey(lNumber)) {
					/**
					 * create a Student and fill
					 */
					Lion l = new Lion(lNumber, firstLastName, grade);

					students.put(l.getStudentId(), l);
					System.out.println("Thank you " + firstLastName + " Lnumber:" + lNumber.toUpperCase() + " grade " + grade + " has been added");
					System.out.println("");
					
				} else {
					System.out.println("That Student already exists, please try the change student option");
				}
				break;

			case 2:

				System.out.println("Ok you would like to remove a student");
				System.out.println("Please enter the students L number");
				/**
				 * get the student to be removed
				 */
				String studentToRemove = inputString.next().toUpperCase();
				/**
				 * check to see if the student exists
				 */
				if (students.containsKey(studentToRemove)) {
					/**
					 * confirm deletion
					 */
					System.out.println("Are you sure you want to remove " + students.get(studentToRemove) + " y or n");
					String response = inputString.next();

					response = response.toLowerCase();
					/**
					 * check to see what the user wants to do if they want to continue
					 * then we remove the student from the list created above 
					 */
					if (response.equals("y")) {
						if (students.containsKey(studentToRemove)) {
							students.remove(studentToRemove);
							System.out.println("Student Removed");
						}
					} else {
						System.out.println("No action taken");
						break;
					}
				} else {
					/**
					 * response if the student has already been deleted
					 */
					System.out.println("Sorry that student doesnt exist");
				}

				break;
				
			case 3:
				System.out.println("Change Student information");
				System.out.println("Please enter the students L number");
				String studentChanging = inputString.next().toUpperCase();
				
				System.out.println("1. To change the Name");
				System.out.println("2. To change the grade");
				System.out.println(". back to menu");
				
				int choice = inputNum.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Please enter the name");
					String n = inputString.next();
					Student s = students.get(studentChanging);
					s.setName(n);
					students.replace(studentChanging, s);
					break;
				case 2:
					System.out.println("Please enter the grade");
					double g = inputDouble.nextDouble();
					Student sg = students.get(studentChanging);
					sg.setGrade(g);
					students.replace(studentChanging, sg);
					break;
				case 3: 
					break;
				default:
					System.out.println("back to the main menu");
					break;
				}
				break;
				
			case 4:
				System.out.println("Display a students information");
				System.out.println("Please enter the students L number");
				String studentToDisplay = inputString.next().toUpperCase();
				System.out.println(students.get(studentToDisplay));
				break;
			case 5:
				System.out.println("Display all students");
				/**
				 * printing out each object contained in the map of students
				 */
				for (Map.Entry<String, Student> entry : students.entrySet()) {
					System.out.println(entry.toString());
				}
				break;
			default:
				System.out.println("");
				break;
			}
			System.out.println("////////////////////////////////////////////");
		} while (num != 6);

		System.out.println("Thank you have a blessd day! Go Lions!");

		
		/**
		 * closing all input streams
		 */
		inputNum.close();
		inputString.close();
		inputDouble.close();
	}

}
