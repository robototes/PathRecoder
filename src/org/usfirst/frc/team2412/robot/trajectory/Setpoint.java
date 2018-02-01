package org.usfirst.frc.team2412.robot.trajectory;

/**
 * This class represents a single point in time in the robot's trajectory.
 * It currently keeps track of velocity and angle values.
 * @author Robototes
 *
 */

public class Setpoint {
	
	/* Velocity and angle values (used with DifferentialDrive). */
	public double velocity;
	public double angle;
	
	/**
	 * Constructor. Access is restricted to only classes in the same package because only the Trajectory class needs to create Setpoints.
	 */
	Setpoint(double velocity, double angle) {
		this.velocity = velocity;
		this.angle = angle;
	}
}
