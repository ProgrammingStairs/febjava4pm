// example showing the concept of File Handling in java

import java.io.File;
import java.io.IOException;
class Demo3{
    public static void main(String args[]){
        File file = new File("D:\\desktop\\CodingThinker\\febjava4pm\\24 File Handling");
            File farr[] = file.listFiles();
            for(File fobj : farr){
                if(fobj.getName().endsWith(".java"))
                     System.out.println("File name : "+fobj.getName()+" Path : "+fobj.getPath());
            }
    }
}