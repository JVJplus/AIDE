import java.util.*;

 class Main
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		do
		{
		System.out.print("Enter a number: ");
		int t,n=t=input.nextInt();
		int r,binary=0,rev=0;
		while(n!=0)
		{
			r=n%2;
			binary=binary*10+r;
			n=n/2;
		}
		while(binary>0)
		{
			r=binary%10;
			rev=rev*10+r;
			binary/=10;
		}
		System.out.println("Binary Of "+t+" is = "+rev);
	}
	while(true);
	
}
}
