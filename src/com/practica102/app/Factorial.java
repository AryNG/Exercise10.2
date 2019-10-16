package com.practica102.app;import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
//Variable-------------------------------------------------------------------------------------
		long factorial=1;
		int number=-1;
		
		Scanner input= new Scanner(System.in);
//Process--------------------------------------------------------------------------------------
		do {
			System.out.println("Number to calculate:");
			number=input.nextInt();
			if (number<=0) {
				System.out.println("No negative numbers allowed");
			}
		}while (number<=0);
		factorial = Factorial2(number);
		System.out.println("The Factorial of "+number+" is:"+factorial+"\n(Which is gotten by multiplying several times "+number+".)");
		/*System.out.printLn(String.format("The factorial of %d is: %d, (which is gotten by
multiplying several times %d .)", number, factorial, number));*/
	
//CLOSE----------------------------------------------------------------------------------------
input.close();
	}

//Method Factorial-----------------------------------------------------------------------------
	public static long Factorial2 (int n) 
	{
		int factorial=1;
		for (int i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
		return factorial;
	}
	
}
//NOTES AND SUCH-------------------------------------------------------------------------------
/*Para bajar de línea en el print, es alt+shift+y*/