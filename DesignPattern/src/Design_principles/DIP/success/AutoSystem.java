package Design_principles.DIP.success;

public class AutoSystem {
	private ICar icar;

	public AutoSystem(ICar icar) {
		this.icar = icar;
	}

	private void RunCar() {
		icar.Run();
	}

	private void TurnCar() {
		icar.Turn();
	}

	private void StopCar() {
		icar.Stop();
	}
	
    public void test(){
    	RunCar();
    	TurnCar();
    	StopCar();
    }
}
