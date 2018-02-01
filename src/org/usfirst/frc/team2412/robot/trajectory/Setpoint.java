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
	 * Constructor. Creates a new Setpoint instance from velocity and angle values.
	 */
	public Setpoint(double velocity, double angle) {
		this.velocity = velocity;
		this.angle = angle;
	}
}
