/* 
	A program by Jay Prakash
	
	Date:-15to19 February 2016
	
	Time Taken- 1hr Daily
	
	Idea Taken From:- One of the Android App
	
	Purpose:- To clear the concepts of Arrays and Functions Especially
	
	Program:- To ask user no of characters to write
			  and print that much random characters not any special chars
			  check the words written by user
			  and print the summary of checking
			  and to print the mistakes
			  and to ask user if he wants to replay again
			  
	Thanks To:- Pranab Sir,
				Navin Reddy (Telusko Videos)
				Frank Comp. X Book
				Slidenerds,programming lad
				And others apps and youtube channels
*/
import java.util.*;
import java.io.*;

public class AccuracyTest
	{
		static int i,j;
		static InputStreamReader input=new InputStreamReader(System.in);
		static BufferedReader read=new BufferedReader(input);
		static Scanner in=new Scanner(System.in);
		
		public static void main(String args[])throws IOException
			{
				maincopy();
			}
			
			static void maincopy()throws IOException   //for replaying game since main method cant be executed
			{
					String userWritten="";
					System.out.println("Enter No. Of Character To Type");   //asking no. of chars to write
					int n=in.nextInt();
					String original=randomChars(n);    
					System.out.println();

					userWritten=UserInputWord();   //for user writing

					System.out.println();
					System.out.println("You Entered= "+userWritten);
					System.out.println("checking.... .");
					checking(original,userWritten);
					
					Retry();
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
			
			static String UserInputWord()throws IOException
			{
				System.out.println("Your turn Enter now \n");
				String user=read.readLine();    // used InputStreamReader class for accepting string, since Scanner Is not accepting space in String
				return user;
			}
			

		static void checking(String orig,String orig_user)  //for checking the user written string length and execute A/Q to length
			{
				char[] original,user;      
				original=orig.toCharArray();	//converting orignal string to char array
				user=orig_user.toCharArray();	//converting user ""
				
				if(user.length>original.length)  //checking if lenth less,more,or equal
				{
					System.out.println("Sorry, You entered more characters than required");
					ifGreater(original,user);
				}
				else if(user.length<original.length)
				{
					System.out.println("Sorry, You entered less characters than required");
					ifLess(original,user);
				}
		
				else
				{
					System.out.println("You have entered equal characters as required");
					ifEqual(original,user);
			    }
			 }
			 
			 public static void ifEqual(char[] original,char[] user)
			 {
				 int count=0;
			
				 for(i=0;i<original.length;i++)
					 {
						 System.out.println(original[i]+"="+user[i]);
						 if(original[i]==user[i])
							 count++;
					 }
				 System.out.println("Total Count="+original.length);
				 System.out.println("Correct Count="+count);
				 System.out.println("Total Mistakes="+(original.length-count));

				 if(count==original.length)
					 System.out.println("WELL DONE!!!! Your Accuracy is superb");
				 else
					 System.out.println("SORRY!!! You hava some mistakes,which are below:");

					 for(i=0;i<original.length;i++) 	//for printing mistakes
						 if(original[i]!=user[i])
							 System.out.println(user[i]+" instead of "+original[i]);
							 
			 }
			 
			 static void ifLess(char[] original,char[] user)
			 {
				 int count=0;
				 for(i=0;i<user.length;i++)
				 {
					 if(user[i]==original[i])
						 count++;
				 }
				 System.out.println("Total Characters="+original.length);
				 System.out.println("Character Escaped="+(original.length-user.length));
				 System.out.println("Correct Characters="+count);
				 System.out.println("Incorrect Characters="+(user.length-count));

				 if(count!=user.length)
					 System.out.println("SORRY!!! You hava some mistakes,which are below:");
				 
				 for(i=0;i<user.length;i++)
				 {
					 if(user[i]!=original[i])
						 System.out.println(user[i]+" instead of "+original[i]);
				 }
				
			 }
			 
			 static void ifGreater(char[] original,char[] user)
			 {
				 int count=0;
				 for(i=0;i<original.length;i++)
				 {
					 if(original[i]==user[i])
						 count++;
				 }
				 System.out.println("Total Characters="+original.length);
				 System.out.println("More Characters Written than required="+(user.length-original.length));
				 System.out.println("Correct Characters="+count);
				 System.out.println("Incorrect Characters="+(original.length-count));

				 if(count!=original.length)
					 System.out.println("SORRY!!! You hava some mistakes,which are below:");
				 
				 for(i=0;i<original.length;i++)
					 {
						 if(user[i]!=original[i])
							 System.out.println(user[i]+" instead of "+original[i]);
					 }
			 }
			 
			 
			 public static void Retry()throws IOException 	//asking user if he wanted to replay than run program once again
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

