import java.util.ArrayList;
import java.util.Arrays;

public class Removeif1
{
	public static void main(String args[])
	{
		ArrayList<Integer> a=new ArrayList(Arrays.asList(1,2,3,4,5,6));
		a.removeIf( number -> number%2 != 0 );
        System.out.println(a);
	}
}
