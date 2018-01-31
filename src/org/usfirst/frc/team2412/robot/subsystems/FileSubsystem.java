package org.usfirst.frc.team2412.robot.subsystems;

import java.util.List;

import edu.wpi.first.wpilibj.command.Subsystem;

public class FileSubsystem extends Subsystem {
	
	private List<String> filenames;
	
	public FileSubsystem(List<String> files) {
		filenames = files;
	}
	
	@Override
	protected void initDefaultCommand() {
		
	}

}
