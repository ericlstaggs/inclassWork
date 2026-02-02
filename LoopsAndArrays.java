/**
 * 
 */
package noon;

/**
 * 
 */
public class LoopsAndArrays {
//	instance variable
	private int myField;

	public static void main(String[] args) {

		int x = 0;
		int y;
		int z;
//		must tell it how big it is
		int[] array = new int[5];

		LoopsAndArrays obj = new LoopsAndArrays();
		System.out.println(array[0]);

//		c language
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + " " + array[i]);
		}
		

	}

	/**
	 * @return the myField
	 */
	public int getMyField() {
		return myField;
	}

	/**
	 * @param myField the myField to set
	 */
	public void setMyField(int myField) {
		this.myField = myField;
	}
}
