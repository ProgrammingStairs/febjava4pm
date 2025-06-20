// example showing the concept of File Handling in java
import java.io.*;
class Demo12{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\CodingThinker\\febjava4pm\\24 File Handling\\myFolder\\newFile.txt");
        try(FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);){
            bw.write("statement 1");
            bw.newLine();
            bw.write("statement 2");
            bw.newLine();
            bw.write("statement 3");
              System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }    
        try(FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr)){
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
