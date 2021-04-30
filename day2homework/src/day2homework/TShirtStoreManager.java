package day2homework;

public class TShirtStoreManager {

	public static void getPrice(TShirtStore store) {
		
		System.out.println(store.gettShirt().getName() + " tShirtin fiyati " + store.gettShirt().getPrice() +"TL");
	}
	
	public static void getTShirt(TShirtStore store) {
		
		System.out.println(store.tShirt.name + " satın aldınız, Hayırlı olsun ");
		System.out.println("Mağaza ismi: " + store.getName() + "\nMağaza Addresi :" + store.getAddress() );
		System.out.println("*****************************************************************************");
		System.out.println("");
	}
	
}
