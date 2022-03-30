public class Square
{
	public static void main(String[] args)
	{
		Square sq=new Square();
		sq.square();
	}
	public void square()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{ 
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
