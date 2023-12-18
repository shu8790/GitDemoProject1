package Demo1;
import java.util.ArrayList;

public class Demo2
{
	public static void main(String[] args)
	{
		ArrayList a= new ArrayList<>();
		
		a.add("shubham");
		a.add("pune");
		a.add("MH 14");
		a.add(1234);
		a.add('A');
		a.add("pune");
		a.add(null);
		System.out.println(a);
		
	// size method -> return size of an arraylist
		
		System.out.println(a.size());
		
	// IsEmpty method-> check whether the arraylist is empty or not. if empty 
					//	return true and fi not then return false
		
		System.out.println(a.isEmpty());
		
	// contains method -> check whether the arraylist contains particular object
		//					or not. we have to pass element as an argument. it return
					//		boolean value
		
		System.out.println(a.contains("pune"));
		
		
	// Get method -> it is used to get object present at  specific index from array list
		//			we have to pass integer index as an argument
		
			System.out.println(a.get(3));
			
	
	// Indexof method -> this method is used to find out the
			//			 index of object present inside arraylist.
					//	 we have to pass arraylist object as aurgument
			
			
			System.out.println(a.indexOf("pune"));
			
	// Lastindexof method -> This method return back the index of
			//				 last occurence of the object.
			//				argument- arraylist object
			//				return type integer
			
			System.out.println(a.lastIndexOf("pune"));
			
	// Remove method-> this method is used to remove the object 
			//		   from arraylist.
			//		   argument- index of object
			//         return - removed object
			
			System.out.println(a.remove(1));
			
			System.out.println(a);
			
	// printing array list using for loop
			
			for( int p=0; p<= a.size()-1; p++)
			{
				System.out.println( a.get(p));
			}
			
			
			
			
		

	}


}
