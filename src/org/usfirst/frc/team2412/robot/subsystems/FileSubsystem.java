package org.usfirst.frc.team2412.robot.subsystems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.wpi.first.wpilibj.command.Subsystem;

public class FileSubsystem extends Subsystem {
	
	private List<String> filenames;
	
	public FileSubsystem(List<String> files) {
		filenames = files;
	}
	
	public List<String> readLines(int index) throws java.io.IOException {
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
	
	@Override
	protected void initDefaultCommand() {
		
	}

}
