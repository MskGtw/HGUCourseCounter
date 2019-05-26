package edu.handong.analysis.datamodel;

import java.util.ArrayList;
import java.util.HashMap;
import edu.handong.analysis.datamodel.*;
import edu.handong.analysis.utils.Utils;

public class Student {
	
	private String studentId;
	private ArrayList<Course> coursesTaken;
	private HashMap<String,Integer> semestersByYearAndSemester;
	
	public Student(String studentId) {
		this.studentId = studentId.split(",")[0].trim();	
	}
	
	public void addCourse(Course newRecord){
		ArrayList<Course> coursesTaken = new ArrayList<Course>();
		coursesTaken.add(newRecord);
	}
	
	public HashMap<String,Integer> getSemestersByYearAndSemester() {
		
		HashMap<String, Integer> semestersByYearAndSemester = new HashMap<String, Integer>();
		
		return semestersByYearAndSemester; 
	}
	
	public int getNumCourseInNthSemester(int semester) {
		
		
	}
	
}
