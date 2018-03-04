// make 4 double type

import java.math.*;
public class Multiply2
{
	public BigDecimal returnValueAndPrint(BigDecimal n1,BigDecimal n2)
	{
		//checking if it is integer or double.if .0 then int else double
		String temp=(n1.add(n2)).toString();
		if(!  (temp.substring(temp.indexOf('.')).equals(".0"))   )
		{
			System.out.println("Sorry,program doesn't make sketch/graphics for double value for multiplication and division");
			System.out.println("We are Working hard for it.Till then continue with int values...");
			System.out.println("\nHowever,");//to print grand total with apology
			
		}
		else
		{
			Multiply2 ObjectOfMultiply=new Multiply2();
			ObjectOfMultiply.draw(n1.toBigInteger(),n2.toBigInteger());
		}
		
		return n1.multiply(n2);
	}

	public void draw(BigInteger n1,BigInteger n2)
	{
		int i;
		BigInteger mul=n1.multiply(n2);
		
		//1st line
		System.out.print("  ");
		for(i=1;i<=mul.toString().length()-n1.toString().length();i++)
			System.out.print(" ");
		System.out.println(n1);
		
		//2nd line
		System.out.print("X ");
		for(i=1;i<=mul.toString().length()-n2.toString().length();i++)
			System.out.print(" ");
		System.out.println(n2);
		
		//3rd line ---
		System.out.print("  ");
		for(i=1;i<=mul.toString().length();i++)
			System.out.print("-");
		System.out.println();
		
		//4th onward
		int noOfX=0;
		BigInteger constant=new BigInteger("10");//for extracting digits
		while(n2.intValue()>0)   
		{
			System.out.print("  ");//starting space
			
			BigInteger digitMul=n1.multiply(n2.remainder(constant));   //extracting last digit and product
			
			//starting spacing
			for(i=1;i<=mul.toString().length()-digitMul.toString().length()-noOfX;i++)
				System.out.print(" ");
				
			//printing digits product 
			System.out.print(digitMul);
			
			//printing x at ends
			for(i=1;i<=noOfX;i++)
				System.out.print("x");
				
			System.out.println();//changing line
		           	
			n2=n2.divide(constant);
			noOfX++;
		}
		
		
		//2nd last---
		System.out.print("  ");
		for(i=1;i<=mul.toString().length();i++)
			System.out.print("-");
		System.out.println();
		
		//printing product
		System.out.print("  ");
		System.out.println(mul);
		
		//last---
		System.out.print("  ");
		for(i=1;i<=mul.toString().length();i++)
			System.out.print("-");
		System.out.println();
		
	}
}
