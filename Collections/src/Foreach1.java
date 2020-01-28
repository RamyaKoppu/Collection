import java.util.*;
public class Foreach1 
{
	public static void main(String args[])
	{
		ArrayList<Integer> a=new ArrayList(Arrays.asList(1,2,3,4,5,6));
		a.forEach(name -> System.out.println(name));
	}
}
