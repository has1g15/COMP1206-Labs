package Question3;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FileSelectorGUI {

	public static void main(String[] args) throws IOException 
	{
	   //Creates GUI	
	   JFileChooser fileChooser = new JFileChooser();
	   int returnValue = fileChooser.showOpenDialog(null);
	        
	   if (returnValue == JFileChooser.APPROVE_OPTION) 
	   {
	       File selectedFile = fileChooser.getSelectedFile();
	       CheckAndDisplay c = new CheckAndDisplay(selectedFile);
	       
	       //If file passed into the class is validated, contents is displayed 
	       if (c.checkFileType(selectedFile))
	       {
	    	   c.displayFileContents(selectedFile);
	       }
	   }
	}
}
