// example showing the concept of StringJoiner

import java.util.StringJoiner;
public class StringDemo10 
{
    public static void main(String[] args) {
        /*
        StringJoiner sj = new StringJoiner("-");
        sj.add("11");
        sj.add("07");
        sj.add("2025");
        System.out.println("Date : "+sj);
        */
        String str = String.join("-", "11","07","2025");
        System.out.println("Date : "+str);
    }
}




