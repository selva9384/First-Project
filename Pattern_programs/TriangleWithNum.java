public class TriangleWithNum
{
	public static void main(String args[])
	{
		TriangleWithNum o =new TriangleWithNum();
		o.triangle();
	}
	public void triangle()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}