
import java.util.Arrays;

public class arrprc {
	
	int rey[]= {24,34,54,64,74};
	
	public int[] re() {
		return rey.clone();
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[10];
		
		arrprc t = new arrprc();
		t.Testarray1();
		
	}
	
	public void Testarray1()
	{  
		int arr[]={33,3,4,5};  
		System.out.println("Printing original array:");  
		for(int i:arr)  
		System.out.println(i);  
		  
		System.out.println("Printing clone of the array:");  
		int carr[]=arr.clone();  
		for(int i:carr)  
		System.out.println(i);  
		  
		System.out.println("Are both equal?");  
		System.out.println(arr.equals(carr));  
		System.out.println(Arrays.equals(carr, arr));
	}
	
	
	
}
