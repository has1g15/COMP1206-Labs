package Question2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileConcatenation {

	public static void main (String[] args) throws IOException
	{
		//Two arguments passed into program - name of directory and name of the new file
		String dirName = args[0];
		String fileName = args[1];
		
		//Creates named directory as a folder  
		File folder = new File(dirName);
		//Array containing all the files in the specified directory 
		File [] fileList = folder.listFiles();
		BufferedWriter bufferedWriter;
		FileWriter fileWriter;
		ArrayList<File> javaFiles = new ArrayList<>();
		String[] contents = new String[fileList.length];
		int i = 0;
		
		for (File file: fileList)
		{
			if (((file.getName()).substring(file.getName().length()-5, file.getName().length()))
				.equals(".java"))
				{
					//File contents is stored in array 
					contents[i] = getFileContent(file);
					//If file has a java extension, it's added to the array list of java files 
					javaFiles.add(file);
					//File is deleted from directory after added to the array list 
					file.delete();
					i++;
				}
		}
		i = 0;
		//Creates new folder with the arguments as a path 
		new File(dirName + fileName).mkdir();
		for (File file: javaFiles)
		{
			//Creates the files in the new directory 
			file = new File(dirName+fileName+"/"+file.getName());
			fileWriter = new FileWriter(file);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(contents[i]);
			bufferedWriter.close();
			i++;
		}
	}
	
	//Method getting the entire contents of the file passed in 
	private static String getFileContent(File file) throws IOException
	{
		FileReader fileReader = new FileReader(file);
		StringBuilder stringBuilder = new StringBuilder();
		char[] buffer = new char[4096];
        int read = 0;
        do 
        {
            stringBuilder.append(buffer, 0, read);
            read = fileReader.read(buffer);
        } while (read >= 0);
        return stringBuilder.toString();
	}
}
