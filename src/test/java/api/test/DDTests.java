package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoint.userEndpoints;
import api.payload.User;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class DDTests {

	@Test(priority=1, dataProvider="Data",dataProviderClass=DataProviders.class)
	
	public void testPostUser(String Fname, String Lname,String contact, String emailId, String plotNo,String street, 
			String state,String country, String zipcode)
	
		
			{
		
		User userPayload =new User();
		
		userPayload.setUser_first_name(Fname);
		userPayload.setUser_last_name(Lname);
		userPayload.setUser_contact_number(contact);
		userPayload.setUser_email_id(emailId);
		userPayload.setPlotNumber(plotNo);
		userPayload.setStreet(street);
		userPayload.setState(state);
		userPayload.setCountry(country);
		userPayload.setZipCode(zipcode);
		
		Response response=userEndpoints.createUser(userPayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);
		
	}
	
	@Test(priority=2, dataProvider="UserFirstname",dataProviderClass=DataProviders.class)
	public void testDeleteUserFname(String Fname )
	{
		
		
		Response response=userEndpoints.delete(Fname);
		response.statusCode();
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
		
		
		
		
	}
	
	
}
