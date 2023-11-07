 

import java.io.*;   
public class FileNotFoundException   
{  
    public static void main(String[] args)   
    {  
        
         FileReader fileReader = new FileReader("Test.txt");  
         
         BufferedReader bufferReader = new BufferedReader(fileReader);  
          
         String fileData = null;  
         
         while ((fileData = bufferReader.readLine()) != null)   
         {  
             System.out.println(fileData);  
         }  
         
         try {  
            bufferReader.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  