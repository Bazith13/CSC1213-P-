public class Ex04{
	public static int findMax(int a, int b, int c ){
	if( a >= b && a >= c){
		return a;
	}else if(b >= a && b >= c){
		return b;
	}else{
		return c;
	}
	}
	
	public static void main(String[] args){
		int max = findMax(10,25,15);
		System.out.println("Maximum: "+ max);
	}
	
}

public static int sum(int a , int b){
		return a+b;
	}
	public static double sum(double a, double b){
		return a+b;
	}
	
	public static void main(String[] args){
		int intResult=sum(5,10);
		double doubleResult=sum(3.5,2.5);
		
		System.out.println("Sum(int): "+ intResult);
		System.out.println("Sum(double): "+ doubleResult);
	}
}
