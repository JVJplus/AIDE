import java.util.Scanner;
public class QuradaticEquationSolver
	{
		static Scanner in=new Scanner(System.in);
		public static void main(String jvj[])
			{	
				maincopy();
			}

		static void maincopy()   //for replaying game since main method cant be executed
			{
				// 100  8-2 
				
				System.out.println("Enter no.");
				int n=toAccept();
				int[] lcm=new int[lcmCount(n)];
				System.out.println("Enter required");
				int requirement=toAccept();
				lcm=lcm(n);
				combinations(lcm,lcmCount(n),requirement,n);
				Retry();
			}

		static int toAccept()
			{
				int n=in.nextInt();
				if(length(n)>8)
					{
						System.out.println("Plz!!! enter no. less than 9 digits");
						n=toAccept();
					}
				return n;
			}

		static int[] lcm(int n)
			{
				int div=2,c=0,length;
				length=lcmCount(n);
				int[] lcm=new int[length];
				while(n>1)
					{
						if(n%div==0)
							{
								lcm[c]=div;
								n=n/div;
								c++;
							}
						else
							div++;
					}
					return lcm;
			}

		static int lcmCount(int n)
		{

			int div=2,c=0;
			int[] lcm;
			while(n>1)
				{
					if(n%div==0)
						{
							c++;
							n=n/div;
						}
					else
						div++;
				}
			return c;
		}
		
		static int length(int n)
			{
				String l=Integer.toString(n);
				return l.length();
			}
		public static void Retry()	//asking user if he wanted to replay than run program once again
			{
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Do you want to replay, \n Press Y/N");
				char confirm=in.next().charAt(0);
				System.out.println("_________________________________________________");	//ending 1st program
				if(confirm=='Y' ||confirm=='y')
					maincopy();
				else
					System.exit(0);
			}

		/*	static void print(int[] lcm)
			{
				for(int i:lcm)
				System.out.println(i);
			}   */
			
			static void combinations(int[]lcm,int length,int requirement,int n)
			{
				int i,j;
				System.out.println("Possible Combinations are");
				for(i=0;i<length;i++)
				{
					for(j=0;j<=i;j++)
					{
						if((lcm[i]+lcm[j])==requirement)
							System.out.println(lcm[i]+"+"+lcm[j]);
					}
				}
			}
	}
