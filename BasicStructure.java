import java.util.*;
class BasicStructure
{
	static Scanner in=new Scanner(System.in);
	public static void main(String... JVJplus)
	{	
		System.out.print("Enter N=");
		int n=toAccept();

		retry();
	}

	static int toAccept()
	{
		int n=0,ch=1;
		while (ch == 1)
		{
			try
			{
				n = in.nextInt();
				ch = 0;
			}         //try ends
			catch (InputMismatchException e)
			{
				System.out.println("\nError,");
				System.out.println("Enter Again\n");
				in.next(); //dummy scanner
			}  	//catch ends
		}       //loop ends
		return n;
	}

	static void retry() 	//asking user if he wanted to replay than run program once again
	{ 
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Do you want to replay, \n Press Y/N");
		char confirm=in.next().charAt(0);
		System.out.println("______________________________________");	//ending 1st program
		if (confirm == 'N' || confirm == 'n')
		{
			System.out.println("Thank You For Using");
			System.out.println("A Program By:- _| \\/ _| -|->");
			in.nextLine();	  // Dummy Scanner
			in.nextLine();   // Waits Till User Enters Something,ie User Can See my Msg
			System.exit(0);
		}
		else
			main();

	}
}
