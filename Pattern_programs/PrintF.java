
public class PrintF {

	public static void main(String[] args) {
		PrintF F=new PrintF();
		F.print();
	}

	private void print() {
		for(int row=1;row<=9;row++)
		{
			if(row==1||row==5)
			{
				for(int i=1;i<=6;i++)
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
