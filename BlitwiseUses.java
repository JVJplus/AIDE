import java.util.*;
public class BlitwiseUses
{
	static Scanner in=new Scanner(System.in);
	public static void main(String jvj[])
	{
		System.out.print("Enter Decimal=");
		long decimal=Checking.toAcceptInteger();
		decimalToBinary(decimal);
		decimalToOctal(decimal);
		decimalToHex(decimal);
		
		System.out.print("Enter Binary=");
		long binary=Checking.toAcceptInteger();
		System.out.println("Decimal="+ Long.parseLong(binary+"",2));
		retry();
		
		
	}

	static void decimalToBinary(long n)
	{
		System.out.println("Binary=" + Long.toBinaryString(n));
	}

	static void binaryToDecimal(long n)
	{
		System.out.println("Decimal=" + toDecimal(n));
	}

	static void decimalToOctal(long n)
	{
		System.out.println("Octal=" + Long.toOctalString(n));
	}

	static void decimalToHex(long n)
	{
		System.out.println("Hex=" + Long.toHexString(n));
	}


	static void allOperators(int n1, int n2)
	{

		System.out.println("N1|N2=" + (n1 | n2));
		System.out.println("N1&N2=" + (n1 & n2));
		System.out.println("N1^N2=" + (n1 ^ n2));

		System.out.println("n1<<1=" + (n1 << 1));
		System.out.println("n1<<3=" + (n1 << 3));
		System.out.println("n1<<4=" + (n1 << 4));

		System.out.println("n1>>1=" + (n1 >> 1));
		System.out.println("n1>>3=" + (n1 >> 3));
		System.out.println("n1>>4=" + (n1 >> 4));

		System.out.println("n1>>>1=" + (n1 >>> 1));
		System.out.println("n1>>>3=" + (n1 >>> 3));
		System.out.println("n1>>>4=" + (n1 >>> 4));

		System.out.println("n1<<=1=" + (n1 <<= 1));
		System.out.println("n1<<=3=" + (n1 <<= 3));
		System.out.println("n1<<=4=" + (n1 <<= 4));

		System.out.println("n1>>=1=" + (n1 >>= 1));
		System.out.println("n1>>=3=" + (n1 >>= 3));
		System.out.println("n1>>=4=" + (n1 >>= 4));

	}

	static long toDecimal(long l)
	{
		long i=0,s=0,c=0;
		while (l > 0)
		{
			long d=l % 10;
			s = s + d * (long)(Math.pow(2, c++));
			l /= 10;
		}
		return s;
	}

	static void hexToBinary(long l)
	{
		String digits = "0123456789ABCDEF";
		String s =Long.toString(l).toUpperCase();
		int val = 0;
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			int d = digits.indexOf(c);
			val = 16 * val + d;
		}
		System.out.println(val);
	}
	static void retry() 	//asking user if he wanted to replay than run program once again
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Do you want to replay, \n Press Y/N");
		char confirm=in.next().charAt(0);
		System.out.println("______________________________________");	//ending 1st program
		String a[]={};
		if (confirm == 'N' || confirm == 'n')
			System.exit(0);
		else
			main(a);
	}
}
