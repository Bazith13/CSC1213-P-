import java.util.Scanner;
class Ex05{
	public static void main(String args[]){
		Scanner op = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=op.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.print(i+"\t");
		}
	}
}