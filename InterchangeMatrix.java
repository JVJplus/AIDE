//Interchange any two Rows & Columns in the Matrix

//
//	0 1 2 3
//0	1 2 3 4
//1	5 6 7 8
//2	9 1 2 3
//
//	0 1 2
//0	1 5 9
//1	2 6 1
//2	3 7 2
//3	4 8 3

import java.util.Scanner;
class InterchangeMatrix
{
	public static void main(String... JVJplus)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter col. X rows");
		int i,j,k,c=0,rows=in.nextInt(),columns=in.nextInt();
		int original[][]=new int[columns][rows];
		int duplicate[][]=new int[rows][columns];

		System.out.println("Enter Values");
		for (i = 0;i < columns;i++)
		{
			for (j = 0;j < rows;j++)
			{
				original[i][j] = in.nextInt();
			}
		}

		System.out.println("Original:");
		printArray(original);

		for (i = 0;i < rows;i++)
		{
			for (j = 0;j < columns;j++)
			{
				duplicate[i][j] = original[j][i];
			}
		}

		System.out.println("Changed:");
		printArray(duplicate);

	}

	static void printArray(int...a[])
	{
		for (int i = 0;i < a.length;i++)
		{
			for (int j = 0;j < a[i].length;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}