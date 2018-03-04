class ToggleCaseConvertor
{
	public static void main(String... JVJplus)
	{
		changeCase(" ");
	}
	
	static void changeCase(String s)
	{
		String newS="",temp="";
		s=s+" ";
		char c;
		int i;
		for(i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			if(c!=' ')
				temp+=c;
			else
			{
				c=temp.charAt(0);
				c=Character.toUpperCase(c);
				temp=c+temp.substring(1,temp.length())+" ";
				newS=newS+temp;
				temp="";
			}
		}
		newS=newS.substring(0,newS.length()-1); // to remove last space
		System.out.println("Toggle Case="+newS);
	}
}