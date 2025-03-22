import java.util.Scanner;
class Ex04
{ 
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your firstname: ");
		String fname = sc.nextLine();
		System.out.print("Enter your lastname:");
		String lname = sc.next();
		System.out.print("Enter your Age: ");
		int Age=sc.nextInt();
		
		
		System.out.print("Enter your Reg No: ");
		String RegNo=sc.next();
		
		System.out.print("Enter your Sex(F/M): ");
		char Sex=sc.next().charAt(0);
		
		System.out.print("Enter your Mobile No: ");
		long MobNo=sc.nextLong();
		
		System.out.print("Enter your GPA: ");
		double GPA=sc.nextDouble();
		
		System.out.println("Fullname :"+fname+" "+lname+"\n"+"Age is: "+Age+"\n"+"Reg No is: "+RegNo+"\n"+"Sex is :"+Sex+"\n"+"Mobile Number is: "+MobNo+"\n"+"GPA is:"+GPA);
	}
}