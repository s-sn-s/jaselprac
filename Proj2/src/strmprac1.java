import java.util.Arrays;
import java.util.List;

public class strmprac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] myAry = {"Hey","I","Am","Savin","Shetty"};
		System.out.println(myAry);
		List<String> myAryLst = Arrays.asList(myAry);
		myAryLst.forEach(s->System.out.println(s));
		System.out.println(myAryLst.contains("Savin"));
		System.out.println("------");
		
		
	}

}
