public class PrintC {

	public static void main(String[] args) {
		PrintC c=new PrintC();
		c.print();
	}

	private void print() {
		for(int row=1;row<=10;row++)
		{
			if(row==1||row==10)
			{
				for(int i=1;i<=7;i++)
				{
					System.out.print(" *");
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
