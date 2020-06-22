package map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class mapescollection {

	public static void main(String[]args) throws IOException{
		
		  File directory = new File("E:\\logs\\auther\\bharat");
		  directory.mkdirs();
		  System.out.println("directed");
		  File file = new File("E:\\logs\\auther\\bharat\\study.txt");
		  file.createNewFile();
		  System.out.println("file created");
		  try(BufferedWriter dw = new BufferedWriter(new  FileWriter(file,true))){
			  dw.write("bharat");
			  dw.newLine();
			  dw.write("priya");
			  dw.newLine();
			  dw.write("dolli");
			  
		  }
		  try(BufferedReader br = new BufferedReader(new FileReader("E:\\logs\\auther\\bharat\\study.txt"))){
			String line;
			  while((line = br.readLine())!= null){
				System.out.println(line);
			}
		  }
		  catch(IOException e){
			  System.out.println("some thing is wrong");
		  }
	      
		  
	}

}
