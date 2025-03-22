import java .util.Scanner;
class Ex05{
	public static void main(String args[]){
		Scanner oe = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num=oe.nextInt();
		
		if(num%2==0)
		{
			System.out.println("The number is Even Number:");
		}
		else
		{
			System.out.println("The number is Odd Number");
		}
	}
}