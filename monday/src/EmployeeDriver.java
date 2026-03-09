import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDriver {

	public static void main(String[] args) {
		// hard-coded list of 3 employees
		ArrayList<EmployeeData> emps = new ArrayList<EmployeeData>();
		EmployeeData larry = new EmployeeData("larry", "jones", 212, 2);
		EmployeeData moe = new EmployeeData("moe", "smith", 122, 4);
		EmployeeData curly = new EmployeeData("curly", "smith", 34, 4);

		emps.add(larry);
		emps.add(moe);
		emps.add(curly);
		
		Collections.sort(emps);
		System.out.println(emps);
		

	}

}
