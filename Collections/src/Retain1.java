import java.util.*;
public class Retain1 
{
	public static void main(String args[])
	{
		ArrayList<Integer> a=new ArrayList(Arrays.asList(1,2,3,4,5,6,3,3));
		a.retainAll(Collections.singleton(3));
		System.out.println(a);
	}
}
