import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.Collections;

public class TxtFile extends Writer {

	public TxtFile(String fileName, ArrayList<Person> personList) {
		super(fileName, personList);
	}

	@Override
	public void writeToFile() {
		BufferedWriter writer = null;

		try {
			//criate buffer
			writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(this.fileName), "utf-8"));

			//sort list of persons
			Collections.sort(this.personList, Person.Comparators.ADDRESSANDNAME);
			
			for (Iterator<Person> i = this.personList.iterator(); i.hasNext();) {
				Person person = i.next();
				writer.write(
						"Nome: " + person.getFirstName() + " " + person.getLastName() + "\r\n"
						+ "Morada: " + person.getAddress() + "\r\n"
						+ "Data de Nascimento: " + person.getBirthDate() + "\r\n"
						+ "Tlm.: " + person.getMobileNumber() + " | " + person.getAltMobileNumber() + "\r\n"
						+ "E-mail: " + person.getEmail() + "\r\n"
						+ "\r\n");
			}

		} catch (IOException ex) {
			// report
		} finally {
			try {
				writer.close();
			} catch (Exception ex) {
			}
		}

	}

}
