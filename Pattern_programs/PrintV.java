
public class PrintV {

	public static void main(String[] args) {
		PrintV V=new PrintV();
		V.print();
	}

	private void print() {
		for(int row=1;row<=10;row++)
		{
			for(int space=1;space<=row;space++)
			{
				System.out.print(" ");
			}
				System.out.print("*");
			for(int innerSpace=row;innerSpace<10;innerSpace++)
			{
				System.out.print("  ");
			}
				System.out.print("*");
			System.out.println();
		}
	}

}
