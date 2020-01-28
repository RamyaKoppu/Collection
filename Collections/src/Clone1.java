import java.util.*;
import java.util.ArrayList;;
public class Clone1
{
	public static void main(String args[])
	{
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Ramya");
		list1.add("Pravalli");
		list1.add("sita");
		list1.add("Satish");
		list1.add("charan");
		System.out.println(list1);
		 ArrayList<String> arrayListClone =  (ArrayList<String>) list1.clone();
		 System.out.println(arrayListClone);
	}

}
