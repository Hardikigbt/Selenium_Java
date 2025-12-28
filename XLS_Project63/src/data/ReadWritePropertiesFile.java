package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[]args) throws IOException{
	
		FileInputStream f = new FileInputStream("E:\\QA Work Space\\SeleniumJar\\porp.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		String email = prop.getProperty("correctEmail");
		System.out.println(email);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("tool"));
		System.out.println(prop.getProperty("incorrectemail"));
	
		prop.setProperty("defect","jira");
		System.out.println(prop.getProperty("defect"));
		
		prop.setProperty("language","Java");
		System.out.println(prop.getProperty("language"));
		
		FileOutputStream fo = new FileOutputStream("E:\\QA Work Space\\SeleniumJar\\prop.properties");
		prop.store(fo, "Adding to Properties file");
	
}}
