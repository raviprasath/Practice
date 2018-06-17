package practicetest;

public class FindLeader {

	public static void main(String[] args) {
	
		int arr[]= {10,12,9,99,8,7,90,7,8,56};
		
		for(int i = 0; i<arr.length; i++)
		{
			boolean isLeader = true;
			
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<=arr[j])
				{
				isLeader = false;
				break;
				}
			}
			if(isLeader)
			{
				System.out.println("Leader is "+arr[i]);
			}
		}

	}

}
