package edu.handong.analysis.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
	
	public static ArrayList<String> getLines(String file, boolean removeHeader){
		
		ArrayList<String> lines1 = new ArrayList<String>();
		
		Scanner inputStream = null;
		try {
			
			inputStream = new Scanner(new File(file));
			
			while (inputStream.hasNextLine ()) {
				String line = inputStream.nextLine();
				if(removeHeader) {
					removeHeader = false;
					continue;
				}
				else
					lines1.add(line);
			}
			
			inputStream.close();
		}catch(FileNotFoundException e) {
			System.out.println("The file path does not exist. Please check your CLI argument!");
		}
	
		return lines1;
		
	}
	public static void writeAFile(ArrayList<String> lines, String targetFileName) {
		
		PrintWriter outputStream = null;
		
		try {
			outputStream = new PrintWriter(targetFileName);
			outputStream.println("StudentID, TotalNumberOfSemestersRegistered, Semester, NumCoursesTakenInTheSemester");
			for(String line:lines){
				outputStream.println(line);
			}
		}catch(FileNotFoundException e) {
			System.out.println("The file path does not exist. Please check your CLI argument!");
			System.exit(0);
		}
		
	outputStream.close();
	}
}
