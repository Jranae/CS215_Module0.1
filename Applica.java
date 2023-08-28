
public class Applica {
//Main class for items inside small bag
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//instantiating small bag class
		Smallbag<Item> purple = new Smallbag<Item>();
		Item<String> leah = new Item<String>();
		leah.setE("Ja'Leah");
//Instantiating item class		
		Item<Integer> yellow = new Item<Integer>();
		yellow.setE(5);
		
		purple.setE(leah);
		System.out.println(purple.getE().getE());
		
		purple.setE(yellow);
		System.out.println(purple.getE().getE());
		
		
	}

}
//End Main class