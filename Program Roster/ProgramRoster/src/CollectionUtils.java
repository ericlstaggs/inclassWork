import java.util.ArrayList;
/*
*This is a helper class to turn list into array lists
*
*@version 1.0, 2/20/2026
*@author Eric Staggs
*
*/
public class CollectionUtils {

//	create array lists to return
	private static ArrayList<Double> doubleList = new ArrayList<>();
	private static ArrayList<String> stringList = new ArrayList<>();

	public static ArrayList<Double> arrayToList(double[] array) {
		doubleList.clear();
		for (double element : array) {
			doubleList.add(element);
		}
		return doubleList;
	}

	public static ArrayList<String> arrayToList(String[] array) {
		stringList.clear();
		for (String element : array) {
			stringList.add(element);
		}
		return stringList;
	}
	

}
