package assignment2;

public class Mobile {
	
public void makeCall() {
	
	String mobileModel = "Redmi";
	float mobileWeight = 2.5f; //kg
	
		
		System.out.println("mobileModel="+mobileModel);
		System.out.println("mobileWeight="+mobileWeight);
}
public void sendMessage() {	
	boolean isFullyCharged =true;
	int mobileCost = 10000; //rupees
	System.out.println("isFullyCharged="+isFullyCharged);
	System.out.println("mobileCost="+mobileCost);
}
	public static void main(String[] args) {
		
		Mobile obj = new Mobile();
		obj.makeCall();
		obj.sendMessage();
		System.out.println("This is my mobile");
	}
}

// Access modifier return type  methodName
// shortcut key to create a method ctrl+space
// mainmethod ctrl+space+enter
// Syso ctrl+space+enter
//method ctrl+space
//object 