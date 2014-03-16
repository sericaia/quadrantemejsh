import java.util.ArrayList;


public abstract class Writer {

	String fileName;
	ArrayList<Person> personList;
	
	public Writer(String fileName, ArrayList<Person> personList) {
		this.fileName = fileName;
		this.personList = personList;
	}
	
	public abstract void writeToFile();

}
