package usage;

import structure.Hoagie;
import structure.concrete.ItalianHoagie;
import structure.concrete.VeggieHoagie;

public class SandwichMaker {

	public static void main(String[] args) {
		
		Hoagie customer01Hoagie = new ItalianHoagie();
		customer01Hoagie.makeSandwich();
		
		System.out.println();
		
		Hoagie customer02Hoagie = new VeggieHoagie();
		customer02Hoagie.makeSandwich();
	}

}
