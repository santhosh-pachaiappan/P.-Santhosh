package assignment4;

public class Bike {
	
	
	public void applyBrake() {
		
		System.out.println("Bike Applied Brake");
	}

	public void soundHorn() {
		System.out.println("Bike Sound Horn");
		
	}
	public static void main(String[] args) {
		

		
		
		Car Bike = new Car();
		Bike Pulsar = new Bike();
		Bike.applyBrake();
		Bike.soundHorn();
		Pulsar.applyBrake();
		Pulsar.soundHorn();
	}

}
