import java.math.*;
public class Addition2
{
	public BigDecimal returnValueAndPrint(BigDecimal n1,BigDecimal n2)
	{
		Addition2 ObjectOfAddition=new Addition2();
		ObjectOfAddition.draw(n1,n2);

		return n1.add(n2);
	}

	public void draw(BigDecimal n1,BigDecimal n2)
	{
		int i;
		BigDecimal sum=n1.add((n2));
		
		//1st Line
		System.out.print("  ");
		for(i=1;i<=diffBeforeDecimal(sum,n1);i++)
		System.out.print(" ");
		System.out.println(n1);
		
		//2nd Line
		System.out.print("+ ");
		for(i=1;i<=diffBeforeDecimal(sum,n2);i++)
			System.out.print(" ");
		System.out.println(n2);
		
		//3rd line -----
		System.out.print("  ");
		for(i=1;i<=sum.toString().length();i++)
		System.out.print("-");
		System.out.println();
		
		//4th line sum
		System.out.print("  ");
		System.out.print(sum);
		System.out.println();
		
		//5th line ---
		System.out.print("  ");
		for(i=1;i<=sum.toString().length();i++)
			System.out.print("-");
		System.out.println();
		
		//for next iteration
		System.out.println();
	}
	
	static int diffBeforeDecimal(BigDecimal n1,BigDecimal n2)
	{
		//86788.8833
		//   78.8
		//----------
		//78877.7898
		//diff=3
		
		String s1=n1.toString(),s2=n2.toString();
		String beforeDecimal1=s1.substring(0, s1.indexOf('.'));
		String beforeDecimal2=s2.substring(0, s2.indexOf('.'));
		int diff = Math.abs(beforeDecimal1.length() - beforeDecimal2.length());
		
		return diff;
	}
}
