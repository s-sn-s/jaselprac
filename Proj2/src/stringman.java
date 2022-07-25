import java.util.Arrays;
//import net.bytebuddy.implementation.ToStringMethod;

public class stringman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrprc ar = new arrprc();
		String s = 
		"Please use temporary password 'rahulshettyacademy' to Login.";
//Arrays.toString(ar.rey);
		

//		String[] passwordArray = passwordText.split("'");


		System.out.println(s);
		String na[] = s.split("'"); 
		for(String i:na)
			System.out.println(i);
	}

}
