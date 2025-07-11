// example showing the methods of string
public class StringDemo11 
{
     public static void main(String[] args) {
           String s1 = "Andrew Anderson";
           System.out.println("Length : "+s1.length());
           
           System.out.println("Uppercase : "+s1.toUpperCase());
           System.out.println("Lowercase : "+s1.toLowerCase());
           
           System.out.println("charAt(3) :  "+s1.charAt(3));
           System.out.println("equals :  "+s1.equals("ANDREW ANDERSON"));
           System.out.println("equalsIgnoreCase :  "+s1.equalsIgnoreCase("aNdREw AnDErSOn"));
           
           String s2 = "                        Hello                              ";
           System.out.println("s2 : "+s2);
           System.out.println("trim : "+s2.trim());
           
           String s3 = "Hello user";
           System.out.println("endsWith : "+s3.endsWith("USER"));
           System.out.println("endsWith : "+s3.endsWith("user"));
           System.out.println("startsWith : "+s3.startsWith("H"));
           System.out.println("startsWith : "+s3.startsWith("hello"));
           
           
    }
}




