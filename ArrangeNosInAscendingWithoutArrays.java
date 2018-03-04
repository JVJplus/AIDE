/* 
	Program:-To Accept 10 No.s and Print in Alphabetical Order 
	         Without Using Arrays
    Program By:- Jay Prakash
	Date:-19/03/2016
	Time Taken:- 1.5 hrs (6pm-7pm,11pm-12pm)
*/

import java.util.*;
public class ArrangeNosInAscendingWithoutArrays
	{
		public static void main(String JvJ[])
			{
				Scanner in=new Scanner(System.in);
				String no="",temp="",tempNoS;
				int i,j,n,c=0,ch=1,tempNo,min=0,done=1;
				char sc;
				for (i = 1;i <= 10;i++)
					{
						while (done == 1)
							{
								try
									{
										System.out.println("Enter " + i + " No");
										n = in.nextInt();
										tempNoS = Integer.toString(n);
										no += tempNoS + " ";
										done = 0;
									}
								catch (InputMismatchException e)
									{
										in.nextLine();
										System.out.println("Sorry " + e + " Occurs");
									}
							}
						done = 1;
					}

				System.out.println("Numbers are=" + no);
				System.out.println("Sorted No.s Are");
				i = 1;
				while (i <= 10)
					{
						for (j = 0;j < no.length();j++)
							{
								sc = no.charAt(j);
								if (sc != ' ')
									temp += sc;
								else
									{
										if (temp.charAt(0) != '*')
											{
												tempNo = Integer.parseInt(temp);
												if (ch == 1 || tempNo < min)
													{
														ch = 0;
														min = tempNo;
													}
											}
										temp = "";
									}
							}
						System.out.println(i + "=" + min);
						no = removeMin(min, no);
						min = 0;
						ch = 1;
						i++;
					}
			}

		static String removeMin(int min, String s)
			{
				String newS="",minS,temp="";
				char ch;
				int i;
				minS = Integer.toString(min);
				for (i = 0;i < s.length();i++)
					{
						ch = s.charAt(i);
						if (ch != ' ')
							temp += ch;
						else
							{
								if (temp.equals(minS))
									{
										temp = "*";
										minS = "*";  //cant use break bcz it will stop furthur string
										// cant use * since there may be conflict
									}
								newS += temp + " ";
								temp = "";
							}
					}
				return newS;
			}
	}
