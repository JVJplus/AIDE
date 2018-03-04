/**
    A program by : Jay Prakash Mahto
	Date: 28-29/02/2016
	Time Taken: 3.5 Hrs
	Difficulty: Medium
	Program Taken From:- Giving an weird Pattern Program To friend Shashank
	                     And Thought to did this myself
	Program:- To accept no.of lines max 8 bcz int data type can't take more than 9digits no. 
	          and to take numbers which should greater than or equal to line no.
			  and to print pattern from user no.
			  pattern is no. of words equal to line no.
*/

import java.util.*;
import java.math.*;
class UserChoicePattern
{
		static int i;
		static Scanner in=new Scanner(System.in);
	
		public static void main(String JVJ[])
		{
			maincopy();
		}

		static void maincopy()   //for replaying game since main method cant be executed
			{
				int lines;
				lines=toAcceptLines();
				int n[]=new int[lines];
				n=LineCharacterAccepting(lines);
				display(n);
				drawPatterns(n);
				Retry();
			}
			
		static int toAcceptLines()
			{
				int lines=0,status=0;
				
				System.out.println("Enter No. Of Lines (max=8)");
				lines=in.nextInt();
				
				while(lines<1)
				{
					
					System.out.println("Enter atleast 1 line");
					lines=toAcceptLines();
				}
				
				while(lines>8)
				{
					System.out.println("Plz!!! Entered lines less than 9");
					lines=in.nextInt();
				}
				return lines;
			}
			
			static int[] LineCharacterAccepting(int lines)
			{
				int[] n=new int[lines];
				int temp,characters=1,length;
				boolean check=false;
				for(i=0;i<lines;i++)
				{
				System.out.println("enter "+characters+" number");
				temp=in.nextInt();
				length=length(temp);
				check=characterChecking(length,characters);
				if(check==true)
					n[i]=temp;
				else
					n[i]=ifIncorrect(length,characters);
				
			    characters++;
				}
				return n;
			}
			
			static int length(int n)
			{
				String n2=Integer.toString(n);
				int length=n2.length();
				return length;
			}
			
			static boolean characterChecking(int nlength,int characters)
			{
				boolean check=false;
				if(nlength>=characters)
					check=true;
				return check;
			}
			
			static int ifIncorrect(int nlength,int characters)
			{
				int temp=0;
				while(nlength<characters)
				{
					System.out.println("Sorry!! You Entered Incorrectly, Plz Enter no. Greater Than or Equal To "+(characters)+" characters");
					temp=in.nextInt();
					nlength=length(temp);
				}
				return temp;
			}
			
			static void drawPatterns(int[] n)
			{
				int line=1,j,i,c=0;
				char ch;
				String str="";
				System.out.println("\nYour Pattern is:");
				for(i=0;i<n.length;i++)
				{
					for(j=0;j<line;j++)
					{
						str=Integer.toString(n[i]);
						ch=str.charAt(j);
						System.out.print(ch);
					}
					System.out.println();
					line++;
				}
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
	
			static void display(int[] n)
			{
				System.out.println("\nCheck out");
				for(int i=0;i<n.length;i++)
				{
					System.out.println(n[i]);
				}
			}
}


