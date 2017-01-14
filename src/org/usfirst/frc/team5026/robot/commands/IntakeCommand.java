package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeCommand extends Command {

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		Robot.intake.stopMotors();
	}
	
	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		if (Robot.intake.seesBall()) {
			Robot.intake.takeBall();
		}	
	}
	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.intake.stopMotors();
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		end();
		
	}

}
