package VehbiKaranfil;

public class StringTopics {
	
	public static void main(String[] args) {
	
    /////////////////////////	/////////////////////////	/////////////////////////	/////////////////////////		
		String name = "Vehbi Karanfil";
		String upperName = name.toUpperCase();
		System.out.println(upperName);
	/////////////////////////	/////////////////////////	/////////////////////////	/////////////////////////	
		String text = "Computer Science is fun!";
		text = text.replace("Computer Science" , "CS");
		System.out.println(text);
   /////////////////////////	/////////////////////////	/////////////////////////	/////////////////////////	
        String s = "Welcome";
        s.concat(" home");
        System.out.println(s);
        String ss= s.concat(" home");
        System.out.println(ss);
   /////////////////////////	/////////////////////////	/////////////////////////	/////////////////////////	
        String a = "Vehbi";
        String b = " Karanfil";
        String c = a.concat(b);
        System.out.println(c);
        String d= "Vehbi" + " Karanfil";
        System.out.println(d);
   /////////////////////////	/////////////////////////	/////////////////////////	/////////////////////////	
	    String e = "hello";
	    System.out.println(e.substring(0, 2));
	    System.out.println(e.substring(3));
	    System.out.println(e.substring(5));
	    System.out.println(e.substring(4));
   /////////////////////////	/////////////////////////	/////////////////////////	/////////////////////////	    
	    String text1 = "\tThis text is one tab in.\r\n";
	    System.out.println(text1);
	    String x= "example";
        System.out.println(x);
	    
	
	
	
	}
}
