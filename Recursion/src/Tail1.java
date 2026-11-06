
public class Tail1
	{

		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				
				System.out.println(mystery(5));
				System.out.println(mystery(7));
				System.out.println("\\\\BIG CHANGE//");

			}
		
		public static int mystery(int n)
		{
			if (n == 1)
				{
					return 1;
				}
			else
				{
					return n + mystery(n - 2);
				}
		}
		

	}
