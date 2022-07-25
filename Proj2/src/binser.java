
public class binser {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] ar = {10,19,122,235,547,859,6661,8972,9088,9991};
		int searchthis = 235;
		int max = ar.length-1; 
		int min = 0;
		int mid = max/2; 
		int counter = 0;
		for(int n : ar)
		{
			counter++;
			if(n==searchthis)
			{
				System.out.println("Index "+mid +
						" value is "+searchthis+ 
						" on itration "+counter);
				break;
			}
			else if(n>searchthis)
			{
				max=mid-1;
				mid=max/2;
			}
			else if(n<searchthis)
			{
				min=mid+1;
				mid=(max+min)/2;
			}
			System.out.println(
					"After itration "+counter+
					" :Min = "+min+
					" :Mid = "+mid+
					" :Max = "+max
				);
		}
	}

}