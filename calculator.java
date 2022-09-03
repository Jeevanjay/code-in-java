package calculator;
import java.util.Scanner;
 class calculation
{
	double a,b,c;
	public void add() 
	{
		 c=a+b;
		 System.out.println("The sum of two numbers:"+c);
	}
	public void subs()
	{
		c=a-b;
		System.out.println("The substraction of two numbers:"+c);
	}
	public void mul()
	{
		c=a*b;
		System.out.println("The product of two numbers:"+c);
	}
	public void division()
	{
		c=a/b;
		System.out.println("The division of two numbers:"+c);
	}
	public void factorial()
	{
		int num1=(int)a;
		int num2=(int)b;
		int fact=1;
		for(int i=1;i<=num1;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of number a:"+fact);
		for(int j=1;j<=num2;j++)
		{
			fact=fact*j;
		}
		System.out.println("The factorial of number b:"+fact);
	}

	public void remainder()
	{
		c=a%b;
		System.out.println("The remainder of two numbers is"+c);
	}
}
	
public class calculator 
{ 
	public static void main(String[] args) 
	{
	calculation v1=new calculation();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a"+"\nEnter the value of b");
	 v1.a=sc.nextDouble();
	 v1.b=sc.nextDouble();
	System.out.println("Enter the choice");
	System.out.println("1.Addition"+"\n2.Substraction"+"\n3.Multiplication"+"\n4.Division"+"\n5.Factorial"+"\n6.Remainder");
	int check =sc.nextInt();
	switch(check)
	{
	case 1->v1.add();
	case 2->v1.subs();
	case 3->v1.mul();
	case 4->v1.division();
	case 5->v1.factorial();
	case 6->v1.remainder();
	default->
	{
		System.out.println("The input is wrong");
		break;
	}
	}
	sc.close();
	}
}
	
