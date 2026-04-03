/**
 * 
 */
package edu.una.registrations;

/**
 * Class for of type student
 * @author Eric Staggs
 * @version 1.0
 */
public abstract class Student implements Comparable<Student> {
	
	/**
	 * Class variables
	 */
	private String studentId = "";
	private String name = "";
	private double grade = 0;
	
	/**
	 * Constructor
	 * @param id
	 * @param name
	 * @param grade
	 */
	Student (String id, String  name, double grade){
		this.setStudentId(id);
		this.setName(name);
		this.setGrade(grade);		
	}

	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the grade
	 */
	public double getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	@Override
	public int compareTo(Student s) {
		String id = this.studentId;
		return id.compareTo(s.getStudentId());
	}
	
	@Override
	public String toString() {
		return this.studentId + " " + this.name + " " + this.grade;
	}
	
	

}
