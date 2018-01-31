package org.usfirst.frc.team2412.robot.commands;

public class ReadPathCommand extends CommandBase {
	public ReadPathCommand() {
		requires(fileSystem);
	}
	
	/**
	 * This method takes a single string and converts the numeric characters inside into an array of doubles, which is returned.
	 */
	private double[] splitLine(String line) {
		String pieces[] = line.split(", ");
		double[] nums = new double[pieces.length];
		for(int i = 0; i < nums.length; i++) {
			String piece = pieces[i].split(",")[0];
			nums[i] = Double.parseDouble(piece);
		}
		return nums;
	}
	
}
