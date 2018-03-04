import java.util.*;
public class LCM_HCF_Finder
{
		public static void main(String Args[]) {

				System.out.println("Enter 2 numbers");
				Scanner sc = new Scanner(System.in);

				int m = sc.nextInt();
				int n = sc.nextInt();

				int h = 1;
				int p = m * n;

				for (int i = 2; i < p; i++) {
						if ((m % i == 0) && (n % i == 0)) {
								h = i;
							}
					}

				int l = p / h;
				System.out.println("HCF=" + h + " and LCM=" + l);

			}
		}
