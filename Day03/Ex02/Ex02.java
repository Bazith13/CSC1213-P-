import java.util.Scanner;
class Ex02{
	public static void main(String args[]){
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a=ip.nextInt();
		System.out.print("Enter a number: ");
		int b=ip.nextInt();
		System.out.print("Enter a number: ");
		int c=ip.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("Number "+a+" is Maximum");
		}
		else if(b>a && b>c)
		{
			System.out.println("Number "+b+" is Maximum");
		}
		else
		{
			System.out.println("Number "+c+" is Maximum");
		}
	}
}