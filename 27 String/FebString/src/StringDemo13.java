// example showing the concept of String Buffer and String builder
public class StringDemo13 
{
     public static void main(String[] args) {
         String s1 = " Andrew";
//         StringBuffer sb = new StringBuffer("Hello");
         StringBuilder sb = new StringBuilder("Hello");

        sb.append(s1);
         System.out.println("append : "+sb);
         
         sb.insert(5, " Mathew");
         System.out.println("insert : "+sb);
         
         sb.replace(6, 12, "Peter");
         System.out.println("replace : "+sb);

         sb.delete(6, 12);
         System.out.println("delete : "+sb);
  
         sb.reverse();
         System.out.println("reverse :  "+sb);
         
     }
}




