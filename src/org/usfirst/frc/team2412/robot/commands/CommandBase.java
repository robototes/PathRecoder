package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.Robot;
import org.usfirst.frc.team2412.robot.subsystems.DriveBaseSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.FileSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command {
	public static FileSubsystem fileSystem = new FileSubsystem(Robot.files);
	public static DriveBaseSubsystem driveBase = new DriveBaseSubsystem();
	
	@Override
	protected boolean isFinished() {
		return false;
	}

}
