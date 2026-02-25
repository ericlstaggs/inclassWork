/**
 * 
 */

/**
 * 
 */
public class NizTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Restaurant r = new Restaurant();
		r.address ="123 court st";
		r.name = "Eat Here";
		System.out.println(r.getDescription());
		
		Business b = (Business) r;
		System.out.println(r.getDescription());
		

	}

}
