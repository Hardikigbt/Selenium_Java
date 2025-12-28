package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		
		//		Creat new test file
		File f = new File("E:\\QA Work Space\\SeleniumJar\\temp.txt");
		f.createNewFile();
		
		
		// write in to text file
		FileWriter w = new FileWriter(f);
		BufferedWriter out = new BufferedWriter(w);
		
		out.write("This is 1st line");
		out.newLine();
		out.write("This is 2nd line");
		out.newLine();
		out.write("This is 3rd line");
		out.newLine();
		out.write("This is 4th line");
		out.newLine();
		out.write("This is 5th line");
		out.flush();
		
		
//		Read Text File
		FileReader r = new FileReader(f);
		BufferedReader rd = new BufferedReader(r);
		/*System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());*/
		
		String s;
		int i = 0;
		while((s = rd.readLine()) != null) {
			System.out.println(rd.readLine());
			i++;
					
		}
		
		System.out.println("Number of lines:"+i);
}}
