//program to find minimum number in a array
public class MinimumNumInArray {

	public static void main(String[] args) {
		minimum();
	}

	private static void minimum() {
		int[] arr= {79,45,66,75,41,65};
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum number in the array is : "+min);
	}

}
