package day2homework;

public class TShirt {
	String name;
	String size;
	String color;
	String brand;
	double price;
	
	public TShirt() {
		this("Polo Yaka", "M beden", "Beyaz", "Lefacto", 50.5);
	}
	
	public TShirt(String name, String size, String color, String brand, double price) {
		super();
		setName(name);
		setSize(size);
		setColor(color);
		setBrand(brand);
		setPrice(price);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
