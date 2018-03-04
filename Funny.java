import java.util.*;
class I
{
	static Scanner in=new Scanner(System.in);
	public static void main(String JVJplus[])
	{
		String you="",
			name[]={"Jasmine","Aarti","Piyush"};

		for(int i=0;i<name.length;i++)
			you+=name[i].charAt(i);

		System.out.print("I Love You=");

		I.love(you);
	}

	public static void love(String name)
	{
		System.out.println(name);
	}
	}

