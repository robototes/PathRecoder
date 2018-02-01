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
	
	@Override
	public String toString() {
		String str = "";
		for(int i = 0; i < setpoints.size(); i++) {
			Setpoint point = setpoints.get(i);
			str += point.toString();
			if(i < setpoints.size() - 1) {
				str += ",";
			}
			str += "\n";
		}
		return str;
	}
	
	/**
	 * Getter method for List of Setpoints.
	 * @return A List of Setpoints that this Trajectory instance holds.
	 */
	public List<Setpoint> getSetpoints() {
		return setpoints;
	}
}
