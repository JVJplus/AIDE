import java.util.*;
public class EMailVerifier
	{
		static Scanner in=new Scanner(System.in);
		public static void main(String jvj[])
			{	
				maincopy();
			}

		static void maincopy()
			{
				String s=acceptingEMail();
			    boolean status=checking(s);
				if(status)
					System.out.println("Its Correct");
					else
						System.out.println("Its False");

				Retry();
			}
			
		static String acceptingEMail()
		{
			System.out.println("Enter Your Email");
			String s=in.nextLine();
			return s;
		}
		
		static boolean checking(String s)
		{
			s=s.trim();
			boolean status=false;
			String domain="",title="",sites;
			int i,atSign=0,dotAvailCheck=0,pOfDot,pOfAt;
			char ch;
			
			sites="in co com org uk jvj edu";
			for(i=0;i<s.length();i++)
			{
				ch=s.charAt(i);
				if(ch=='@')
					atSign++;
				if(ch=='.')
					dotAvailCheck++;
			}
			if(atSign>0)
			{
		    pOfAt=s.indexOf('@');
			title=s.substring(0,pOfAt);
			}
			
			if(dotAvailCheck>0)
			{
			pOfDot=s.lastIndexOf('.');
			domain=s.substring(pOfDot+1);
			}
			
			
			if((sites.contains(domain))&&(dotAvailCheck>0)&&title.length()>=1)
			{
				if(atSign==1)
					status= true;
					else
						status= false;
			}
			
			System.out.println("Title="+title);
			System.out.println("Domain="+domain);
			return status;
		}


		static void Retry() 	//asking user if he wanted to replay than run program once again
			{
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Do you want to replay, \n Press Y/N");
				char confirm=in.next().charAt(0);
				in.nextLine();
				System.out.println("______________________________________");	//ending 1st program
				if (confirm == 'Y' || confirm == 'y')
					maincopy();
				else
					System.exit(0);
			}
	}
