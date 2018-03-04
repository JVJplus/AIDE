/*
	Program: To Accept No of Groups 
			 And Values Of Each Groups 
			 And Print The Values In A Form Of
			 Horizontal Graph In Lowest Form...
	Date Of Creation:24/25 April 2016
	Time Taken : 4-5 Hours
	Difficulty: Medium
	Idea Taken From: C Programs with Solutions By S. ANANDAMURUGAN pdf
*/

import java.util.*;
public class HorizontalGraphGenerator
	{
		static Scanner in=new Scanner(System.in);
		public static void main(String JVJplus[])
		{	
			  	System.out.print("Enter No. Of Group=");
				int noOfGroup=-1;  //to make while loop condition true
	
				while(noOfGroup<0)  // handling negative value
				{
					noOfGroup=toAccept();
					if(noOfGroup<0)
						System.out.println("Sorry,You Entered Negative Value. Plz, Enter Again");
				}
				
				int groupData[]=new int[noOfGroup];
				groupData=toAcceptData(noOfGroup);
				int max=toFindMax(groupData);// finding max value for calculating reducing size
				
				int temp[]=new int[noOfGroup];  // temp variable so that original values dosent change in functions
				for(int i=0;i<groupData.length;i++)
					{
						temp[i]=groupData[i];
					}
					
				int reducedDatas[]=new int[noOfGroup];
				reducedDatas=toReduceValues(temp,max); // decreasing size of bars
	
				max=toFindMax(reducedDatas);  //finding max so thar spacing should bedone done
		
				toCreateGraph(groupData,reducedDatas,max); //to create graph
				retry();
			}

		static int toAccept() //to accept no with error handling
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

			static int[] toAcceptData(int noOfGroup)  // to accept values of each group
			{
				int i;
				int datas[]=new int[noOfGroup];
				for(i=0;i<datas.length;i++)
				{
					System.out.print("Enter "+(i+1)+" Group Data=");
					datas[i]=toAccept();
				}
				return datas;
			}
			
			static int toFindMax(int datas[])    // finding maximum data for printing evenly distributed spaces
			{
				int i,max=datas[0];
				for(i=0;i<datas.length;i++)
				{
					if(datas[i]>max)
						max=datas[i];
				}
				return max;
			}
		
			static int[] toReduceValues(int datas[],int max)
			{
				// logic to rreduce: divide each no by length if max-1 power to 10 , so that 1 digit/first digit remains
				int i,reducingValue=1;
				
				// length of max value
				String temp=Integer.toString(max);
				int lengthOfMax=temp.length();
				
				reducingValue=(int)Math.pow(10,lengthOfMax-1);
				for(i=0;i<datas.length;i++)
				{
					datas[i]=datas[i]/reducingValue;
				}
				
				return datas;
			}
			
			static void toCreateGraph(int groupDatas[],int[] reducedDatas,int max)
			{
				System.out.println("\n \t\t HORTIZONTAL GRAPH ↓ \n");
				int i,k,s,j;
				for(i=0;i<reducedDatas.length;i++)
				{
					for(k=1;k<=3;k++)  // for 3 sub graph printing
					{
					if(k==2)  //printing group no in 2 subgraph
						System.out.print("GROUP "+(i+1)+"\t|");
					else
						System.out.print("      \t|");
					
						for(j=1;j<=reducedDatas[i];j++) //printing graph
					       {
						      System.out.print("-");
					        }
					if(k==2)  //print only in the middle subgraph
					{
						int temp=reducedDatas[i];  //temp sothat data value doesn't altered
						if(temp<0)   // for converting negatives, so that spaces are evenly spaced
							temp*=-1;
							
						for(s=1;s<=(max-temp);s++)  // printing evenly distributed spaces for printing value of group
						System.out.print(" ");
						
						System.out.print(" ("+groupDatas[i]+")"); //printing group data value in brackets
					}
					
					System.out.println(); //space after each subgroup
					}
					System.out.println(); //space after each group
				}
			}
			
			static void retry() 	//asking user if he wanted to replay than run program once again
			{
				String temp[]={};
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Do you want to replay, \n Press Y/N");
				char confirm=in.next().charAt(0);
				System.out.println("______________________________________");	//ending 1st program
				if (confirm == 'Y' || confirm == 'y')
					main(temp);
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

