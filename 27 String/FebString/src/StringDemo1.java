public class StringDemo1 
{
    public static void main(String[] args) {
        char ch[] = {'a','b','c'};
        for(char c : ch)
            System.out.print(c);
        
        // creating sstring object by new keyword
        String s2 = new String(ch);
        System.out.println("\ns2 : "+s2);
        
        // creating string object by string literal 
        String s3 = "Andrew Anderson";
        System.out.println("s3 : "+s3);
        
        byte bt[]={65,66,67,68,69};
        String s4 = new String(bt);
        System.out.println("s4 : "+s4);
    }
}
