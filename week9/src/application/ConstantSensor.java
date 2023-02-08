package application;

public class ConstantSensor implements Sensor{
	
	private int measure;
	
	public ConstantSensor( int measure) {
		this.measure=measure;
	}

	@Override
	public boolean isOn() {
		return true;
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int measure() {
		return this.measure;
	}

}
