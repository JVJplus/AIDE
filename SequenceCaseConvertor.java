import java.util.*;
class SequenceCaseConvertor
{
	static Scanner in=new Scanner(System.in);
	public static void main(String... JVJplus)
	{
		changeCase(" ");
	}

	static void changeCase(String s)
	{
		String newS="",temp="";
		s = s + " ";
		char c;
		int i;
		for (i = 0;i < s.length();i++)
		{
			c = s.charAt(i);

			if (i % 2 == 0)
				c = Character.toUpperCase(c);
			else
				c = Character.toLowerCase(c);

			if (c != ' ')
				temp += c;

			else if (temp != "")
			{
				newS = newS + temp + " ";
				temp = "";
			}
		}
		newS = newS.substring(0, newS.length() - 1); // to remove last space
		System.out.println("Random Case= " + newS);
	}
}