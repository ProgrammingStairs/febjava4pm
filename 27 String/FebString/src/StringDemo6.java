import java.util.Scanner;
public class StringDemo6 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        char temp;
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length/2;i++){
            temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
        }
        System.out.println("Reverse string : ");
        for(char c : ch){
            System.out.print(c);
        }
    }
}
