package Question1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

//File created using char based stream 
public class CharBased {

	public static void main (String[] args) throws IOException
	{
		File file = new File("G:/Random Integers Char.txt");
		
		if(!file.exists())
		{
			file.createNewFile();
		}
		
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		Random rnd = new Random();
		for (int i = 0; i < 10000; i++)
		{
			bufferedWriter.write(String.valueOf((rnd.nextInt(100000))));
			bufferedWriter.newLine();
		}
		bufferedWriter.close();
	}
}
