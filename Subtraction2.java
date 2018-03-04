import java.math.*;
public class Subtraction2
{
	public BigDecimal returnValueAndPrint(BigDecimal n1,BigDecimal n2)
	{
		Subtraction2 ObjectOfSubtraction=new Subtraction2();
		ObjectOfSubtraction.draw(n1,n2);

		return n1.subtract(n2);
	}

	public void draw(BigDecimal n1,BigDecimal n2)
	{
		int i;
		BigDecimal diff=n1.subtract((n2));

		//1st Line
		System.out.print("  ");
		for(i=1;i<=Addition2.diffBeforeDecimal(diff,n1);i++)
			System.out.print(" ");
		System.out.println(n1);

		//2nd Line
		System.out.print("- ");
		for(i=1;i<=Addition2.diffBeforeDecimal(diff,n2);i++)
			System.out.print(" ");
		System.out.println(n2);

		//3rd line ---
		System.out.print("  ");
		for(i=1;i<=diff.toString().length();i++)
			System.out.print("-");
		System.out.println();

		//4th line diff
		System.out.print("  ");
		System.out.print(diff);
		System.out.println();

		//5th line ---
		System.out.print("  ");
		for(i=1;i<=diff.toString().length();i++)
			System.out.print("-");
		System.out.println();
		
		//6th line for next iteration
		System.out.println();
	}
}
