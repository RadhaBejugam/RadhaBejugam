package api.payload;

public class User {
	
	String user_last_name;
	String user_contact_number;
	String user_email_id;
	String plotNumber;
	String Street;
	String state;
	String Country;
	String zipCode;
	int addressId;
	String creation_time;
	String last_mod_time;
	int User_ID;
	
	
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCreation_time() {
		return creation_time;
	}
	public void setCreation_time(String creation_time) {
		this.creation_time = creation_time;
	}
	public String getLast_mod_time() {
		return last_mod_time;
	}
	public void setLast_mod_time(String last_mod_time) {
		this.last_mod_time = last_mod_time;
	}


public int getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
	}
	
	
	String user_first_name;
	public String getUser_first_name() {
		return user_first_name;
	}
	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}
	public String getUser_last_name() {
		return user_last_name;
	}
	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}
	public String getUser_contact_number() {
		return user_contact_number;
	}
	public void setUser_contact_number(String user_contact_number) {
		this.user_contact_number = user_contact_number;
	}
	public String getUser_email_id() {
		return user_email_id;
	}
	public void setUser_email_id(String user_email_id) {
		this.user_email_id = user_email_id;
	}
	public String getPlotNumber() {
		return plotNumber;
	}
	public void setPlotNumber(String plotNumber) {
		this.plotNumber = plotNumber;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
	
	

}
