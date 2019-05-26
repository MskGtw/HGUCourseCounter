package edu.handong.analysis.datamodel;

import java.util.ArrayList;

public class Course {

	private String studentId;
	private String yearMonthGraduated;
	private String firstMajor;
	private String secondMajor;
	private String courseCode;
	private String courseName;
	private String courseCredit;
	private int yearTaken;
	private int semesterCourseTaken;

	public Course(String line){
		
		ArrayList<String> data = new ArrayList<String>();
		String[] s = line.trim().split(",");
		for(int i = 0;i<data.size();i++) {
			String lines = s[i];
			data.add(lines);
		}
			
		studentId = data.get(0);
		yearMonthGraduated = data.get(1);
		firstMajor = data.get(2);
		secondMajor = data.get(3);
		courseCode = data.get(4);
		courseName = data.get(5);
		courseCredit = data.get(6);
		yearTaken = Integer.parseInt(data.get(7));
		semesterCourseTaken = Integer.parseInt(data.get(8));
	}
}

