package org.usfirst.frc.team2412.robot.commands;

import java.util.List;

import org.usfirst.frc.team2412.robot.trajectory.Setpoint;
import org.usfirst.frc.team2412.robot.trajectory.Trajectory;

public class RunTrajectoryCommand extends CommandBase {
	private List<Setpoint> points;
	private int pointIndex = 0;
	
	public RunTrajectoryCommand(Trajectory t) {
		requires(driveBase);
		requires(fileSystem);
		points = t.getSetpoints();
	}
	@Override
	protected boolean isFinished() {
		return false;
	}
	
	protected void execute() {
		if(pointIndex >= 0 && pointIndex < points.size()) {
			System.out.println("Running path...");
			Setpoint curpoint = points.get(pointIndex);
			double velocity = curpoint.velocity;
			double angle = curpoint.angle;
			
			System.out.println("Velocity: " + velocity);
			System.out.println("Angle: " + angle);
			
			driveBase.drive(velocity, angle, true);
			pointIndex++;
		}
	}
	
	protected void end() {
		pointIndex = 0;
	}
}
