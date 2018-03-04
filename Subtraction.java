import java.text.*;
public class Subtraction
{
	//public static void main(String args[])
	{}

	public double performTask(double n1,double n2)
	{
		Subtraction ObjectOfSubtraction=new Subtraction();
		ObjectOfSubtraction.draw(n1,n2);

		return n1-n2;
	}

	public void draw(double n1,double n2)
	{
		String n1InString=""+n1,n2InString=""+n2;
		int 
			i,j,
			lengthBeforeDecimalInN1=n1InString.substring(0,n1InString.indexOf('.')).length(),
			lengthBeforeDecimalInN2=n2InString.substring(0,n2InString.indexOf('.')).length(),
			lengthAfterDecimalInN1=n1InString.substring(n1InString.indexOf('.')+1).length(),
			lengthAfterDecimalInN2=n2InString.substring(n2InString.indexOf('.')+1).length(),
			maxLengthBeforeDecimal=Math.max(lengthBeforeDecimalInN1,lengthBeforeDecimalInN2),
			maxLengthAfterDecimal=Math.max(lengthAfterDecimalInN1,lengthAfterDecimalInN2),
			positionOfDecimalInN1=n1InString.indexOf('.'),
			positionOfDecimalInN2=n2InString.indexOf('.'),
			differenceInDecimal=Math.abs(positionOfDecimalInN1-positionOfDecimalInN2),
			maxLength=Math.max(n1InString.length(),n2InString.length());

		// 1st Line
		System.out.println();
		System.out.print("  ");
		if(positionOfDecimalInN1<positionOfDecimalInN2)
		{
			for(i=0;i<differenceInDecimal;i++)
			{
				System.out.print(" ");
			}
		}
		System.out.println(n1);

		// 2nd Line
		System.out.print("- ");
		if(positionOfDecimalInN1>positionOfDecimalInN2)
		{
			for(i=0;i<differenceInDecimal;i++)
			{
				System.out.print(" ");
			}
		}
		System.out.println(n2);

		// 3rd Line
		System.out.print(" ~");
		for(i=0;i<=maxLengthBeforeDecimal+maxLengthAfterDecimal;i++)
			System.out.print("~");
		System.out.println();

		// 4th Line
		double diff=n1-n2;
		String diffInString=""+diff;
		int 
			lengthBeforeDecimal=diffInString.substring(0,diffInString.indexOf('.')).length(),
			differenceBeforeDecimal=lengthBeforeDecimal-maxLengthBeforeDecimal;

		if(differenceBeforeDecimal==0)
			System.out.print("  ");
		else
			System.out.print(" ");

		DecimalFormat df=new DecimalFormat();
		df.applyPattern("#.#");  //to overcome currency comma format
		df.setMaximumIntegerDigits(maxLengthBeforeDecimal+1);
		df.setMaximumFractionDigits(maxLengthAfterDecimal);
		System.out.print(df.format(diff));

		if(!df.format(diff).contains("."))
			System.out.print(".0");

		System.out.println();

		// 5th Line
		System.out.print(" ~");
		for(i=0;i<=maxLengthBeforeDecimal+maxLengthAfterDecimal;i++)
			System.out.print("~");
		System.out.println();
	}
}
