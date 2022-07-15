//Write a function for arithmetic operators(+,-,*,/)//

import java.util.*;
class Func
{
	void fun1()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number:");

			int a=sc.nextInt();
			int b=sc.nextInt();
			int aa=a+b;
			int bb=a-b;
			int cc=a*b;
			int dd=a/b;
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);

			
		}
		public static void main(String r[])
			{
				Func r1=new Func();
					r1.fun1();
			}
}

