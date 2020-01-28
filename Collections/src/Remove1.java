import java.util.*;
public class Remove1 
{
	public static void main(String args[])
	{
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Ramya");
		list1.add("Pravalli");
		list1.add("sita");
		list1.add("Satish");
		list1.remove("Pravalli");
		ArrayList<String> list2=new ArrayList<>();
		list2.add("charan");
		list1.addAll(list2);
		System.out.println(list1);
	}

}
