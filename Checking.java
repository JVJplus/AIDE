import java.util.*;
import java.math.*;
class Checking
{
	static Scanner in=new Scanner(System.in);
	public static void main(String... JVJplus)
	{
		
	}

	static int[] toAcceptArray(int n)
	{
		int array[]=new int[n];

		for(int i=0;i<n;i++)
		{
			array[i]=toAcceptInteger();
		}
		return array;
	}

	static void toDisplayArray(int n[])
	{
		int i;
		for(i=0;i<n.length-1;i++)
		{
			System.out.print(n[i]+" , ");
		}
		System.out.println(n[i]);
	}


	public static void print2dArray(int [][]n)
	{
		int i,j;
		for(i=0;i<n.length;i++)
		{
			for(j=0;j<n[i].length;j++)
			{
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}

	static int toAcceptInteger()
	{
		int n=0,ch=1;
		while(ch==1)
		{
			try
			{
				n=in.nextInt();
				ch=0;
			}         //try ends
			catch(InputMismatchException e)
			{
				System.out.println("\nError,");
				System.out.println("Enter Again\n");
				in.next(); //dummy scanner
			}  	//catch ends
		}       //loop ends
		return n;
	}


	static double toAcceptDouble()
	{
		double n=0,ch=1;
		while(ch==1)
		{
			try
			{
				n=in.nextDouble();
				ch=0;
			}         //try ends
			catch(InputMismatchException e)
			{
				System.out.println("Error,");
				System.out.println("Enter Again:");
				in.next(); //dummy scanner
			}  	//catch ends
		}       //loop ends
		return n;
	}

	static long reverseNo(long n)
	{

		//System.out.print("Enter int N=");
		long d,rev=0;
		while(n>0)
		{
			d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		return rev;
	}




	static void retry() 	//asking user if he wanted to replay than run program once again
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Do you want to replay, \n Press Y/N");
		char confirm=in.next().charAt(0);
		System.out.println("______________________________________");	//ending 1st program
		if(confirm=='N'||confirm=='n')
		{
			System.out.println("Thank You For Using");
			System.out.println("A Program By:- _| \\/ _| -|->");
			in.nextLine();	  // Dummy Scanner
			in.nextLine();   // Waits Till User Enters Something,ie User Can See my Msg
			System.exit(0);
		}
		else
		{
			in.nextLine();
			main();
		}
	}
}

