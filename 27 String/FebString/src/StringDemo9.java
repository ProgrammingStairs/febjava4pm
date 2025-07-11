// example showing the concept of string tokenizer
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringDemo9 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        /*
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreElements()) {
            System.out.println(st.nextToken()); 
        }
        */
        
        String words[] = str.split(" ");
        for(String s : words){
            System.out.println(s);
        }
    }
}




