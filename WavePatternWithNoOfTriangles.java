import java.util.*;
public class WavePatternWithNoOfTriangles
	{
		static Scanner in=new Scanner(System.in);
		public static void main(String jvj[])
			{	
				mainCopy();
			}

		static void mainCopy()
			{
				System.out.println("Enter No of Triangles");
				int noOfTriangles=toAccept();
				System.out.println("Enter height of Triangle"); 
				int height=toAccept();
				int i,s1,s2,k;
				for(k=1;k<=noOfTriangles;k++)
				{
				for(i=1;i<=height;i++)
				{
					for(s1=1;s1<i;s1++)
					System.out.print(" ");
					
					System.out.print("\\");
					
					for(s2=height-i;s2>0;s2--)
					   System.out.print(" ");
					
					for(s2=height-i;s2>0;s2--)
						System.out.print(" ");
						
					System.out.print("/");
					System.out.println();
				}
				System.out.println();
				}
				
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
								System.out.println("Error");
								System.out.println("Enter Again");
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
				if (confirm == 'Y' || confirm == 'y')
					mainCopy();
				else if (confirm == 'N' || confirm == 'n')
					System.exit(0);
				else
					System.out.println("Wrong Choice");
			}
	}
