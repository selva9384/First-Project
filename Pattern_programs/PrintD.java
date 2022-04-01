
public class PrintD {

	public static void main(String[] args) {
		PrintD D=new PrintD();
		D.print();
	}

	private void print() {
		for(int row=1;row<10;row++)
		{
			if(row==1||row==9)
			{
				for(int i=1;i<=6;i++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				System.out.print("*");
				for(int i=1;i<=11;i++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
