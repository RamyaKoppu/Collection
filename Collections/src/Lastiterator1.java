import java.util.*;
public class Lastiterator1 
{
	public static void main(String[] args)
    {
        ArrayList<String> a = new ArrayList<>(Arrays.asList("Ramya","Pravalli","Charan"));
       ListIterator<String> iterator = a.listIterator();
       while(iterator.hasNext())
       {
            System.out.println(iterator.next());
       }
         
        while(iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }
    }
}

