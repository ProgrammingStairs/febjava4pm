import java.util.Scanner;
public class StringDemo8 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        String strnew;
        String words[] = str.split(" ");
        for(int i=0;i<words.length;i++){
            strnew = words[i];
            char ch[] = strnew.toCharArray();
            char c;
            for(int j=0;j<ch.length/2;j++){
                c = ch[j];
                ch[j] = ch[ch.length-1-j];
                ch[ch.length-1-j] = c;
            }
            String reverseWord = new String(ch);
            words[i] = reverseWord;
        }
        System.out.println("Reverse string : ");
        for(int i=0;i<words.length;i++){
            System.out.print(words[i]+" ");
        }
    }
}




