package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;
//*************What is the difference between Drive and ArcadeDrive
public class ArcadeDrivewithDrive extends Command{

	@Override
    // Called just before this Command runs the first time
	protected void initialize() {
		Robot.drive.stopMotors();
	}

	@Override
	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.drive.useArcadeDrive(Robot.stick);
	}

	@Override
	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	@Override
	// Called once after isFinished returns true
	protected void end() {
		//*************Doesn't this mean stop motors will never happen, considering it only returns false?
		Robot.drive.stopMotors();
	}

	@Override
	// Called when another command which requires one or more of the same
    // subsystems is scheduled to run
	protected void interrupted() {
	}
}
