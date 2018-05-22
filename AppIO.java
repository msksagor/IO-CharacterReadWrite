package appio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppIO {
    public static void main(String[] args) {
        String directoryString = "D:\\Target\\Tutorial\\Java complate\\1.core java\\problem.txt";
           try {
               BufferedReader br = new BufferedReader(new FileReader(directoryString));
               String currentLine;
               while ((currentLine = br.readLine())!=null) {                   
                   System.out.println(currentLine);
               }
               br.close();
               
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
