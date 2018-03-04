import java.util.*;
public class Number2Words
	{
		static Scanner in=new Scanner(System.in);
		public static void main(String jvj[])
			{	
				mainCopy();
			}

		static void mainCopy()
			{
				int n;
				n = toAccept();
				toWords(n);

				retry();
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

		static void toWords(int no)
			{
	            String[] ones={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
				String[] tensplus={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
				String[] tens={"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};

				if(no<0) //For Negative
					{
						System.out.print("-");
						no=no*-1;    //changing - no to + so that array index of bound cant happens
					}

				int tenThousandsPlaceDigit=no/10000;
				int thousandsPlaceDigit=no/1000;
				int hundredsPlaceDigit=(no/100)%10;
				int tensPlaceDigit=(no/10)%10;
				int onesPlaceDigit=no%10;

				if(no<10)
				{
						if(no==0)
							System.out.println("Zero");
						else
						    System.out.println(ones[no]);
				}

				else if(no<20)
				{
					System.out.println(tensplus[onesPlaceDigit]);
				}

				else if(no<100)
				{
					System.out.println(tens[tensPlaceDigit]+" "+ones[onesPlaceDigit]);
				}
				else if(no<1000)
				{
						System.out.print(ones[hundredsPlaceDigit]+" Hundred ");
						if(tensPlaceDigit==1)      // solving 10-20 letter eg 413
							System.out.println(tensplus[onesPlaceDigit]);
						else
							System.out.println(tens[tensPlaceDigit]+" "+ones[onesPlaceDigit]);
				}
				else if(no<10000)
				{
					
		             System.out.print(ones[thousandsPlaceDigit]+" Thousand ");
					 if(hundredsPlaceDigit==0&&tensPlaceDigit==0) // n000-n009 n=(1-9)
						 System.out.println(ones[onesPlaceDigit]);
					 else if(hundredsPlaceDigit==0&&tensPlaceDigit==1) // n010-n019  n=(1-9)
						 System.out.println(tensplus[onesPlaceDigit]);
					 else if(hundredsPlaceDigit==0&&tensPlaceDigit>1)  // n020-n099  n=(1-9)
						 System.out.println(tens[tensPlaceDigit]+" "+ones[onesPlaceDigit]);
					 else if(hundredsPlaceDigit>0)
					 {
						 System.out.print(ones[hundredsPlaceDigit]+" Hundred "); //nnnn n=(1-9)
						 
						 if(tensPlaceDigit==0) // nn00-nn09 n=(1-9)
							 System.out.println(ones[onesPlaceDigit]);
						 else if(tensPlaceDigit==1) // nn10-nn19  n=(1-9)
							 System.out.println(tensplus[onesPlaceDigit]);
						 else if(tensPlaceDigit>1)  // nn20-nn99  n=(1-9)
							 System.out.println(tens[tensPlaceDigit]+" "+ones[onesPlaceDigit]);
					 }
			    }
				
				else
				{
					System.out.println("Its too Large No. Plz enter no. below _____");
					System.out.println("Itna calculate karne nhi aata hai bhai...");
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
