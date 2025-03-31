import java.util.Scanner;
class Ex06{
	public static void main(String args[]){
		Scanner ol = new Scanner(System.in);
		System.out.print("Enter the value for counter1: ");
		int Counter1=ol.nextInt();
		System.out.print("Enter the value for counter2: ");
		int Counter2=ol.nextInt();
		for(int i=0;i<Counter1;i++)
		{
			System.out.println(" Value For i :"+i);
			
		for(int j=0;j<Counter2;j++)
		{
			System.out.println(" Value For j :"+j);
		}
		System.out.println();
		}
	}
}