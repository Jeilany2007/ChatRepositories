package chat.ressource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import chat.model.Profile;
import chat.service.UserService;

@Path("/Profiles")
public class UserRessource {

 

		UserService UserService = new UserService();

		@GET
		@Produces(MediaType.APPLICATION_XML)
		public List<Profile> getProfiles() {
			return UserService.getAllProfiles();
		}
			
		

				
		}



