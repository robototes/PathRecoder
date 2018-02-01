package org.usfirst.frc.team2412.robot.subsystems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.usfirst.frc.team2412.robot.trajectory.Setpoint;
import org.usfirst.frc.team2412.robot.trajectory.Trajectory;

import edu.wpi.first.wpilibj.command.Subsystem;

public class FileSubsystem extends Subsystem {
	
	private List<String> filenames;
	
	public FileSubsystem(List<String> files) {
		filenames = files;
	}
	
	private List<String> readLines(int index) throws java.io.IOException {
		String filename = filenames.get(index);
		List<String> lines = new ArrayList<String>();
		BufferedReader br = Files.newBufferedReader(Paths.get(filename));
		lines = br.lines().collect(Collectors.toList());
		return lines;
	}
	
	public void writeLines(List<String> lines, int index) throws java.io.IOException {
		String filename = filenames.get(index);
		BufferedWriter bw = Files.newBufferedWriter(Paths.get(filename));
		for(String line : lines) {
			bw.write(line);
		}
		bw.close();
	}
	
	/**
	 * readPath() generates a Trajectory from a file.
	 * @param index Which file to read the paths from.
	 * @return A Trajectory instance, created from the specified file.
	 */
	public Trajectory readPath(int index) {
		try {
			List<String> lines = readLines(index);
			List<Setpoint> points = new ArrayList<Setpoint>();
			for(String line : lines) {
				double[] values = splitLine(line);
				points.add(new Setpoint(values[0], values[1]));
			}
			return new Trajectory(points);
		} catch(java.io.IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	protected void initDefaultCommand() {
		
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
