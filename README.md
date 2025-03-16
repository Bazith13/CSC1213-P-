# CSC1213-P-
Date:-2022.03.12

Pactical No:-01

Problem Specification:-My First Java Program

Implementation:-

//class<class_name>
class MyFirstJavaProgram{
public static void main(String[] args)
{
	System.out.println(" MyFirstJavaProgram in Java");
	System.out.println(" Hello Java Developers !!!");
	
}// end of the main
}// end of the class.java

Output:-

MyFirstJavaProgram in Java

Hello Java Developers !!!

Conclusion:-I have learned the syntax of main method and printstatement

Date:-2022.03.12

Pactical No:-02

Problem Specification:-How to use Print Statement

Implementation:-

class Ex02

{

public static void main(String args[]) {

  String fac="FAS";
  int n=3;
  double p=10.5;
  int m=5;
  char w1='&';
  boolean isTH= true;
  
  System.out.println(fac);
  System.out.println(n);
  System.out.println(m);
  System.out.println(w1);
  System.out.println(isTH);
  
  System.out.println("my faculty is "+fac);
  System.out.println("The Result1 is "+(n+m));
  System.out.println("The Result2 is "+(p+m));
}

}

Output:-

FAS

3

5

&

true

my faculty is FAS

The Result1 is 8

The Result2 is 15.5

Conclusion:-I have learned how to merge using + operator

Date:-2022.03.12

Pactical No:-03

Problem Specification:-Printing Different datatype values

Implementation:-

class Ex03{
public static void main(String args[]) { 
boolean isBool=true;
System.out.println("Boolean :"+isBool);

byte ByteVal=120;
System.out.println("Byte :"+ByteVal);

int IntVal=1;
System.out.println("Integer :"+IntVal);

short ShortVal=14569;
System.out.println("Short :"+ShortVal);

long LongVal=10000;
System.out.println("Long :"+LongVal);

float FloatVal=19.56f;
System.out.println("Float :"+FloatVal);

double DoubleVal=169.456;
System.out.println("Double :"+DoubleVal);

char CharVal='a';
System.out.println("Char :"+CharVal);

char CharVal1='\u0064';
System.out.println("Byte :"+ByteVal);


}
}

Output:-

Boolean :true

Byte:120

Integer :1

Short :14569

Long :10000

Float :19.56

Double :169.456

Char :a

Char :d

Conclusion:-I have learned premetive datatype

Date:-2022.03.12

Pactical No:-04

Problem Specification:-printing string value

Implementation:-

class StuDetails{
	public static void main(String args[])
	{
		System.out.println("Name: Abdul Bazith");

		System.out.println("Registration Number:2022/ASP/41");

		System.out.println("Degree Programm: BSc.ComputerScience");

		System.out.println();

		String Name="Abdul Bazith";

		String RegNo="2022/ASP/41";

		String Degree="BSc.ComputerScience";

		System.out.println(" Full Name: "+Name);

		System.out.println("Registration Number: "+RegNo);

		System.out.println("Degree Programm:" + Degree);
}
}
		
   Output:-

Name: Abdul Bazith
Registration Number:2022/ASP/41
Degree Programm: BSc.ComputerScience

 Full Name: Abdul Bazith
Registration Number: 2022/ASP/41
Degree Programm:BSc.ComputerScience

Conclusion:-I have learned about String class

Date:-2022.03.12

Pactical No:-05

Problem Specification:-How to use "\n" escape sequence

Implementation:-

class Details {

public static void main (String[] args) {

	System.out.println("First Name: THOWFEEK \nLast Name: ABDUL BAZITH \nAddress : GM Manzoor Road Nintavur:-13");

}
}
Output:-

First Name: THOWFEEK
Last Name: ABDUL BAZITH
Address : GM Manzoor Road Nintavur:-13

Conclusion:-I have learned how to use nextline escape sequence

Date:-2022.03.12

Pactical No:-06

Problem Specification:-How to use type casting

Implementation:-

class Exercise{
	public static void main(String args[]){

	//find the ascii value of the character
	char c1 ='g';
	System.out.println("The character is :"+c1);
	
	//changing the char into int
	int int1=(int)c1;
	System.out.println("The character is :"+int1);

	//changing the double into int
	double d1=10.03;
	System.out.println("The value is :"+d1);

	int int2=(int)d1;
	System.out.println("The value is :"+int2);
	
	double d2=int1;
	System.out.println("The value is :"+d2);
	//int is 4 byte double is 8 byte => int<double
	
	}
}

Output:-

The character is :g
The character is :103
The value is :10.03
The value is :10
The value is :103.0

Conclusion:-I have learned the syntax of type casting

Date:-2022.03.12

Pactical No:-07

Problem Specification:-Operators

Implementation:-

class Operators{
	public static void main(String [] args)
	{
		//unary oprstors
		int num=10;
		int x=num++;
		int y=++num;
		int z=num--;
		int p=--num;
		
		System.out.println("The Initial value is: "+num);
		System.out.println("The post incement is: "+x);
		System.out.println("The pre incement is: "+y);
		System.out.println("The post decrement is: "+z);
		System.out.println("The pre decrement is: "+p);
		System.out.println();
		
		//logical operators
		boolean a=true;
		boolean b=false;
		
		System.out.println("a&&b: "+(a&&b));
		System.out.println("a||b: "+(a||b));
		System.out.println("!a: "+(!a));
		System.out.println("!b: "+(!b));
		System.out.println();

		//relational operaators
		int r=8;
		System.out.println("r is : "+r);
		int q=4;
		System.out.println("q is : "+q);
		int s=6;
		System.out.println("s is : "+s);


		System.out.println("r>q: "+(r>q));
		System.out.println("r<q: "+(r<q));
		System.out.println("r>=q: "+(r>=q));
		System.out.println("r<=q: "+(r<=q));
		System.out.println("r==s: "+(r==s));
		System.out.println("r!=s: "+(r!=s));
		System.out.println();


		//assignment operators
		int m=8;
		System.out.println("m value is: "+m);
		System.out.println("m+=3: "+(m+=3));
		System.out.println("m-=2: "+(m-=2));
		System.out.println("m*=2: "+(m*=2));
		System.out.println("m/=3: "+(m/=3));
		System.out.println("m%=3: "+(m%=3));
		System.out.println();


		//ternary operators
		int n=20, g=10, h=30, result;
		result =((n>g)?(n>h)?n:h:(g>h)?g:h);
		System.out.println("Max of three nnumbers= "+result);
		System.out.println();
}
}

		

Output:-

The Initial value is: 10
The post incement is: 10
The pre incement is: 12
The post decrement is: 12
The pre decrement is: 10

a&&b: false
a||b: true
!a: false
!b: true

r is : 8
q is : 4
s is : 6
r>q: true
r<q: false
r>=q: true
r<=q: false
r==s: false
r!=s: true

m value is: 8
m+=3: 11
m-=2: 9
m*=2: 18
m/=3: 6
m%=3: 0

Max of three nnumbers= 30

Conclusion:-I have learned how actualy operators work
