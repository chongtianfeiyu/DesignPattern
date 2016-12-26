package Design_principles.DIP.error;

import Design_principles.DIP.error.AutoSystem.CarType;

public class test {
	public static void main(String[] args) {
		AutoSystem autoSystem=new AutoSystem(CarType.Ford);
		autoSystem.test();
	}
}
