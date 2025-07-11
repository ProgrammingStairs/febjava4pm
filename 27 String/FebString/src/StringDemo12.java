// example showing the methods of string
public class StringDemo12 
{
     public static void main(String[] args) {
         String s1 = "Hello user how are you ? ";
         System.out.println(""+s1.replace('e', 'E'));
         System.out.println(""+s1.replaceFirst(" ", "-"));
         
         String s2 = "andrew";
         String s3 = "andrew";
         String s4 = "ANDREW";
         String s5 = s4.toLowerCase();
         System.out.println("s3 : "+s3);
         System.out.println("s5 : "+s5);
         System.out.println(""+(s3==s5));
         System.out.println(""+(s3==s5.intern()));

         s2.concat(" anderson");
         System.out.println("s2 : "+s2);
         System.out.println(""+s2.concat(" anderson"));
     }
}




