package Design_principles.OCP;

public class AppleGardener implements gardenerBase// ��ֲApple��Garden
{
	private static AppleGardener singleton;

	private AppleGardener() {
	}

	public static AppleGardener getGardener() {
		if (singleton == null)
			singleton = new AppleGardener();
		return singleton;
	}

	public Fruit getFruit() {
		return new Apple();
	}
}