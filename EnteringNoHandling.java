import java.util.*;
public class EnteringNoHandling
	{
		static Scanner in=new Scanner(System.in);
		public static void main(String JVJ[])
			{
				int n=toAccept();
				System.out.println("You Entered="+n);
			}

	static int toAccept()
	{
	int n=0,ch=1;
	while (ch == 1)
	  {
	    try
	     {
			System.out.println("Enter N");
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
			
}
