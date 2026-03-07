
/**
 * 
 */
import java.util.Scanner;

import com.roarlions.BaseBallPlayer;
import com.roarlions.BasketBallPlayer;
import com.roarlions.Roster;

/**
 * This is the main 
 *  
 * 
 * @version 1.0 3/6/2026
 * @author Eric Staggs
 */
public class RosterSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * create a new scanner
		 */
		Scanner sc = new Scanner(System.in);
		

		/**
		 * create fields
		 */
		Roster basketBall = new Roster();
		Roster baseBall = new Roster();
		final String output1 = "1 for Basketball or 2 for Baseball:";
		final String output2 = "Enter a partial name to search or q to quit.";
		final String bye = "bye";
		final String invalid = "Invalid input";
		
		/**
		 * make digital versions of the files to be used as class data
		 */
		String[] baseBallNames = FileUtils.read("baseball.txt");
		double[] baseBallJerseys = FileUtils.readRealValues("baseBallJersey.txt");
		String[] basketBallNames = FileUtils.read("basketBall.txt");
		double[] basketBallJerseys = FileUtils.readRealValues("basketBallJersey.txt");
		
		
		
	/**
	 * fill baseBall roster
	 */
		for(int i = 0; i < baseBallNames.length; i++) {
			BaseBallPlayer bp = new BaseBallPlayer();
			
			bp.setName(baseBallNames[i]);
			double num = baseBallJerseys[i];
			/**
			 *converted to byte
			 */
			byte b = (byte) num;
			bp.setJerseyNum(b);
			baseBall.add(bp);	
//			System.out.println(bp.toString());

		}
	/**
	 * fill basketball roster
	 */
		for(int i = 0; i < basketBallNames.length; i++) {
			BasketBallPlayer bp = new BasketBallPlayer();
			
			bp.setName(basketBallNames[i]);
			double num = basketBallJerseys[i];
			/**
			 * convert to byte
			 */
			byte b = (byte) num;
			bp.setJerseyNum(b);
			basketBall.add(bp);
//			System.out.println(bp.toString()); 
		}
		
		/**
		 * first output and get first input
		 */
		System.out.println(output1);
		String input = sc.next();		
		/**
		 * null check
		 */
		if (input == null) {
			/**
			 * shut down everything
			 */
			System.out.println(bye);
			sc.close();
			System.exit(0);
		} else {do {
			/**
			 * the conditions based off input
			 */
					switch (input) {
					
						case "q":
							input = "q";
							System.out.println(bye);
							break;
							
						case "1":
							/**
							 * basketball
							 */
							System.out.println(output2);
							input = sc.next();
							System.out.println(basketBall.findByName(input));
							break;
							
						case "2":
							/**
							 * baseball
							 */
							System.out.println(output2);
							input = sc.next();
							System.out.println(baseBall.findByName(input));
							break;
							
						default :
							System.out.println(invalid);
							sc.close();
							System.exit(0);
							break;
				}
				/**
				 * get input again after the comparison
				 */
				System.out.println(output1);
				input = sc.next();	
				/**
				 * exit case
				 * 
				 */
			} while(!input.equals("q"));
			System.out.println(bye);
			sc.close();
			System.exit(0);

		}
	}
}
