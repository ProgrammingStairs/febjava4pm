import java.util.Scanner;
public class StringDemo7 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        String strnew;
        String words[] = str.split(" ");
        for(int i=0;i<words.length/2;i++){
            strnew = words[i];
            words[i]=words[words.length-1-i];
            words[words.length-1-i]=strnew;
        }
        System.out.println("Reverse string : ");
        for(int i=0;i<words.length;i++){
            System.out.print(words[i]+" ");
        }
    }
}
