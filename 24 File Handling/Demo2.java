// example showing the concept of File Handling in java

import java.io.File;
import java.io.IOException;
class Demo2{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\CodingThinker\\febjava4pm\\24 File Handling\\myFolder\\myFile.txt");
        try{
            if(!file.exists()){
                file.createNewFile();
                System.out.println("File created successfully");
            }else
                System.out.println("File already exist");
        }catch(IOException e){
            System.out.println("Exception e : "+e);
        }
    }
}