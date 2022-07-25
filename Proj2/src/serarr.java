
public class serarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrprc ap = new arrprc();
		serarr sa = new serarr();
		//int rey[];
		//rey= new int[]{22,33,54,65,77};
		
		//sa.searcharr(ap.rey);
		System.out.println(sa.searcharr(ap.rey));
		System.out.println(sa.searcharr(ap.re()));
	}

	public boolean searcharr(int a[])
	{
		boolean b = false;
		int min=0;
		int max=a.length-1;
		int mid=max/2;
		int counter = 0;
		int sme=65;
		for(int i : a)
		{
			counter++;
			if(a[mid]==sme)
			{
				System.out.println("Mil gaya bhai!!! "+counter+" try pe :)");
				b = true;
				return b;
			}
			else if(a[mid]>sme)
			{
				max=mid-1;
				mid=max/2;
			}
			//mid<sme
			else
			{
				min=mid+1;
				mid=(min+max)/2;
			}
		}
		return b;
		
	}
}
