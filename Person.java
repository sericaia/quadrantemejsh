/*
 * Person information
 */
public class Person {
	public String 	firstName;
	public String 	lastName;
	public String	address;
	public String 	birthDate;
	//mobile and alternative mobile numbers
	public String 	altMobileNumber;//not integer due to database inconsistency
	public String 	mobileNumber;	//not integer due to database inconsistency
	public String 	email;
	
	public Person(String firstName, String lastName, String address,
			String birthDate, String mobileNumber, String altMobileNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.birthDate = birthDate;
		this.mobileNumber = mobileNumber;
		this.altMobileNumber = altMobileNumber;
		this.email = email;
	}
	
	//compare function :: lets sort by name and address (city)
	//TODO
	
	//taditional getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getAltMobileNumber() {
		return this.altMobileNumber;
	}
	//NOTES:: should be integer..
	public void setTelNumber(String altMobileNumber) {
		this.altMobileNumber = altMobileNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	//NOTES:: should be integer..
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
