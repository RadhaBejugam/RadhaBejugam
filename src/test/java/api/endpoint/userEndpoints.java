package api.endpoint;

import static io.restassured.RestAssured.*;

import api.payload.User;
import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

// Userendpoint.java is created to do CRUD operations
//Creat, Read,Update, and delete on User API
public class userEndpoints {

	public static Response createUser(User payload){
		
		Response response=given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(payload)
			
			.when()
				.post(Routes.post_url);
		
		return response;
		
	}
	
public static Response readUser(String string){
		
		Response response=given()
			              .pathParam("userFirstname", string)
			
			.when()
				.get(Routes.get_url_ID);
		
		return response;
		
	}

public static Response updateUser(int UserID,User payload){
	
	Response response=given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.pathParam("userID", UserID)
		.body(payload)
		
		.when()
			.put(Routes.put_url);
	
	return response;
	
}
	
   public static Response delete(String string){
	
	Response response=given()
		              .pathParam("UserFirstName", string)
		
		.when()
			.delete(Routes.delete_url);
	
	return response;
	
}

}
