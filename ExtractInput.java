//0+0
// delete unused if else
public class ExtractInput
{
	public double[] extractInputNumbers(String inputInString)
	{
		double 
			numbersTEMP[]=new double[inputInString.length()];

		int 
			i,constant=0,
			noOfDecimals;  //for solving 5...8+7.9 problem

		char
			c,
			currentSymbol='+',
			signsTEMP[]=new char[inputInString.length()];

		boolean
			flagSymbolFound=false;

		String
			charAcceptable=" 0123456789.-+%*/()÷#",
			symbols="+-*/%÷",
			tempNumber="";

		inputInString+="#"; //Identify end

		if(!isInputContainsSign(inputInString))  //if user dont enter sign eg. 5
		{
			System.out.println("Invalid Input, Please Enter Atleast 1 sign, Try Again");
			String tempToCallMain[]={};
			GraphicsCalculator ObjectOfGC=new GraphicsCalculator();
			ObjectOfGC.main(tempToCallMain);
		}
		
		for(i=0;i<inputInString.length();i++)
		{
			c=inputInString.charAt(i);
			
			noOfDecimals=countFrequency(tempNumber,'.');
			
			if(!charAcceptable.contains(""+c) || noOfDecimals>1)
			{
				System.out.println("Invalid Input, Enter Again");
				String tempToCallMain[]={};
				GraphicsCalculator ObjectOfGC=new GraphicsCalculator();
				ObjectOfGC.main(tempToCallMain);
			}

			if(c=='#')//marks end
			{
				flagSymbolFound=true;
			}
			else if(!symbols.contains(c+""))
			{
				if(Character.isDigit(c)||c=='.')
				tempNumber+=c;
			}
			else //if(symbols.contains(c+""))
			{
				if(tempNumber!="")  // solving 6+-++8 problem
				{
				currentSymbol=c;
				flagSymbolFound=true;
				}
			}


			if(flagSymbolFound)
			{
				if(tempNumber=="" || tempNumber=="0"||tempNumber=="0.0")  //solving 5+ , ,spaces problem
				{
					System.out.println("Invalid Input, Enter Again");
					String tempToCallMain[]={};
					GraphicsCalculator ObjectOfGC=new GraphicsCalculator();
					ObjectOfGC.main(tempToCallMain);
				}
				else
				{
					//solving number exception during parsing string to number
					try
					{
						numbersTEMP[constant] = Double.parseDouble(tempNumber);
					}
					catch (NumberFormatException e)
					{

						System.out.println("Invalid Input @ try-catch, Enter Again");
						String tempToCallMain[]={};
						GraphicsCalculator ObjectOfGC=new GraphicsCalculator();
						ObjectOfGC.main(tempToCallMain);
					}

					
				signsTEMP[constant]=currentSymbol;
				constant++;
				tempNumber="";
				flagSymbolFound=false;
				}
			}

		}
		
		double numbers[]=trimDoubleArray(numbersTEMP);
		char signs[]=trimCharArray(signsTEMP,numbers.length);
		
		return numbers;
	}
	
	public char[] extractInputChar(String inputInString)
	{
		double 
			numbersTEMP[]=new double[inputInString.length()];

		int 
			i,constant=0;

		char
			c,
			currentSymbol='+',
			signsTEMP[]=new char[inputInString.length()];

		boolean
			flagSymbolFound=false;

		String
			charAcceptable=" 0123456789.-+%*/()÷#",
			symbols="+-*/%÷",
			tempNumber="";

		inputInString+="#"; //Identify end

		for(i=0;i<inputInString.length();i++)
		{

			c=inputInString.charAt(i);

			if(!charAcceptable.contains(""+c))
			{
				System.out.println("Invalid Input, Enter Again");
				String tempToCallMain[]={};
				GraphicsCalculator ObjectOfGC=new GraphicsCalculator();
				ObjectOfGC.main(tempToCallMain);
			}


			if(c=='#')//marks end
			{
				flagSymbolFound=true;
			}
			else if(!symbols.contains(c+""))
			{
				if(Character.isDigit(c)||c=='.')
					tempNumber+=c;
			}
			else //if(symbols.contains(c+""))
			{
				if(tempNumber!="")  // solving 6+-++8 problem
				{
					currentSymbol=c;
					flagSymbolFound=true;
				}
			}


			if(flagSymbolFound)
			{
				numbersTEMP[constant]=Double.parseDouble(tempNumber);
				signsTEMP[constant]=currentSymbol;
				constant++;
				tempNumber="";
				flagSymbolFound=false;
			}

		}

		double numbers[]=trimDoubleArray(numbersTEMP);
		char signs[]=trimCharArray(signsTEMP,numbers.length);

		if(signs.length<1)  //If user Enters Only 1 No. Only
		{
			String[] tempForCallingMainFunction={};
			System.out.println("Plz. Enter Atleast 2 No.s");
			GraphicsCalculator.main(tempForCallingMainFunction);
		}
		
		return signs;
	}
	
	public char[] trimCharArray(char array[],int length)
	{
		char newArray[]=new char[length-1];
		for(int i=0;i<newArray.length;i++)  //signs are 1 less than the total numbers
		{
			newArray[i]=array[i];
		}
		return newArray;
	}
	
	public double[] trimDoubleArray(double array[])
	{
		int
		i,j,count=0;
		
		double
		sum=0;
		
		for(i=0;i<array.length;i++)
		{
			for(j=i;j<array.length;j++)
			{
				sum+=array[j];
			}
			if(sum!=0&&i!=array.length-1)
				count++;
			sum=0;
		}
		
		double newArray[]=new double[count];
		
		for(i=0;i<array.length;i++)
		{
			for(j=i;j<array.length;j++)
			{
				sum+=array[j];
			}
			if(sum!=0&&i!=array.length-1)
				newArray[i]=array[i];
			sum=0;
		}
		return newArray;
	}
	
	int countFrequency(String s,char find)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==find)
				count++;
		}
		return count;
	}
	
	boolean isInputContainsSign(String s)
	{
		int i;
		for(i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
	
			if((c=='+')||(c=='-')||(c=='*')||(c=='/')||(c=='÷')||(c=='%'))
				return true;
		}
		return false;
	}
}
