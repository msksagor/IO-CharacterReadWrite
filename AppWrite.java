
package appio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppWrite {
    
    public static void main(String[] args) throws IOException{
        String content1 = "Welcome to Sagor";
    String content2 = "This is JhelKhana";
    String directoryString = "D:\\Target\\Tutorial\\Java complate\\1.core java\\problem.txt";
    
    File file = new File(directoryString);

    FileWriter fileWriter = new FileWriter(file,true);
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    bufferedWriter.write(content1);
    bufferedWriter.newLine();
    bufferedWriter.write(content2);
    bufferedWriter.close();
        System.out.println("Done");
    

    }

        
    
    
}
