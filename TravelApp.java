package Serialazation;

import java.io.File;
import java.util.Set;
import java.util.function.Consumer;

public class TravelApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TravelUtility utility=new TravelUtility();
		//creating instance of file which we want to read
		File fileobj=new File("./src/TravelPackage.txt");
		Set<Travel> setOfTravels=utility.generateTravelObject(fileobj);
		System.out.println(setOfTravels);
		Consumer<Travel> con=(p)->System.out.println(p);
		setOfTravels.forEach(con);
	}

}
