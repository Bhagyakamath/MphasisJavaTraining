package com.fls;

import java.io.FileWriter;

public class Exp3 {

	public static void main(String[] args) {
		try(FileWriter fw=new FileWriter("src/rsourcetest.txt")) {
			fw.write("This is simple try with resources example.");
			fw.append("This is a appended sentence.");
			System.out.println("Done");
			fw.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
