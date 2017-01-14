package org.usfirst.frc.team5026.robot.subsystems;
import org.usfirst.frc.team5026.robot.Constants;
import org.usfirst.frc.team5026.robot.Robot;
import org.usfirst.frc.team5026.robot.commands.IntakeCommand;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {

	private Talon intake;
	private boolean seesBall;
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new IntakeCommand());
	}	

	public Intake(){
		intake = Robot.hardware.intake; 
	}
	//******I (Mona) added this so please check that it is correct. 
	public boolean seesBall(){
		seesBall = Robot.hardware.bannerSensor.get();
		return seesBall; 
	}

	public void takeBall(){
		intake.set(Constants.INTAKE_IN_SPEED);
	}

	public void takeOutBall(){
		intake.set(Constants.INTAKE_OUT_SPEED);
	}

	public void stopMotors(){
		intake.set(0);
	}
}
