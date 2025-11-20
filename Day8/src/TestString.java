import java.util.stream.Stream;

public class TestString {
	public static void main(String[] args) {
	String s1="Test";
	String s2="Test";
	String s3=s2;
	String s4=new String("Test");
	System.out.println(" s2 == s3 "+(s2==s3));  
	System.out.println(" s2 == s4 "+(s2==s4));   
	System.out.println(" s2 .equals(s4) "+(s2.equals(s4))); 
	s1="welcome";
	System.out.println(" s2 == s1 "+(s2==s1));
	StringBuffer sbf=new StringBuffer("Hello");
	System.out.println(sbf.append(" Everyone"));
	StringBuilder sbd=new StringBuilder("test");
	System.out.println(sbd.append(" data")); 
	String s6="xxx,yyy,zzz-rrrr";
	String[] arr=s6.split(",");
	String str1=String.join(":",arr);
	System.out.println(str1);
	
	
	
	
	
	String str="rain in SPAIN in plain";
	System.out.println("matches:"+str1.matches(".*a.*n.*"));
	String s11="Happy Life";
	System.out.println("matches with :"+s11.matches(".*fe$"));

	boolean r = str.isBlank();
	System.out.println(r);
	str1 = "";
	r = str1.isBlank();
	System.out.println(r);
	 str1 = "testing \n is a \r technical \n portal"; 
	 
    Stream<String> lines = str1.lines();
    //lines.forEach(ln->System.out.println(ln));
    lines.forEach(System.out::println);
    String str11="      hello     ";
    
    System.out.println("using strip "+str1.strip());
    System.out.println("using stripleading "+str1.stripLeading());
    System.out.println("using stripTrailing "+str1.stripTrailing());
	}
}
