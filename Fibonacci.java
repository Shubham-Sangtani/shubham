import java.util.*;
class Fibonacci
{
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);

		int x=0,y=1,i,sum;

		System.out.println("Fibonacci Series");
		for(i=1;i<=18;i++)
		{
			sum=x+y;
			System.out.println(+sum);
			x=y;
			y=sum;
		}
	}
}