public class PrintE {

	public static void main(String[] args) {
		PrintE E=new PrintE();
		B.print();
	}

	private void print() {
		for(int row=1;row<10;row++)
		{
			if(row==1||row==9||row==5)
			{
				for(int i=1;i<=7;i++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
