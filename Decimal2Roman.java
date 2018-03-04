import java.util.*;
public class Decimal2Roman
	{
		static Scanner in=new Scanner(System.in);
		public static void main(String jvj[])
			{	
				maincopy();
			}

		static void maincopy()
			{
				int n;
				n = toAccept();
				toRoman(n);

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
								System.out.println("Error");
								System.out.println("Enter Again");
								in.nextLine(); //dummy scanner
							}  	//catch ends
					}       //loop ends
				return n;
			}
			
			static void toRoman(int no)
			{
				String noInString=Integer.toString(no);
	            String[] ones={"","I","II","III","IV","V","VI","VII","VIII","IX"};
				String[] tens={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
				String[] hundreds={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
				String[] thousands={"","M","MM","MMM"};
				
				if(no<0)
				    System.out.println("Negative No.s Are Not Allowed");
				else if(no<10)
				{
					if(no==0)
					{
						System.out.println("Sorry,Its Zero (0)");
						retry();
					}
					else
						System.out.println(ones[no]);
				}
				else if(no<100)
				{
					String tensPlaceDigitChar=""+noInString.charAt(0);
					int tensPlaceDigit=Integer.parseInt(tensPlaceDigitChar);
					String onesPlaceDigitChar=""+noInString.charAt(1);
					int onesPlaceDigit=Integer.parseInt(onesPlaceDigitChar);
			
					System.out.println(tens[tensPlaceDigit]+""+ones[onesPlaceDigit]);
				}
				else if(no<1000)
				{
					String hundredPlaceDigitChar=""+noInString.charAt(00);
					int hundredsPlaceDigit=Integer.parseInt(hundredPlaceDigitChar);
					String tensPlaceDigitChar=""+noInString.charAt(01);
					int tensPlaceDigit=Integer.parseInt(tensPlaceDigitChar);
					String onesPlaceDigitChar=""+noInString.charAt(02);
					int onesPlaceDigit=Integer.parseInt(onesPlaceDigitChar);

					System.out.println(hundreds[hundredsPlaceDigit]+""+tens[tensPlaceDigit]+""+ones[onesPlaceDigit]);
				}
				else if(no<4000)
				{
					String thousandPlaceDigitChar=""+noInString.charAt(00);
					int thousandPlaceDigit=Integer.parseInt(thousandPlaceDigitChar);
					String hundredPlaceDigitChar=""+noInString.charAt(01);
					int hundredsPlaceDigit=Integer.parseInt(hundredPlaceDigitChar);
					String tensPlaceDigitChar=""+noInString.charAt(02);
					int tensPlaceDigit=Integer.parseInt(tensPlaceDigitChar);
					String onesPlaceDigitChar=""+noInString.charAt(03);
					int onesPlaceDigit=Integer.parseInt(onesPlaceDigitChar);

					System.out.println(thousands[thousandPlaceDigit]+""+hundreds[hundredsPlaceDigit]+""+tens[tensPlaceDigit]+""+ones[onesPlaceDigit]);
				}
				else
					System.out.println("Its too Large No. Plz enter no. below 4000");
						
			}

		static void retry() 	//asking user if he wanted to replay than run program once again
			{
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Do you want to replay, \n Press Y/N");
				char confirm=in.next().charAt(0);
				System.out.println("______________________________________");	//ending 1st program
				if (confirm == 'Y' || confirm == 'y')
					maincopy();
				else
					System.exit(0);
			}
	}
