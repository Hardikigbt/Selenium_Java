package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Add log4j.jar to the project - to build path
//		copy log4j.propertie directly inside the SRC folder
//		Create the object of logger in the code
		
		Logger print = Logger.getLogger("devpinoyLogger");
		print.debug("hello");
//		System.out.println("hello");
		print.debug("We are weriting in to a log file");
		print.debug("startting the test case xyz test");
		print.debug("starting the test case xyz test1");
		
	}

}
