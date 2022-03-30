
public class RightTriangle {

	public static void main(String[] args) {
		RightTriangle tri=new RightTriangle();
		tri.triangle();
	}

	private void triangle() {
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
