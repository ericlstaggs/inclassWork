/**
 * 
 */
package edu.una.registrations;

/**
 * Class of Lion that extends Student
 * @author Eric Staggs
 * @version 1.0
 */
public class Lion extends Student{

	public Lion(String id, String name, double grade) {
		super(id, name, grade);
		// TODO Auto-generated constructor stub
	}
	
	
	public int compareTo(Lion lion) {
		return super.compareTo(lion);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
