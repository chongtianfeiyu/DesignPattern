package Design_principles.DIP.success;

import Design_principles.DIP.error.AutoSystem.CarType;

public class test {
	public static void main(String[] args) {
		AutoSystem autoSystem=new AutoSystem(new BmwCar());
		autoSystem.test();
		
	}
}
