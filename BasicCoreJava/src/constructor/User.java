package constructor;

public class User {

	public static void main(String[] args) {

		//Car.wheels= 4;
		
		Car kia =new Car();
		kia.colour ="Silver";
		kia.engine =1200;
		kia.model ="Seltos";
		
		
		kia.features();
		
		Car vw =new Car();
		vw.colour="White";
		vw.engine=3000;
		vw.model="Polo";
		
		vw.features();
		
		Car honda =new Car();
		honda.colour="Black";
		honda.engine=4000;
		honda.model="City";
		//honda.wheels=4;
		honda.features();
	}

}
