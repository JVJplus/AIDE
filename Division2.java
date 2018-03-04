// make 4 double type
// convert double to int properly to double with precision length

import java.math.*;
public class Division2
{
	public BigDecimal returnValueAndPrint(BigDecimal n1,BigDecimal n2)
	{
		//checking if it is integer or double.if .0 then int else double
		String temp=(n1.add(n2)).toString();
		if(! (temp.substring(temp.indexOf('.')).equals(".0")))
		{
			System.out.println("Sorry,program doesn't make sketch/graphics for double value for multiplication and division");
			System.out.println("We are Working hard for it.Till then continue with int values...");
			System.out.println("\nHowever,");//to print grand total with apology

		}
		else
		{
			Division2 ObjectOfDivision=new Division2();
			ObjectOfDivision.draw(n1.toBigInteger(),n2.toBigInteger());
		}

		BigDecimal div;
		try
		{
			div=n1.divide(n2);
			return div;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Non-Terminating  Decimal Occurs,We have converted it in int");
			div=n1.divide(n2,0,5);  //n2,scale or no of precision,value from where to round off 
			return div;
		}
	}

	public void draw(BigInteger n1,BigInteger n2)
	{
		int i;
		BigInteger div=n1.divide(n2);

		//1st line
		System.out.print("  ");
		//spacing till divisor
		for(i=1;i<=n2.toString().length();i++)
			System.out.print(" ");

		//space for ) sign
		System.out.print(" ");

		for(i=1;i<=n1.toString().length();i++)
			System.out.print("_");

		System.out.println();

		//2nd line
		System.out.print("  ");
		System.out.print(n2);
		System.out.print(")");
		System.out.print(n1);
		System.out.print("(");
		System.out.println(div);

		//3rd onwards
		/*
		  _______
		 5)86540(17308
		   5
		   ~~
		   36
		   35
		   ~~
		   15
		   15
		   ~~
		    040
		     40
		    ~~~~
		     00
		    ~~~~
		 */
		 
		int currentSpace=2+(n2.toString()).length()+1;
		int productStart=0,substringStart=0;
		String quotient=div+"";
		int currentProduct=1,diff=0,lastDiff=0;
		String upperDigits="";

		while(productStart<quotient.length())
		{
			currentProduct=n2.intValue()*Integer.parseInt(quotient.charAt(productStart++)+"");
			
			if((lastDiff+"").length()<(currentProduct+"").length())
				upperDigits=(n1.toString()).substring(substringStart,substringStart+((currentProduct+"").length()-(lastDiff+"").length()));
			else
			{
				try
				{
					upperDigits=(n1.toString()).substring(substringStart,substringStart+(currentProduct+"").length());
				}
				catch(StringIndexOutOfBoundsException e)
				{
					//upperDigits=(n1.toString()).substring(substringStart,substringStart+(currentProduct+"").length());
				}
			}
			
			diff=(lastDiff*(int)(Math.pow(10,upperDigits.length()))+Integer.parseInt(upperDigits));
			lastDiff=diff;
			
			for(i=1;i<=currentSpace;i++)
				System.out.print(" ");
			System.out.println(currentProduct);
			
			for(i=1;i<=currentSpace;i++)
				System.out.print(" ");
			for(i=1;i<=(currentProduct+"").length();i++)
				System.out.print("-");
			System.out.println();
			
			substringStart+=(currentProduct+"").length();
			if((lastDiff+"").length()<(currentProduct+"").length())
				upperDigits=(n1.toString()).substring(substringStart,substringStart+((currentProduct+"").length()-(lastDiff+"").length()));
			else
			{
				try
				{
					upperDigits=(n1.toString()).substring(substringStart,substringStart+(currentProduct+"").length());
				}
				catch(StringIndexOutOfBoundsException e)
				{
					//upperDigits=(n1.toString()).substring(substringStart,substringStart+(currentProduct+"").length());
				}
			}
			for(i=1;i<=currentSpace;i++)
				System.out.print(" ");
			System.out.print(diff);
			System.out.println(upperDigits);
			
			currentSpace+=(currentProduct+"").length();
		}
		
		//last line
		for(i=1;i<=currentSpace;i++)
			System.out.print(" ");
		for(i=1;i<=(currentProduct+"").length();i++)
			System.out.print("-");
		System.out.println();

	}
}
