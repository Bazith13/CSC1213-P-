import java.util.Scanner;
class Ex01{
	public static void main(String args[]){
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a=ip.nextInt();
		
		if(a>0)
		{
			System.out.println("The Number is Positive");
		}
		else if(a<0)
		{
			System.out.println("The Number is Negative");
		}
		else
		{
			System.out.println("The Number is Zero");
		}
	}
}