import java.util.ArrayList;

public class Application {

	/*
	 * java -classpath . Application <input-file> <output-file>
	 * Two arguments <input-file>, <output-file>
	 */
	public static void main(String args[]) {
		
	//	String inputFileName = args[0]; //"textfile.txt";
	//	String outputFileName = args[1]; //"output.txt";
		
		//DEBUG mode
		String inputFileName = "media/mdl_user_min.csv";
		String outputFileName = "media/output.txt";
		
		
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
