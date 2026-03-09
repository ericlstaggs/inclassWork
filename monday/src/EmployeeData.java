
public class EmployeeData implements Comparable<EmployeeData> {
	private String firstName; // First Name
	private String lastName; // Last Name
	private Integer emplID; // Employee ID
	private Integer deptNum; // Department Number

	EmployeeData(String firstName, String lastName, Integer emplID, Integer deptNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emplID = emplID;
		this.deptNum = deptNum;
	}

	public String toString() {
		return firstName + " " + lastName + " " + emplID + " " + deptNum;
	}
	
	@Override
	public boolean equals(Object o) {
		//1. o is not null		
		if(o == null) {
			return false;
		} 
		//2. compare this to o
		if (this == o) {
			return true;
		}
				
		//3. cast does not class cast exception
		EmployeeData other = (EmployeeData) o;
		if (emplID.equals(other.emplID)) {
			return true;
		}

		return false;
	}

	@Override
	public int compareTo(EmployeeData o) {
		// TODO Auto-generated method stub
//		if(this.emplID < o.emplID) {
//			return -1;
//		} else if(this.emplID > o.emplID) {
//			return 1;
//		}
		//test for the emplId...
//		first name comapare
//		return this.firstName.compareTo(o.firstName);
		
		String name = this.lastName + ", " + this.firstName;
		
		String otherName = this.lastName + ", " + this.firstName;
		
		return name.compareTo(otherName);
		
	}


	
}
