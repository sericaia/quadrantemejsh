import java.util.Comparator;

/*
 * Person information
 */
public class Person implements Comparable<Person> {
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
	@Override
	public int compareTo(Person p) {
		return Comparators.ADDRESS.compare(this, p);
	}
	
	//class that compares person information
	public static class Comparators {

        public static Comparator<Person> NAME = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.firstName);
            }
        };
        public static Comparator<Person> ADDRESS = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.address.compareTo(o2.address);
            }
        };
        //address priority
        public static Comparator<Person> ADDRESSANDNAME = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int i = o1.address.compareTo(o2.address);
                if (i == 0) {
                    i = o1.firstName.compareTo(o2.firstName);
                }
                return i;
            }
        };
    }
	
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
