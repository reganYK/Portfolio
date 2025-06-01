public class TShirt extends ClothingItem {
	private String size;
	private String material;

	public TShirt (String name, double price, String size, String material) {
		super(name, price); // Call ClothingItem constructor
		this.size = size;
		this.material = material;
	}

	// Override display info method to add more detials specifically for T-shirts
	@Override
	public class displayInfo() {
		super.displayInfo(); // Call the parent version
		System.out.println("Size: " + size);
		System.out.println("Material: " size);
	}
}
