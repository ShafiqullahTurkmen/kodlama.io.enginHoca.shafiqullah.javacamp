package day2homework;

public class TShirtStore {
	String name;
	String address;
	TShirt tShirt;
	
	
	public TShirtStore(String name, String address, TShirt tShirt) {
		super();
		setName(name);
		setAddress(address);;
		settShirt(tShirt);;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public TShirt gettShirt() {
		return tShirt;
	}
	public void settShirt(TShirt tShirt) {
		this.tShirt = tShirt;
	}
	
	

}
