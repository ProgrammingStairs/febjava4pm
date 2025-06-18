// example showing the concept of File Handling in java
import java.util.Scanner;
import java.io.*;
class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String content = sc.nextLine();
        File file1 = new File("D:\\desktop\\CodingThinker\\febjava4pm\\24 File Handling\\myFolder\\newFile1.txt");
        
        File file2 = new File("D:\\desktop\\CodingThinker\\febjava4pm\\24 File Handling\\myFolder\\newFile2.txt");
        
        try(FileOutputStream fout1 = new FileOutputStream(file1);
        FileOutputStream fout2 = new FileOutputStream(file2);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();){ 
            byte bt[] = content.getBytes();
            bout.write(bt);
            bout.writeTo(fout1);
            bout.writeTo(fout2);
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
