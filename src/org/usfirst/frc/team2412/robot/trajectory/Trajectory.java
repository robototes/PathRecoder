package org.usfirst.frc.team2412.robot.trajectory;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a trajectory that the robot can follow (for example, driving in a straight line).
 * Each Trajectory instance holds an ArrayList of Setpoint instances.
 * 
 * @author Robototes
 *
 */

public class Trajectory {
	private List<Setpoint> setpoints = new ArrayList<Setpoint>();
	
	/**
	 * Constructor. Creates a Trajectory from a List of Setpoints.
	 */
	public Trajectory(List<Setpoint> setpoints) {
		this.setpoints = setpoints;
	}
}
