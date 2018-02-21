package Question3;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CheckAndDisplay {

	File selectedFile;
	FileReader fileReader;
	BufferedReader bufferedReader;
	
	public CheckAndDisplay(File selectedFile)
	{
		this.selectedFile = selectedFile;
	}
	
	//If file has a text file extension, true is returned 
	public boolean checkFileType(File selectedFile)
	{
		if ((selectedFile.getName().substring(selectedFile.getName().length()-4, 
				selectedFile.getName().length())).equals(".txt"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Displays content of text files in scroll pane 
	public void displayFileContents(File file) throws IOException
	{
		JFrame frame = new JFrame("Contents of File");
		frame.setSize(600, 600);
		JTextArea textArea = new JTextArea();
		fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
		String line = " ";
		while((line = bufferedReader.readLine()) != null)
		{
			textArea.append(line);
			textArea.append("\n");
		}
		JScrollPane scroll = new JScrollPane (textArea, 
				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	
		frame.add(scroll);
		frame.setVisible(true);
	}
}
