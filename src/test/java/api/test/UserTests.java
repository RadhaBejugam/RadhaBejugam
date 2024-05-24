package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoint.userEndpoints;
import api.payload.User;
import io.restassured.response.Response;

public class UserTests {
	
	
	Faker faker;
	User userPayload;
	
	
	@BeforeClass
	public void setupdata()
	{
		
		faker=new Faker();
		userPayload=new User();
		
		//userPayload.setUser_ID(faker.idNumber().hashCode());
		userPayload.setUser_first_name(faker.name().firstName());
		userPayload.setUser_last_name(faker.name().lastName());
		userPayload.setUser_contact_number(faker.phoneNumber().cellPhone());
		userPayload.setUser_email_id(faker.internet().emailAddress());
		userPayload.setPlotNumber(faker.address().buildingNumber());
		userPayload.setStreet(faker.address().streetName());
		userPayload.setStreet(faker.address().state());
		userPayload.setStreet(faker.address().country());
		userPayload.setStreet(faker.address().zipCode());
			
	}
	
	@Test(priority=1)
	public void testpostUser()
	{
		Response response=userEndpoints.createUser(userPayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);
		
	
}
	
	public void testGetUserByName()
	{
		Response response=userEndpoints.readUser(this.userPayload.getUser_first_name());
		response.then().log().all();
		response.statusCode();
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	
	@Test(priority=3)
	public void UpdateUserbyID() {
		
		//update data using payload
		
		userPayload.setUser_first_name(faker.name().firstName());
		userPayload.setUser_last_name(faker.name().lastName());

		Response response=userEndpoints.updateUser(this.userPayload.getUser_ID(),userPayload);
		response.then().log().all();
		response.statusCode();
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
		//Checking data after update
		Response responseAfterUpdate=userEndpoints.readUser(this.userPayload.getUser_first_name());
		//response.then().log().all();
		response.statusCode();
		Assert.assertEquals(responseAfterUpdate.getStatusCode(), 200);
		
		
		}
	
	@Test(priority=4)
	public void DeleteUserFname() {
		
		Response response=userEndpoints.delete(this.userPayload.getUser_first_name());
		response.statusCode();
		Assert.assertEquals(response.getStatusCode(), 200);
		
		
	}
	
	
	
	
	
}
