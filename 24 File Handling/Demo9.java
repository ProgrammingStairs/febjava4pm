// example showing the concept of File Handling in java
import java.io.*;
class Demo9{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\CodingThinker\\febjava4pm\\24 File Handling\\myFolder\\newFile.txt");
        try(FileInputStream fin = new FileInputStream(file);
        DataInputStream din = new DataInputStream(fin);){ 
            System.out.println(din.readInt());
            System.out.println(din.readDouble());
            System.out.println(din.readBoolean());
            System.out.println(din.readUTF());
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
