class DistanceBetweenCoOrdinates
{
	public static void main(String... JVJplus)
	{
		new Main().main();
		new java.util.Scanner(System.in).nextLine();
		main();
	}
}

class Main
{
	CoOrdinates city1=new CoOrdinates(),city2=new CoOrdinates();
	double distance;

	void main()
	{
		System.out.println("Part 1.");
		input(city1);
		System.out.println("Part 2.");
		input(city2);
		calculateDistance(city1, city2);

		System.out.println("Distance between " + city1.cityName + " And " + city2.cityName + " = " + distance);
	}

 	void input(CoOrdinates city)
	{
		java.util.Scanner in=new java.util.Scanner(System.in);

		System.out.print("Enter City Name=");
		city.cityName = in.next();
		System.out.print("Enter Longitude=");
		city.longitude = inputDouble(in);
		System.out.print("Enter Latitude=");
		city.latitude = inputDouble(in);
	}

	double inputDouble(java.util.Scanner in)
	{
		double d=0,f=0;
		while (f == 0)
		{
			try
			{
				d = in.nextDouble();
				f = 1;
			}
			catch (Exception e)
			{
				in.next();
				System.out.print("Enter Again=");
			}
		}

		return d;
	}

	void calculateDistance(CoOrdinates city1, CoOrdinates city2)
	{
		this.distance = Math.sqrt(Math.pow(city2.latitude - city1.latitude, 2) + Math.pow(city2.longitude - city1.longitude, 2));
	}
}

class CoOrdinates
{
	String cityName;
	double longitude,latitude;

	CoOrdinates()
	{
	}

	CoOrdinates(String name, double longitude, double latitude)
	{
		this.longitude = longitude;
		this.latitude = latitude;
		cityName = name;
	}
}