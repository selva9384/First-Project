import java.util.Scanner;

public class RemoveDupilatesFromInteger
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		System.out.println(remove(sc.nextInt()));
	}

	private static int remove(int num) {
		int temp=num, count=0;
		while(temp>0)
		{
			temp/=10;
			count++;
		}
		int[] arr=new int[count];
		char duplicate[]=new char[count];
		for(int i=arr.length-1;i>=0;i--)
		{
			arr[i]=num%10;
			num/=10;
	}
		for(int j=0;j<arr.length-1;j++)
		{
			for(int k=j+1;k<arr.length;k++)
			{
				if(arr[j]==arr[k])
					duplicate[k]='a';
			}
		}
		int a=0;
		for(int l=0;l<arr.length;l++)
		{
			if(duplicate[l]!='a')
			{
			a=(a*10)+arr[l];	
			}
		}
		
		return a;
	}

}
