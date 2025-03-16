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

		