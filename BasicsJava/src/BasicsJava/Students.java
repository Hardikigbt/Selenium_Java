package BasicsJava;

public class Students {

	int Age;
	int RollNo;
	
	public void Display1() {
		
		System.out.println("Wellcome all");
		
	}
	public void Display2() {
		
		System.out.println("Automation is Easy");
	}
	

	public static void main(String[] args) {

		Students abc = new Students();
		abc.Display1();
		abc.Display2();
		abc.Age = 31;
		abc.RollNo= 11;
		System.out.println("My Age is"+ "-"+abc.Age );
		System.out.println("My RollNo is"+"-"+abc.RollNo);
		
	}

}
