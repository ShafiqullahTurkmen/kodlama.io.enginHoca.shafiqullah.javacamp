package day2homework;

public class Main {

	public static void main(String[] args) {
		//String name, String size, String color, String brand, double price
		TShirt tshirt1 = new TShirt("V yaka", "XL", "Siyah", "SDWalkiki", 80);
		TShirt tshirt2 = new TShirt("Bisklet yaka", "L", "Lacivert", "Moton", 40);
		TShirt tshirt3 = new TShirt("Polo yaka", "M", "Açık Mavi", "Lefacto", 50);
		
		TShirtStore store1 = new TShirtStore("The Mor", "Bla mahallesi sokak: 3 zeytinburnu/istanbul", tshirt1);
		TShirtStore store2 = new TShirtStore("The White", "ala mahallesi sokak: 4 bakirköy/istanbul", tshirt2);
		TShirtStore store3 = new TShirtStore("The Black", "dla mahallesi sokak: 3 kartal/istanbul", tshirt3);
		
		TShirtStore[] stores = {store1, store2, store3};
		
		for (TShirtStore store: stores) {
			TShirtStoreManager.getPrice(store);
			TShirtStoreManager.getTShirt(store);
			
		}
	}

}
