//Negative no. 
//Brace
//Use ArrayList 
//Remove E problem
//add redo with modification options(add,remove,change sign etc)with arrayList

import java.util.*;
import java.math.*;
public class GraphicsCalculator
{
	Scanner in=new Scanner(System.in);
	public static void main(String... args)
	{
	
		GraphicsCalculator ObjectOfGC=new GraphicsCalculator();
		ExtractInput2 ObjectOfExtractInput=new ExtractInput2();
		System.out.print("Enter Calculation\nEg.: 98 + 355.82 - 47 * 2 / 58 % 5 ÷ 585... \n=>");
		String inputsInString="";
		
		//Till user Enter Something, to solve:it may possible enter key is entered mistakely
		while(inputsInString.equals(""))
		{
			inputsInString=ObjectOfGC.in.nextLine();
		}
		
		BigDecimal grandTotal,numbers[];
		numbers=ObjectOfExtractInput.extractInputNumbers(inputsInString);
		char signs[]=ObjectOfExtractInput.extractInputSigns(inputsInString);
		
		//displayDetails(numbers,signs);  //add comemment
		
		// check if total no of numbers and signs are correct or not
		if(numbers.length<=signs.length)
		{
			System.out.println("Some Mistakes in Total no of Numbers/Signs,\nTRY Again!!!\n");
			ObjectOfGC.main();
		}
		
		System.out.println("\n\t\tOutput:\n");
		
		grandTotal=ObjectOfGC.sendingToDestination(numbers,signs);
		System.out.println("Grand Total="+grandTotal);
		
		ObjectOfGC.redo();
	}
	
	public BigDecimal sendingToDestination(BigDecimal[] numbers,char[] signs)
	{
		int i;
		BigDecimal total=numbers[0];
		
		char currentSign;
		for(i=0;i<signs.length;i++)
		{
			currentSign=signs[i];
			if(currentSign=='+')
			{
				Addition2 ObjectOfAddition=new Addition2();
				total=ObjectOfAddition.returnValueAndPrint(total,numbers[i+1]);
			}
			else if(currentSign=='-')
			{
				Subtraction2 ObjectOfSub=new Subtraction2();
				total=ObjectOfSub.returnValueAndPrint(total,numbers[i+1]);
			}
			else if(currentSign=='*')
			{
				Multiply2 ObjectOfMultiply=new Multiply2();
				total=ObjectOfMultiply.returnValueAndPrint(total,numbers[i+1]);
			}
			
			else if(currentSign=='/'||currentSign=='÷')
			{
				Division2 ObjectOfDivisin=new Division2();
				total=ObjectOfDivisin.returnValueAndPrint(total,numbers[i+1]);
			}
			else
				System.out.println("Error in Signs");
				
		}
		return total;
	}
	
	public static void displayDetails(BigDecimal[] numbers,char[] signs)
	{
		System.out.println("\nDetails...");
		System.out.println("No.s Are");
		for(BigDecimal i:numbers)
		{
			System.out.println(i.toPlainString());
		}
		System.out.println("Signs are");
		for(char i:signs)
		{
			System.out.println(i);
		}

		System.out.println("Numbers="+numbers.length);
		System.out.println("Signs="+signs.length);
		System.out.println();
	}
	
	
	public void redo()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Do you want to REDO, \n Press Y/N");
		char confirm=in.next().charAt(0);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	//ending 1st program
		
		if (confirm == 'N' || confirm == 'n')
		{
		
			System.out.println("\t\t     Thank You For Using");
			System.out.println("\t    A Program By:- _| \\/ _| -|->");
			
			System.out.println(" --------------------------------------");
			System.out.println("¦      Phone: 8252678376,9835582472    ¦");
			System.out.println("¦       E-Mail: jvjplus@gmail.com      ¦");
			System.out.println("¦ Facebook: www.facebook.com/jvj.co.in ¦");
			System.out.println(" --------------------------------------");
			
			in.nextLine();    //Dummy Scanner
			in.next();   // Waits Till User Enters Something,ie User Can See my Msg
			System.exit(0);
		}
		else
			main();
	}
}
