package Design_principles.OCP;

public class PearGardener implements gardenerBase// ��ֲPear��Garden
{
	private static PearGardener singleton;

	private PearGardener() {
	}

	public static PearGardener getGardener() {
		if (singleton == null)
			singleton = new PearGardener();
		return singleton;
	}

	public Fruit getFruit() {
		return new Pear();
	}
}