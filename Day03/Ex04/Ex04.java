import java.util.Scanner;
class Ex04{
	public static void main(String args[]){
		Scanner sm =new Scanner(System.in);
		System.out.print("Input character:");
		char vowels=sm.next().charAt(0);
		switch (vowels){
			case 'a': case 'e': case 'i': case 'o': case 'u':
			
			case 'A': case 'E': case 'I': case 'O': case 'U':
				System.out.println(vowels+ " is Vowel Char");
				break;
			default:System.out.println("It is Not vowls");
		}
	}
}