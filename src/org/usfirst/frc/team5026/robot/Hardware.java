package org.usfirst.frc.team5026.robot;

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

	public Hardware() {
		talonLeftDrive1 = new Talon(Constants.TALON_LEFT_1);
		talonLeftDrive2 = new Talon(Constants.TALON_LEFT_2);
		talonLeftDrive3 = new Talon(Constants.TALON_LEFT_3);
		talonRightDrive1 = new Talon(Constants.TALON_RIGHT_1);
		talonRightDrive2 = new Talon(Constants.TALON_RIGHT_2);
		talonRightDrive3 = new Talon(Constants.TALON_RIGHT_3);

		leftMotors[0] = Robot.hardware.talonLeftDrive1;
		leftMotors[1] = Robot.hardware.talonLeftDrive2;
		leftMotors[2] = Robot.hardware.talonLeftDrive3;
		rightMotors[0] = Robot.hardware.talonRightDrive1;
		rightMotors[1] = Robot.hardware.talonRightDrive2;
		rightMotors[2] = Robot.hardware.talonRightDrive3;

		leftSide = new MotorGroup(leftMotors, Constants.INVERTED_LEFT);
		rightSide = new MotorGroup(rightMotors, Constants.INVERTED_RIGHT);
	}
}
