/**
 * This class represents the main program of an ATM.
 *
 * This is our first example of a Java (domain) class.
 *
 * @version 1.0, 1/27/2026
 * @author Eric Staggs
 */
public class Checking {
//	private variables 
	private double amount = 0;
	private double total = 0;
	

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

}
