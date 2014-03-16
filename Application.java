import java.util.ArrayList;

public class Application {

	public static void main(String args[]) {
		
		String inputFileName = "textfile.txt";//args[1];
		String outputFileName = "output.txt";//args[2];
		
		if(inputFileName == null || outputFileName == null)
			return; 
			
		try {
			//read and process data to a list
			ArrayList<Person> personList = FileReader.getInputData(inputFileName);
			
			//create writer element
			TxtFile txtf = new TxtFile(outputFileName, personList);
			
			//write to txt file
			txtf.writeToFile();		
			
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
	}
}
