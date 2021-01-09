package constructor;

import functions.Library;

public class User {

	public static void main(String[] args) {
		//Car.wheels= 40;
		Car kia =new Car();
		kia.colour = "Red";
		kia.engine = 2000;
		kia.model = "Seltos";
	//kia.wheels= 4;
		
		
		kia.features();
		
		Car vw = new Car();
		/*
		 * vw.colour ="Yellow"; vw.engine =44223; vw.model ="Polo";
		 */
		vw.wheels =4;
		vw.features();
		
		Car honda =new Car();
		/*
		 * honda.colour ="Black"; honda.engine=4000; honda.model = "City";
		 */
		
		honda.features();
		
		
	}

}
