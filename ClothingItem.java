public class ClothingItem {
	private String name;
	private double price;

	public ClothingItem(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void displayInfo() {
		System.out.println("Item :" + name);
		System.out.println("Price: $" + price);
	}
}
