package api.endpoint;

//Base URI: https://userserviceapi-a54ceee3346a.herokuapp.com/uap
//Create User(POST): https://userserviceapi-a54ceee3346a.herokuapp.com/uap/createusers	
//Get All Users: //userserviceapi-a54ceee3346a.herokuapp.com/uap/users
//Get User By User ID: //userserviceapi-a54ceee3346a.herokuapp.com/uap/user/{userId}
//Get User By UserName: //userserviceapi-a54ceee3346a.herokuapp.com/uap/users/username/{userFirstName}
//Update User By user ID (PUT): //userserviceapi-a54ceee3346a.herokuapp.com/uapupdateuser/{userId}
//Delete User By FName: //userserviceapi-a54ceee3346a.herokuapp.com/uap/deleteuser/username/{userfirstname}
//Delete User By UserID:  //userserviceapi-a54ceee3346a.herokuapp.com/uap/deleteuser/{userId}



public class Routes {

	public static String base_url = "https://userserviceapi-a54ceee3346a.herokuapp.com/uap";
	
	//User Module
	
	public static String post_url = base_url+"/uap/createusers";
	public static String get_url_ID = base_url+"/uap/user/{userId}";
	public static String put_url = base_url+"/uapupdateuser/{userId}";
	public static String delete_url = base_url+"/uap/deleteuser/username/{userfirstname}";
	
}
