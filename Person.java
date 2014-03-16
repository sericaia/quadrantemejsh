/*
 * Person information
 */
public class Person {
	public String 	firstName;
	public String 	lastName;
	public String	address;
	public String 	birthDate;
	public String 	telNumber;		//not integer due to database inconsistency
	public String 	mobileNumber;	//not integer due to database inconsistency
	public String 	email;
	
	public Person(String firstName, String lastName, String address,
			String birthDate, String telNumber, String mobileNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.birthDate = birthDate;
		this.telNumber = telNumber;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
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
	public String getTelNumber() {
		return telNumber;
	}
	//NOTES:: should be integer..
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
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
