import java.util.*;
public class LCMdisplayer
{
	static Scanner in=new Scanner(System.in);
	public static void main(String jvj[])
	{	
		maincopy();
	}

	static void maincopy()   //for replaying game since main method cant be executed
	{
		int n=toAccept();
		System.out.println();
		lcm(n);
		Retry();
	}

	static int toAccept()
	{
		System.out.println("Enter No. To Print LCM");
		int n=0;
		try
		{
			n = in.nextInt();
		}
		catch (Exception e)
		{
			in.next();
			System.out.println("error");
			maincopy();
		}

		return n;
	}

	static void lcm(int n)
	{
		int div=2,length;
		if (n > 0)
		{
			while (n > 1)
			{
				if (n % div == 0)
				{
					{
						length = length(div);
						if (length == 9)
							System.out.println("" + div + " ; " + n);
						else if (length == 8)
							System.out.println(" " + div + " ; " + n);
						else if (length == 7)
							System.out.println("  " + div + " ; " + n);
						else if (length == 6)
							System.out.println("   " + div + " ; " + n);
						else if (length == 5)
							System.out.println("    " + div + " ; " + n);
						else if (length == 4)
							System.out.println("     " + div + " ; " + n);
						else if (length == 3)
							System.out.println("      " + div + " ; " + n);
						else if (length == 2)
							System.out.println("       " + div + " ; " + n);
						else if (length == 1)
							System.out.println("        " + div + " ; " + n);
						else
							System.out.println("         " + div + " ; " + n);
					}
					n = n / div;

					System.out.println("'''''''''';''''''''''''");
					//	System.out.println("__________|_____________");
				}
				else
					div++;
			}
			System.out.println("          ; 1");
		}
	}

	static int length(int n)
	{
		String l=Integer.toString(n);
		return l.length();
	}

	public static void Retry()	//asking user if he wanted to replay than run program once again
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Do you want to replay, \nPress Y/N");
		char confirm=in.next().charAt(0);
		System.out.println("_________________________________________________");	//ending 1st program
		if (confirm == 'N' || confirm == 'n')
			System.exit(0);
		else
			maincopy();
	}

}