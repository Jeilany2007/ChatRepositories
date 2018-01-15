package chat.ressource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import chat.service.UserService;
import chat.model.Profile;

@Path("/users")
public class UserPN {
	
	
UserService UserService =new UserService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
 public List<String>  getAllUsers(){
			return UserService.getAllUsers();
		

	}
	}
