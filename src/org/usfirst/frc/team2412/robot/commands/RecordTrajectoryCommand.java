package org.usfirst.frc.team2412.robot.commands;

import java.util.ArrayList;
import java.util.List;

import org.usfirst.frc.team2412.robot.Robot;
import org.usfirst.frc.team2412.robot.trajectory.Setpoint;
import org.usfirst.frc.team2412.robot.trajectory.Trajectory;

public class RecordTrajectoryCommand extends CommandBase {
	private List<Setpoint> points = new ArrayList<Setpoint>();
	public RecordTrajectoryCommand() {
		requires(driveBase);
		requires(fileSystem);
	}
	@Override
	protected boolean isFinished() {
		return false;
	}
	
	protected void execute() {
		System.out.println("Recording path...");
		
		double velocity = -Robot.m_oi.stick.getY();
		double angle = Robot.m_oi.stick.getTwist();
		
		System.out.println("Velocity: " + velocity);
		System.out.println("Angle: " + angle);
		
		points.add(new Setpoint(velocity, angle));
		
		driveBase.drive(velocity, angle, true);
	}
	
	protected void end() {
		fileSystem.writeTrajectory(new Trajectory(points), 0);
	}
}
