import java.util.Scanner;

public class Activity{
	//1.Greet a User by Name
	static void greetUser(String name){
		System.out.println("Hello, "+name+"! Welcome!");
	}
	
	//2.Calculate and Return the Cube of a Number
	static int cube(int number){
		return number*number;
	}
	
	//3. Check Voting Eligibility
	static void checkVotingEligibility(int age){
		if (age >= 18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not eligible");
		}
	}
	
	//4. Calculate Factorial of a Number
	static void factorial (int a){
		int fac = 1;
		for (int i=1; i<=a; i++)
		{
			fac = fac*i;
		}
		
		System.out.println("The Factorial of the number: "+fac);
	}
	
	//5. Overload a Greeting Method
	static void greet(String name){
		System.out.println("Hi, "+name+"!");
	}
	static void greet(String name,int age){
		System.out.println("Hi, "+name+"! You are "+age+" years");
	}
	
	//6. Return the Average of Three Numbers
	static int average (int a,int b, int c){
		return a+b+c;
	}
	
	public static void main (String [] args)
	{
		greetUser("Bazith");
		System.out.println(cube(3));
		checkVotingEligibility(22);
		factorial(5);
		greet("Bazith");
		greet("Bazith");
		greet("Bazith",22);
		System.out.println("The average is: "+((double)average(23,14,36))/3);
	}
}