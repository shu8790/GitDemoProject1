import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Demo {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("shubham"); 	//0
		al.add("360-bytes");	//1
		al.add("100"); // 2
		al.add(null);
		
		
		System.out.println(al);
		System.out.println(al.size());
		
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println("\n"+al.get(i));
			
		}
		
		ListIterator lit = al.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println("\n"+lit.next());
		}
		
		System.out.println(al.indexOf("shubham"));
		
		
		

	}

}
