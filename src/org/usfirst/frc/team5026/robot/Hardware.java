package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;

public class Hardware {

	public Talon talonLeftDrive1;
	public Talon talonLeftDrive2;
	public Talon talonLeftDrive3;

	public Talon talonRightDrive1;
	public Talon talonRightDrive2;
	public Talon talonRightDrive3;

	public MotorGroup leftSide;
	public MotorGroup rightSide;

	public Talon[] leftMotors = new Talon[3];
	public Talon[] rightMotors = new Talon[3];

	public Joystick stick;

	public Talon intake; 

	public DigitalInput bannerSensor;

	public Hardware() {
		talonLeftDrive1 = new Talon(Constants.TALON_LEFT_1);
		talonLeftDrive2 = new Talon(Constants.TALON_LEFT_2);
		talonLeftDrive3 = new Talon(Constants.TALON_LEFT_3);
		talonRightDrive1 = new Talon(Constants.TALON_RIGHT_1);
		talonRightDrive2 = new Talon(Constants.TALON_RIGHT_2);
		talonRightDrive3 = new Talon(Constants.TALON_RIGHT_3);

		leftMotors[0] = talonLeftDrive1;
		leftMotors[1] = talonLeftDrive2;
		leftMotors[2] = talonLeftDrive3;
		rightMotors[0] = talonRightDrive1;
		rightMotors[1] = talonRightDrive2;
		rightMotors[2] = talonRightDrive3;

		leftSide = new MotorGroup(leftMotors, Constants.INVERTED_LEFT);
		rightSide = new MotorGroup(rightMotors, Constants.INVERTED_RIGHT);

		stick = new Joystick(Constants.JOYSTICK_PORT); 
		intake = new Talon(Constants.INTAKE);
	}
}
