import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class LatexFile extends Writer{

	public LatexFile(String fileName, ArrayList<Person> personList) {
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
			
			writer.write(					
					"\\documentclass{article}\r\n"
					+"\\usepackage[utf8]{inputenc}\r\n"
					+ "\\begin{document}\r\n"
					+ "\\centerline{\\sc \\large Quadrante Shalom}\r\n"
					+ "\\vspace{.5pc}\r\n"
					+ "\\centerline{\\sc Diocese de Lisboa e Setúbal}\r\n"	
					+ "\\vspace{2pc}\r\n"
					);
			
			for (Iterator<Person> i = this.personList.iterator(); i.hasNext();) {
				Person person = i.next();
				
				writer.write(
						"\\textbf{Nome:} {\\it " +  person.getFirstName() + " " + person.getLastName() + "} \\\\ \r\n"
						+ "Morada: " + person.getAddress() + "\\\\ \r\n"
						+ "Data de Nascimento: " + person.getBirthDate() + "\\\\ \r\n"
						+ "Tlm.: " + person.getMobileNumber() + " | " + person.getAltMobileNumber() + "\\\\ \r\n"
						+ "E-mail: " + person.getEmail().replace("_", "\\_") + "\\\\ \r\n"
						+ "\\vspace{1pc}\r\n"
						+ "\r\n");
			}
			
			
			writer.write(
					"\\vspace{1pc}\r\n"
					+ "\\centerline{v1.0 :)}\r\n"
					+ "\\vspace{0.5pc}\r\n"
					+ "\\end{document}\r\n"
					);

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
