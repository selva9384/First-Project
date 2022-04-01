
public class PrintS {

	public static void main(String[] args) {
		PrintS S=new PrintS();
		S.print();
	}

	private void print() {
		for(int row=1;row<=9;row++)
		{
			if(row==1||row==5||row==9)
			{
				for(int i=1;i<=7;i++)
				{
				System.out.print(" *");
				}
			}
			else
			{
				if(row<5)
					System.out.print("*");
				else 
				{
					for(int i=1;i<=15;i++)
					{
						System.out.print(" ");
					}
					System.out.print("*");	
				}
			}
			System.out.println();
		}
	}

}
