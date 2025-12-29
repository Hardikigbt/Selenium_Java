package BasicsJava;

public class Arithmetic {
	
/* Assignment1----,((((10+2)+2)*2)-2)/2)

	we have to create four methods 	sum,sub,multi,div.
	we will create sum method only once,but we will call it two times
	int sumResult=obj.sum(10,2); 	int sumResult2=obj.sum(sumResult,2);
	Assigment2------,((((10*2)-2)+2)-2)/2)*/
	
	public int sum(int a,int b) {
		int c = (a+b);
		return c;
	}
	
	public int sub(int a1,int b1) {
		int d = (a1-b1);
		return d;
	}
	
	public int multi (int a2 ,int b2) {
		int e = (a2*b2);
		return e;
	}
		
	public int div (int a3 ,int b3) {
		int f = (a3/b3);
		return f;
	}
			
	public static void main(String[] args) {
		
		Arithmetic ari = new Arithmetic();
		int math1 = ari.sum(10,2);
		int math2 = ari.sum(math1, 2);
		int math3 = ari.multi(math2, 2);
		int math4 = ari.sub(math3, 2);
		int math5 = ari.div(math4, 2);
		System.out.println("((((10+2)+2)*2)-2)/2)"+"="+math5);
		
		int assi2 = ari.multi(10,2);
		int assi3 = ari.sub(assi2, 2);
		int assi4 = ari.sum(assi3, 2);
		int assi5 = ari.sub(assi4, 2);
		int assi6 = ari.div(assi5, 2);
		System.out.println("((((10*2)-2)+2)-2)/2)"+"="+assi6);
	
	}	}

