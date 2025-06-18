// example showing the concept of File Handling in java
import java.io.*;
class Demo8{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\CodingThinker\\febjava4pm\\24 File Handling\\myFolder\\newFile.txt");
        try(FileOutputStream fout = new FileOutputStream(file);
        DataOutputStream dout = new DataOutputStream(fout);){ 
            dout.writeInt(123);
            dout.writeDouble(12.3233);
            dout.writeBoolean(true);
            dout.writeUTF("This is an example");
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
