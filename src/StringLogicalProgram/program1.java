package StringLogicalProgram;

public class program1 {

	public static void main(String[] args) 
	{
		
		String Str1= new String("India Is Great");
		String Str2= new String("INDIA IS GREAT");
		
		boolean Value = Str1.equalsIgnoreCase(Str2);
		
		if (Value==true)
		{
			System.out.println("Two strings are equal");
		}
		else
		{
			System.out.println("Two strings are not equal");
		}
		
		
		
		

	}

}
