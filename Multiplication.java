import java.text.*;
public class Multiplication
{
	public double performTask(double n1,double n2)
	{
		Multiplication Obj=new Multiplication();
		Obj.draw(n1,n2);
		
		return n1*n2;
	}
		
	public void draw(double n1,double n2)
	{
	
	//Format Multiplication Decimals
		double mul=n1*n2;
		String n1InString=""+n1,n2InString=""+n2;
		int maxAfterDecimal=Math.max
				       (n1InString.substring(n1InString.indexOf('.')).length(),
					    n2InString.substring(n2InString.indexOf('.')).length());
		
		DecimalFormat df=new DecimalFormat();
		df.applyPattern("#.#");
		df.setMaximumFractionDigits(maxAfterDecimal);
		String mulDecimalFormatted=df.format(mul);

	// end Formatting Decimals
		
		int i,
		n1New=removeDecimal(""+n1),
		n2New=removeDecimal(""+n2),
		mulNew=removeDecimal(""+(mulDecimalFormatted));
		
		
	//1st Line
		System.out.print("  ");
		for(i=1;i<=(mulNew+"").length()-(n1New+"").length();i++)
			System.out.print(" ");
		System.out.println(n1New+"   ("+n1+")");
		
	//2nd Line
		System.out.print("X ");
		
		for(i=1;i<=(mulNew+"").length()-(n2New+"").length();i++)
			System.out.print(" ");
		System.out.println(n2New+"   ("+n2+")");
	
	//3rd Line
		System.out.print("  ");
		for(i=1;i<=(mulNew+"").length();i++)
			System.out.print("~");
		System.out.println();
	
		/*1234567890123456789
		     1234  (123.4)
		 X    123  (12.3)
		   ~~~~~~
		     3702  (123.4)//check how 2 do decimal mulpcation
		    2468x  (595.5)
		   1234xx  (6959.8)
		   ~~~~~~
		   151782  (1517.82)
		   ~~~~~~
	    */
	//Printing Multiplications
		int 
		noOfxToPrint=0,noOfSpaces,tempMul,tobeMulWith,extractLastDigit=(n2New+"").length()-1,
		noOfLines=(n2New+"").length();
	
		while(noOfLines>0)
		{
			System.out.print("  ");//for mainting starting X spacing 

			
			tobeMulWith=Integer.parseInt((n2New+"").charAt(extractLastDigit--)+"");
			tempMul=n1New*tobeMulWith;
			noOfSpaces=((mulNew+"").length())-(tempMul+"").length()-noOfxToPrint;
			
			for(i=1;i<=noOfSpaces;i++)
				System.out.print(" ");
				
			System.out.print(tempMul);
			
			for(i=1;i<=noOfxToPrint;i++)
				System.out.print("x");
				
			System.out.println();
			noOfxToPrint++;
			noOfLines--;
		}
		
	//5++th line
		System.out.print("  ");
		for(i=1;i<=(mulNew+"").length();i++)
			System.out.print("~");
		System.out.println();
	
	//Sum Line
		System.out.print("  ");
		System.out.println(mulNew);
		
	//End Line
		System.out.print("  ");
		for(i=1;i<=(mulNew+"").length();i++)
			System.out.print("~");
		System.out.println();
	}
	
	public int removeDecimal(String s)
	{
		int i,j;
		double sum=0.0;
		String newS="";

		//Remove Zeros After Decimal
		for(i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			for(j=i;j<s.length();j++)
			{
				//For Decimal to Integer Exception
				try
				{
					sum = sum + Integer.parseInt(s.charAt(j) + "");
				}
				catch (Exception e)
				{
					continue;
				}
			}
			if(sum>0.0&&c!='.')
			{
				newS+=c;
			}
			sum=0.0;
		}
		
		return (Integer.parseInt(newS));
	}
	
}
