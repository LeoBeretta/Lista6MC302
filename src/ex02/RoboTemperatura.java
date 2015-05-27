package ex02;

public class RoboTemperatura implements RoboAction {
	
	private Ambient ambient;
	
	public RoboTemperatura(Ambient amb) {
		this.ambient = amb;
	}
	
	@Override
	public void execute() {
		ambient.MudaTemperatura(0.5);
	}
	
}
