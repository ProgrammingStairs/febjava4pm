// example showing the concept of File Handling in java
import java.io.*;
class Demo11{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\CodingThinker\\febjava4pm\\24 File Handling\\myFolder\\newFile.txt");
        try(FileWriter fw = new FileWriter(file)){
            fw.write("statement 1\n");
             fw.write("statement 2\n");
              fw.write("statement 3\n");
              System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }    
        try(FileReader fr = new FileReader(file)){
            while(true){
                int i = fr.read();
                if(i==-1)
                    break;
                System.out.print((char)i);
            }
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }    
    }
}
