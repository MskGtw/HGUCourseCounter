package edu.handong.analysis.utils;

import java.io.*;
import java.util.ArrayList;

public class Utils {
	
	public static ArrayList<String> getLines(String file, boolean removeHeader){
		
		ArrayList<String> lines1 = new ArrayList<String>();
		File file1 = new File("hw5data.csv");
		try {
			
			BufferedReader in = new BufferedReader(new FileReader(file1));

			
			for(int i = 0 ; i < 100 ; i++){
				lines1.add(in.readLine());
				if(removeHeader == true)
					removeHeader = false;
				else {
				if(lines1.get(i) == null)
					break;
				
				System.out.println("read : " + i + " " + lines1.get(i));
				lines1.add(in.readLine());
				
				}
			}
			in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		return lines1;
		
	}
	public static void writeAFile(ArrayList<String> lines, String targetFileName) {
		
		File file2 = new File(targetFileName);
		
		try {
			PrintWriter out = new PrintWriter(new FileWriter(file2,true));
			ArrayList<String> write = new ArrayList<String>();
			
			for(int i = 1 ; i < write.size() ; i++){
				write.add(lines.get(i));
				if(write.get(i) == null)
					break;
				System.out.println("read: " + write.get(i));
				out.println(write.get(i));
				write.add(lines.get(i));
				
			}
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
