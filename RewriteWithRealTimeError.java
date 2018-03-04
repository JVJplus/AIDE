import java.util.*;
public class RewriteWithRealTimeError
	{
		static int i,j;
		static Scanner in=new Scanner(System.in);
		
		public static void main(String args[])
			{
				mainCopy();
			}
			
			static void mainCopy()  //for replaying game since main method cant be executed
			{
					System.out.println("Enter No. Of Character To Type");   //asking no. of chars to write
					int n=toAccept();
					String original=randomChars(n);    
					System.out.println();
					checking(original);
					
					retry();
			}
			
			
			static String randomChars(int n)     //for displaying chars and to return the String copy
				{
					String word="";
					int r,X=65,Y=90,x=97,y=122,i=n,j=1;   //X for capital a char value and x for small a char value
					System.out.print("---");  //for indicating starting of word
					for(j=1;j<=n;j++) //for printing chars till n(user) choice
					{
						if(i%2==0)      //creating 2 different random char producing type capital and small. for increasing complexcity in random
						{
					r=x+(int)(Math.random()*(y-x+1));    //creating random char value of small letters
					i=r;    	//changing i value to r for the if statement
					if(r%7==0)
					r=32;      //adding spaces between characters if random no is divided by 7
					word=word+(char)r;   //keeping char copy for checking latter on in string form
					System.out.print((char)r);
						}
					else
						{
						r=X+(int)(Math.random()*(Y-X+1));
						i=r;
						if(r%7==0)
							r=32;      // adding spaces
						word=word+(char)r;
						System.out.print((char)r);
						}
					}
					System.out.println("---");    //for indicating end of word
					
					return word;      //returning the string word
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
			
			static void checking(String original)
			{
				int i,j=0;
				String userWritten;
				System.out.println("Your Chance, Enter now");
				for(i=0;j<original.length();i++)
				{
					char c=in.next().charAt(0);
					if(c==original.charAt(j))
					{
						j++;
						
						if(j!=original.length())
						System.out.println("Good Enter Next");
						else
						System.out.println("Good \n");
					}
					else
						System.out.println("Mistake");
				}
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
					{
						System.out.println("Thank You For Using");
						System.out.println("A Program By:- _| \\/ _| -|-");
						in.nextLine();	  // Dummy Scanner
						in.nextLine();   // Waits Till User Enters Something,ie User Can See my Msg
						System.exit(0);
					}
				else
					{
						System.out.println("Wrong Choice, Try Again");
						retry();
					}
			}
	}

