package level4;

import java.util.Timer;
import java.util.TimerTask;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	Timer timer= new Timer(true);
	Boolean turning = false;
	
	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}
	
	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {
		driveNormal();
	}

	public void loop() {
		if(!turning && isBumpedRight()) {
			driveDirect(50,250);
			turning = true;
			timer.schedule(new TimerTask() {
				
				@Override
				public void run() {
					driveNormal();
					turning=false;
				}
			}, 600);
		}	
	}
	public void driveNormal() {
		driveDirect(250,100);
	}
}
