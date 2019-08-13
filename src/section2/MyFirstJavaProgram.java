package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot zane=new Robot();
	zane.penDown();
	zane.setSpeed(75);
	for(int i=0;i<4;i++) {
	zane.move(100);	
	zane.turn(-90);
	}
}}
