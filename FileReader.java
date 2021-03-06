import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * delimiter used: pipe "|"
 */
class FileReader {

	// auxiliar function
	public static ArrayList<String> parseLine(String line) {
		ArrayList<String> list = new ArrayList<String>();
		String[] list_str = line.split("\\|"); // pipe as a delimiter
		for (String s : list_str) {
			list.add(s);
		}
		return list;
	}

	// read file function
	// TODO:: receive arguments and process them...
	public static ArrayList<Person> getInputData(String inputFileName)
			throws IOException {

		String strPerson;
		ArrayList<Person> personList = new ArrayList<Person>();

		// Open the file that is the first
		FileInputStream fstream = new FileInputStream(inputFileName);
		// Get the object of DataInputStream
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		// Read File Line By Line >>>> TODO:: change number of lines
		while ((strPerson = br.readLine()) != null) {
			ArrayList<String> lineResult = parseLine(strPerson);
			
			if(Integer.parseInt(lineResult.get(4)) == 1) //person was deleted, continue please!
				continue;
			
			//row declaration
			String  firstName;
			String 	lastName;
			String	address;
			String 	birthDate;
			String 	altMobileNumber;		
			String 	mobileNumber;
			String 	email;
			
			//DEBUG:: row population
/*			if((firstName = lineResult.get(0)) == null) firstName = "";
			if((lastName = lineResult.get(1)) == null) lastName = "";
			if((address = lineResult.get(2)) == null) address = "";
			if((birthDate = lineResult.get(3)) == null) birthDate = "";
			if((telNumber = lineResult.get(4)) == null) telNumber = "";// ,Integer.parseInt(lineResult.get(4))
			if((mobileNumber = lineResult.get(5)) == null) mobileNumber = "";// ,Integer.parseInt(lineResult.get(5))
			if((email = lineResult.get(6)) == null) email = "";
*/
			//REAL row population
			//TODO:: create file with column name mappings
			if((firstName = lineResult.get(10)) == null) firstName = "";
			if((lastName = lineResult.get(11)) == null) lastName = "";
			if((address = lineResult.get(24)) == null) address = ""; 		//col 23=address, col24=city
		//TODO::	if((birthDate = lineResult.get(3)) == null) 
			birthDate = "";
			if((mobileNumber = lineResult.get(19)) == null) mobileNumber = "";
			if((altMobileNumber = lineResult.get(20)) == null) altMobileNumber = "";
			if((email = lineResult.get(12)) == null) email = "";

			
			personList.add(new Person(firstName,lastName,address,
					birthDate,mobileNumber,altMobileNumber,email));

		}
		// Close the input stream
		in.close();

		return personList;
	}
}