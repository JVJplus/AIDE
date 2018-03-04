import java.math.*;
public class ExtractInput2
{
	public BigDecimal[] extractInputNumbers(String inputInString)
	{
		//logic: remove all whitespaces from input
		//		 replace signs with spaces and split the string with space for obtaining numbers and store it in array
		
		inputInString=inputInString.replaceAll(" ",""); //replace spaces with null for further processes
		
		int i;
		String inputInString2=replaceSignsWithSpaces(inputInString);
		String numbersInString[]=inputInString2.split(" ");
		double numbersInDouble[]=new double[numbersInString.length];
		
		for (i = 0;i < numbersInString.length;i++)
		{
			try
			{
				numbersInDouble[i] = Double.valueOf(numbersInString[i]);
			}
			catch (NumberFormatException e)
			{
				//solving continuous signs problem eg 5++6
				//e.getMessage Returns Invalid double "" since we have converted all signs to spaces.see line no 13,14 therefore converting space to double cause exception
				if (e.getMessage().equals("Invalid double: \"\""))
				{
					System.out.println("SORRY!!! You Entered Some Invalid Signs/Expressions\nTRY Again!!!\n");
					GraphicsCalculator.main();
				}
				else
				{
					System.out.println("\n"+ "Exception Occurs," + e.getMessage());
					System.out.println("SORRY!!! You Entered Some Invalid Number\nTRY Again!!!\n");
					GraphicsCalculator.main();
				}
			}
		}
		
		BigDecimal[] numbers=new BigDecimal[numbersInDouble.length];
		for(i=0;i<numbersInDouble.length;i++)
		{
			numbers[i]=BigDecimal.valueOf(numbersInDouble[i]);
		}
		
		return numbers;
	}

	String replaceSignsWithSpaces(String s)
	{
		int i;
		String t="",signs="+-/*÷%";
		
		for(i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(signs.contains(""+c))
				t=t+" ";
			else
				t=t+c;
		}
		return t;
	}

	public char[] extractInputSigns(String inputInString)
	{
		//logic: remove everything except signs and break it into char array and return it.
		
		char c,signs[];
		String validSigns="+-*/%",newString="";
		
		for(int i=0;i<inputInString.length();i++)
		{
			c=inputInString.charAt(i);
			if(validSigns.contains(""+c))
				newString+=c;
		}
		
		signs=newString.toCharArray();
		return signs;
	}

}
