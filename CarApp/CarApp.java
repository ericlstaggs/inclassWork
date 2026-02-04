import com.carsrus.Car;


public class CarApp {
	public static void main(String[] args) {
		// data for 3 objects
		int[] years = {1964, 2001, 2026};
		String[] makes = new String[3];
		makes[0] = new String("Ford");
		makes[1] = "Chevy";
		makes[2] = "BMW";
		boolean[] tran = {true, false, false};
		
		// create an array for 3 cars
		Car[] cars = new Car[3];
		
		// create the 3 cars w/ new
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
		}
		
		// populate the 3 cars w/ data
		for (int i = 0; i < cars.length; i++) {
			cars[i].setYear(years[i]);
		}

		// print out the 3 cars
		for (Car car : cars) {
			System.out.println(car);
		}
		
		
//		Car ford = new Car(1964, "Mustang", true);
//		System.out.println(ford);
	}
}
