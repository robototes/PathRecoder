package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.Robot;

public class RecordPathCommand extends CommandBase {
	public RecordPathCommand() {
		requires(driveBase);
	}
	@Override
	protected boolean isFinished() {
		return false;
	}
	
	protected void execute() {
		System.out.println("Recording path...");
		driveBase.drive(Robot.m_oi.stick);
	}
}
