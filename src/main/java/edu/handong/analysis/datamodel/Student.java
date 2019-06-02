package edu.handong.analysis.datamodel;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	
	private String studentId;
	private ArrayList<Course> coursesTaken;
	private HashMap<String,Integer> semestersByYearAndSemester;
	
	public Student(String studentId) {
		this.studentId = studentId;
		this.coursesTaken = new ArrayList<Course>();
		this.semestersByYearAndSemester = new HashMap<String, Integer>();
	}
	
	public void addCourse(Course newRecord){
		coursesTaken.add(newRecord);
	}
	
	
	public HashMap<String,Integer> getSemestersByYearAndSemester() {
		
		int forHashCount = 1;
		
		HashMap<String, Integer> semestersByYearAndSemester = new HashMap<String, Integer>();
		
		for(Course course:coursesTaken) {
			String lines = (Integer.toString(course.getYearTaken()).trim() + " - " + Integer.toString(course.getSemesterCourseTaken()).trim());
			
			if(semestersByYearAndSemester.containsKey(lines)) {
				continue;
			}
			else {
				semestersByYearAndSemester.put(lines, forHashCount);
				forHashCount = forHashCount+1;
			}
			
		}
		
		
		return semestersByYearAndSemester; 
	}
	
	public int getNumCourseInNthSemester(int semester) {
		
		int forSemCount = 0;
		
		for(Course course : coursesTaken) {
			String line = Integer.toString(course.getYearTaken()).trim() + " - " + Integer.toString(course.getSemesterCourseTaken()).trim();
			int forCompare = getSemestersByYearAndSemester().get(line);
			if(semester == forCompare)
				forSemCount++;
			else
				continue;
		}
		return forSemCount;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentId() {
		return studentId;
	}
	
}
