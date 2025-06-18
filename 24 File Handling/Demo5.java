// example showing the concept of File Handling in java
import java.io.*;
class Demo5{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\CodingThinker\\febjava4pm\\24 File Handling\\myFolder\\newFile.txt");
        try(FileInputStream fin = new FileInputStream(file)){ 
            while(true){
                int x = fin.read();
                if(x==-1)
                    break;
                System.out.print((char)x);
            }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }
}
