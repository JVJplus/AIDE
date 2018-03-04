import java.util.*;
public class basicStructureOfMethods
{
	static Scanner in=new Scanner(System.in);
	public static void main(String jvj[])
	{	
      maincopy();
	}
	
	static void maincopy()
	{
		
		Retry();
	}
	
     static void Retry() 	//asking user if he wanted to replay than run program once again
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
