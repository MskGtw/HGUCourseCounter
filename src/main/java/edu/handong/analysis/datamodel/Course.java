package edu.handong.analysis.datamodel;

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
/*
		ArrayList<String> data = new ArrayList<String>();
		String[] s = line.trim().split(",");
		for(int i = 0;i<data.size();i++) {
			String lines = s[i];
			data.add(lines);
		}
*/			
		studentId = line.split(",")[0].trim();
		yearMonthGraduated = line.split(",")[1].trim();
		firstMajor = line.split(",")[2].trim();
		secondMajor = line.split(",")[3].trim();
		courseCode = line.split(",")[4].trim();
		courseName = line.split(",")[5].trim();
		courseCredit = line.split(",")[6].trim();
		yearTaken = Integer.parseInt(line.split(",")[7].trim());
		semesterCourseTaken = Integer.parseInt(line.split(",")[8].trim());
	}


public void setStudentId(String studentId) {
	this.studentId = studentId;
}

public String getStudentId() {
	return studentId;
}

public void setYearMonthGraduated(String yearMonthGraduated) {
	this.yearMonthGraduated = yearMonthGraduated;
}

public String getYearMonthGraduated() {
	return yearMonthGraduated;
}

public void setFirstMajor(String firstMajor) {
	this.firstMajor = firstMajor;
}

public String getFirstMajor() {
	return firstMajor;
}

public void setSecondMajor(String secondMajor) {
	this.secondMajor = secondMajor;
}

public String getSecondMajor() {
	return secondMajor;
}

public void setCourseCode(String courseCode) {
	this.courseCode = courseCode;
}

public String getCourseCode() {
	return courseCode;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public String getCourseName() {
	return courseName;
}

public void setYearTaken(int yearTaken) {
	this.yearTaken = yearTaken;
}

public int getYearTaken() {
	return yearTaken;
}

public void setCourseCredit(String courseCredit) {
	this.courseCredit = courseCredit;
}

public String getCourseCredit() {
	return courseCredit;
}

public void setSemesterCourseTaken(int semesterCourseTaken) {
	this.semesterCourseTaken = semesterCourseTaken;
}

public int getSemesterCourseTaken() {
	return semesterCourseTaken;
}

}