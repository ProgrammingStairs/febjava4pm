// example showing the concept of File Handling in java
import java.util.Scanner;
import java.io.*;
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String content = sc.nextLine();
        File file = new File("D:\\desktop\\CodingThinker\\febjava4pm\\24 File Handling\\myFolder\\newFile.txt");
        // try(FileOutputStream fout = new FileOutputStream(file)){ 
        try(FileOutputStream fout = new FileOutputStream(file,true)){ 
            byte bt[] = content.getBytes();
            fout.write(bt);
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
