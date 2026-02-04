
public class LoopsAndArrays {
	
	// instance var
	private int myField;
	
	public static void main(String[] args) {
		String title = "The Hobbit";
		int[] array = {11, 22, 33};
		
		for (int num : array) {
			System.out.println(num);
		}
		// enhanced (for each)
		for (char letter : title.toCharArray()) {
			System.out.println(letter);
		}
		// 3 part C style
		for (int i = 0; i < title.length(); i++) {
			System.out.println(title.charAt(i));
		}
	}

	public static void xmain(String[] args) {
		int x = 0; // local
		int y;
		int z;
		int[] array = {11, 22, 33};
		
		array[0] = 23;
//		array[4] = 99;
		
		LoopsAndArrays obj = new LoopsAndArrays();
//		System.out.println("" + array[0]);
		
		// C lang
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + " " + array[i]);
		}
		
		int j = 0;
		do {

			System.out.println(array[j]);
			j++;
		} while (j < array.length);
		
		int i = 0;
		
		System.out.println(i++);
		
//		while (true) {
//			continue;
//			// skip
//		}
		
	}
}
