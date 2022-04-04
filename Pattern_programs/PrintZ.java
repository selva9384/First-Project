
public class PrintZ {

	public static void main(String[] args) {
		PrintZ Z=new PrintZ();
		Z.print();
	}

	private void print() {
		for(int row=1;row<=10;row++)
		{
			if(row==1||row==10) {
				for(int i=1;i<=10;i++)
					System.out.print("* ");
			}
			else
			{
			for(int space=row;space<10;space++)
			{
				System.out.print("  ");
			}
			System.out.print("*");
			}
			System.out.println();
		}
	}

}
