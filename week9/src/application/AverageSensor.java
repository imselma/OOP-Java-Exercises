package application;
import java.util.ArrayList;

public class AverageSensor implements Sensor {
	
	private ArrayList<Sensor> sensors;
	private ArrayList<Integer> reading;
	
	public AverageSensor() {
		this.sensors = new ArrayList<Sensor>();
		this.reading = new ArrayList<Integer>();
	}
	
	 public void addSensor(Sensor additional) {
		 
		 this.sensors.add(additional);
	 }
	 
	 public ArrayList<Integer> readings(){
		 return this.reading;
	 }

	@Override
	public boolean isOn(){
		for(Sensor s : this.sensors) {
			if (!s.isOn()) {
				
				return false;
			}
	    }
		return true;
	}

	@Override
	public void on() {
		for(Sensor s : this.sensors) {
			s.on();
		}
	}

	@Override
	public void off() {
		for(Sensor s : this.sensors) {
			s.off();
		}
	}
	
	@Override
	public int measure() {
		int sum =0;
		if(!this.isOn()|| this.sensors.isEmpty()) {
			throw new IllegalStateException();
		}
		for(Sensor s : this.sensors) {
			sum=sum+s.measure();
			this.reading.add(s.measure());
			}
		return sum/this.sensors.size();
	}

}
