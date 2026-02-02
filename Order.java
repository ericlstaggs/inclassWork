
public class Order {
	
	private Wine wineSelection;
	
	public void setWineSelection(Wine choice) {
		wineSelection = choice;
	}
	
	public static void main(String[] args) {
//		System.out.println(Wine.values());
		
//		for (Wine w : Wine.values()) {
//			System.out.println(w);
//		}
		
		Order o1 = new Order();
		o1.setWineSelection(Wine.YELLA);
		
		System.out.println(o1.wineSelection);
	}
}
