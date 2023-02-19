package file_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Properties;

public class PropertyFileHandler {

	public static void main(String[] args) {
		// write data into properties file
		FileOutputStream outStream=null;
		try{
		File file= new File("C:\\swati work\\Javaproject1\\src\\file_Handling\\myfile.properties");
		 outStream = new FileOutputStream(file);
		Properties prop =new Properties();
		prop.setProperty("Environmrnt","test");
		prop.setProperty("name","sachin");
		prop.setProperty("roal","aautomation tsting");
		prop.store(outStream,"demo");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				outStream.close();
				System.out.println("Outstream is closed");
			}catch(IOException e){
				e.printStackTrace();
				
			}
		}
				
		

	}

}
