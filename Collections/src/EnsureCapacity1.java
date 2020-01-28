import java.util.*;
public class EnsureCapacity1 
{
	public static void main(String args[])
	{
		ArrayList<String> list1=new ArrayList<>(5);
		list1.add("Ramya");
		list1.add("Pravalli");
		list1.add("sita");
		list1.add("Satish");
		list1.add("charan");
		System.out.println(list1);
		 list1.ensureCapacity(20);
		 list1.add("baby");
		 System.out.println(list1);
		 
		
	}

}



