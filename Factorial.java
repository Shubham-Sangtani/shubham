import java.util.*;
class Factorial
{
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);

		int n,i=1,f=1;

		System.out.println("Enter the number");
		n=in.nextInt();
		while(i<=n)
		{
			f=f*i;
			System.out.println(+f);
			i++;
		}
	}
}