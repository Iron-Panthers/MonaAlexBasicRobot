package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

public class MotorGroup implements SpeedController {

	public Talon[] motors;
	public boolean[] isInverted;

	public MotorGroup(Talon[] motors, boolean[] isInverted) {
		this.motors = motors;
		this.isInverted = isInverted;
	}

	@Override
	public void pidWrite(double output) {
	}

	@Override
	public double get() {
		return 0;
	}

	public void set() {
	}

	@Override
	public void set(double speed) {
		// TODO Auto-generated method stub
		for (int i = 0; i < motors.length; i++) {
			if (isInverted[i]) {
				motors[i].set(-speed);
			}
			else {
				motors[i].set(speed);
			}
		}
	}

	@Override
	public void setInverted(boolean isInverted) {
	}

	@Override
	public boolean getInverted() {
		return false;
	}

	@Override
	public void disable() {
	}

	@Override
	public void stopMotor() {
		set(0);
	}
}
