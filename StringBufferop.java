public class StringBufferop {
public static void main(String[] args)
{
StringBuffer sb = new StringBuffer("Java Programming");
System.out.println("(i)The capacity of string buffer object is"+sb.capacity());
String str=sb.reverse().toString();
System.out.println("(ii)Reversed string buffer object is"+str.toUpperCase());
System.out.println("(iii)String after append "+sb.append(" Language"));
}
}

output

mlm@mlm-H81:~/anandu$ javac StringBufferop.java
mlm@mlm-H81:~/anandu$ java StringBufferop


(i)The capacity of string buffer object is32
(ii)Reversed string buffer object isGNIMMARGORP AVAJ
(iii)String after append gnimmargorP avaJ Language
mlm@mlm-H81:~/anandu$ 
