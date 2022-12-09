package String;

public class Str_demo 
{
	public static void main(String[] args)
	{
		Str_demo s=new Str_demo();
		s.str_Methods(null);
		s.stringBufferMethods();
	}

	public static void str_Methods(String str)
	{
		
		String str1 = "Today is a new Day";
		String str2 = "Today is Monday";
		System.out.println("String 1: "+str1);
		System.out.println("String 2: "+str2);
		//printing length of the str1
		System.out.println("Length of String1 is: "+str1.length());
		
		//toUpper Case
		System.out.println("String in Upper Case: "+str1.toUpperCase());
		
		//toLower Case
		System.out.println("String in Lower Case: "+str1.toLowerCase());
		
		//String trim()
		System.out.println("String in trim: "+str1.trim());
		
		//String start with
		System.out.println("String Start with: "+str1.startsWith("Today"));
		
		//String end with
		System.out.println("String Ends with: "+str1.endsWith("Day"));
		
		//Char at
		System.out.println("String Char at: "+str1.charAt(3));
		
		//Intern
		System.out.println("String intern: "+str1.intern());
	}
	
	public static void stringBufferMethods() {
		StringBuffer sb = new StringBuffer("Gauri");
		System.out.println("Method Of StringBuferr");
		System.out.println(sb);
		// display capacity of that sb //21
		System.out.println(sb.capacity());
		// to add string
		System.out.println(sb.append("Balghare"));
		// formula for that (capacity of previous string *2)+2 eg(21*2)+2=44
		System.out.println(sb.capacity());
		// used to replace
		System.out.println(sb.replace(1, 2, "A"));
		// display hash code of sb
		System.out.println(sb.hashCode());
		// its return true or false
		System.out.println(sb.isEmpty());
		//  reverse the String
		System.out.println(sb + " = reverse String = " + sb.reverse());
		System.out.println(sb.deleteCharAt(4));
		System.out.println(sb.delete(0, 1));
		System.out.println(sb.replace(1, 3, "G"));
		System.out.println(sb.indexOf("G"));

	}

}
