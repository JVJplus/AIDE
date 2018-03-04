import java.util.*;
import java.sql.*;
public class MakingArrow
	{
		static Scanner in=new Scanner(System.in);
		public static void main(String jvj[])
			{	
				maincopy();
			}

		static void maincopy()
			{
				int length,i=1;
				length=toAcceptDistance();
				System.out.println();
				System.out.println(i+".)\t\t  _ ");
				for(i=2;i<=length-3;i++)
				{
					toDrawArrow(i);
				}
				toDrawEnd(i);

				Retry();
			}

			static int toAcceptDistance()
			{
				int ch=0,i,n=0;
				while(ch==0)
				{
					try
					{
						System.out.println("Enter the Length Of Moving Arrow");
						n=in.nextInt();
						ch=1;
					}
					catch(InputMismatchException e)
					{
						in.nextLine();
						System.out.println("Sorry, "+e+" Occurs");
					}
				}
				return n;
			}
			
			static void toDrawArrow(int i)
			{
				if(i<10)
				System.out.println(i+".) \t\t | | ");
				else if(i>9&&i<100)
				System.out.println(i+".)\t\t | | ");
			}
			
			static void toDrawEnd(int i)
			{
					System.out.println(i+    ".)\t\t_| |_ ");
					System.out.println((i+1)+".)\t\t\\   /");
					System.out.println((i+2)+".)\t\t \\ / ");
					System.out.println((i+3)+".)\t\t  V ");
			}
		static void Retry() 	//asking user if he wanted to replay than run program once again
			{
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Do you want to replay, \n Press Y/N");
				char confirm=in.next().charAt(0);
				System.out.println("______________________________________");	//ending 1st program
				if(confirm=='Y' ||confirm=='y')
					maincopy();
				else
					System.exit(0);
			}



	}
