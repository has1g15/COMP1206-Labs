package Question1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class ByteBased {

	public static void main (String[] args) throws IOException
	{
		//New text file created
		File file = new File("G:/Random Integers Byte.txt");
		FileOutputStream fos = new FileOutputStream(file);
		String [] numbers = new String[10000];
		byte [] fileContent;
		
		if(!file.exists())
		{
			file.createNewFile();
		}
		
		//10000 random numbers written to file using byte-based stream
		Random rnd = new Random();
		for (int i = 0; i < 10000; i++)
		{
			numbers[i] = String.valueOf(rnd.nextInt(100000));
			fileContent = numbers[i].getBytes();
			fos.write(fileContent);
			fos.write(System.getProperty("line.separator").getBytes());
		}
		
		fos.flush();
		fos.close();
	}
}
