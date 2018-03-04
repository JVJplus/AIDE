/*
    Program:- To Generate Random No. According to Level
	          Levels are:
			             level 1: 0-10
						 level 2: 0-100
						 level 3: 0-1000
						 
		      and also Ask user For No. of chances he wants,
			  which should be as level1 should be maximum of 3,
			  level 2 have max of 10 and level 3 have max 20.
			  
			  Check and display Summary with no. of chances he used.
			  
    Date:- 23-24/02/2015
	Time taken= 4 hrs.
	Purpose:- Just For Fun and To check own ability
	Difficuly: Medium
	Idea Taken From:- Dev C++ Software Console Demo Program 
**/

import java.util.*;
import java.io.*;
public class RandomNoGuessingGame
	{
		static int i,j;
		static InputStreamReader input=new InputStreamReader(System.in);
		static BufferedReader read=new BufferedReader(input);
		static Scanner in=new Scanner(System.in);

		public static void main(String args[])throws IOException
			{
				maincopy();		// main method can't be repeated therefore using copy of main to repeat later on
			}

		static void maincopy()throws IOException   //for replaying game since main method cant be executed
			{
				System.out.println("Welcome To Number Guessing Game");
				int level=Level();               //Asking user for choosing Level
				int randomNo=RandomNo(level);  //contains Random no.
				int lives=noOfLives(level);  //contains the total no. of lives user needs
				checking(randomNo,lives);  //checking user no. to random no.
				
				Retry();
				
			}
			static int Level()  // for level
			{
				System.out.println(" Press 1 for Easy (0-10) \n Press 2 for Medium (0-100)\n Press 3 for Difficult (0-1000)");
				int level=in.nextInt();
				return level;
			}

		static int noOfLives(int level)  //for no. of lives user needs
			{
				int user;
				System.out.println("Enter The No. Of lives You need");
				System.out.println("Minimum No. of Lives for Easy=3, Medium=10, Difficult=20");
				user=in.nextInt();
				user=livesChecking(user,level);     //for checking so that lives dosen't exceeds its limits

				return user;
			}

		static int livesChecking(int user,int level)  //for checking is no. of lives dosen't exceeds minimum value and not to be 0
			{
				int lives=0;
				if(level==1&&user<=3)
					lives=user;
				else if(level==2&&user<=10)
					lives=user;
				else if(level==3&&user<=20)
					lives=user;
				else 
					System.out.println("Enter no.of Lives Correctly");
				if(lives==0) //if user enters lives exceeding limit and if user enters 0
					lives=noOfLives(level);

				return lives;
			}
			
			static int RandomNo(int level)  // for generating Random no.
			{
				int random=0,min,max;
				boolean done=false;
				while(done==false)
				{
				switch(level)   //generating random no. a/c level
				{
					case 1: min=0;max=10;
						   random=min+(int)(Math.random()*(max-min+1));
						   done=true;
						   break;

					case 2: min=0;max=100;
						random=min+(int)(Math.random()*(max-min+1));
						done=true;
						break;

					case 3: min=0;max=1000;
						random=min+(int)(Math.random()*(max-min+1));
						done=true;
						break;
						
					default: System.out.println("Sorry Please Select Level Correctly"); // in case level entered is incorrect
						     level=Level();
				}
				}
			   
				// System.out.println("Random No.="+random);
				return random;
			}
			
			static void checking(int randomNo,int lives)   // for checking user no is equal to random no. or not
			{
				int chances=lives,n;
				boolean won=false;
				while(chances>0)
				{
					n=user(chances,lives);
					if(n==randomNo)
					{
						System.out.println("You Guessed the correct Random no. which is "+randomNo);
						System.out.println("And you did this in="+(lives-chances+1)+" Chances");
						chances=0;
						won=true;
					}
					else 
						condition(n,randomNo);
					
					chances--;
				}
				if(won==false)
				System.out.println("Sorry!!! You lose, you failed to guess the Random No. "+randomNo);
			}
			
			static void condition(int n,int randomNo)   //to print user no. is smaller or greater
			{
				  if(randomNo>n)
					System.out.println("You Entered Smaller No. Than Required");
				  if(randomNo<n)
					 System.out.println("You Entered Greater No. Than Required");
		    }
			
			static int user(int remain,int lives)    //For Accepting user value
			{
			    if(remain==lives)
					System.out.println("Its Your Turn!!!");
				if(remain>0)
					System.out.println("You have "+ remain+" Chance Remaining");
				
				int n=in.nextInt();
				return n;
			}
			
			
		public static void Retry()throws IOException 	//asking user if he wanted to replay than run program once again
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
			
	}
