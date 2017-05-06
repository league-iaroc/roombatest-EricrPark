package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		
		
		
	}

	public void loop() {
		driveDirect(500,400);
		if(isBumpedRight()) {
			driveDirect(100,500);
			sleep(750);
			driveDirect(0,0);
		}
	}
}
