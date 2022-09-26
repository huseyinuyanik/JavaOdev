package classesWithAttributes;

public class Product {
	
	public Product(int id, int stock, double price, String description, String name) {
		System.out.println("Yapici Blok calisti.");
		this.id=id;
		this.stock=stock;
		this.price=price;
		this.description=description;
		this.name=name;
		
		
	}
	// attributes
	
	private String name;
	private String description;
	private double price;
	private int stock;
	private int id;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	 
	

}
