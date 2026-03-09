/**
 * 
 */
package monday;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 */
public class Sordid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {23,4,66,22,1};
		
		for(int number : nums) {
			System.out.println(number);
			
			
		}

		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int num : nums) {
			numbers.add(num);
		}
		
		
		Collections.sort(numbers);
		Arrays.sort(nums);
		
		System.out.println("//////////////////////////////////////////////");
		
		for(Integer number : numbers) {
			System.out.println(number);
		}
	}

}
