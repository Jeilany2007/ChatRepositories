package chat.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;

import java.io.PrintWriter;

import chat.model.Profile;
import chat.ressource.UserRessource;


public class UserService {
	public List<Profile> getAllProfiles(){
		 Profile user1=new Profile(1,"user1","jeilany","medbouye");
		 Profile user2=new Profile(1,"user2","hanan","hadrami");
		 List<Profile> Users=new ArrayList();
		 Users.add(user1);
		 Users.add(user2);
		 return Users;
	
	
	}
	
		public List<String> getAllUsers(){
		
			//cette methode est pour recuperer seulement les profilename des utlilisateur c ceux qu'ont va utilise
		//pour l'ehange des msgs
			
		Profile user3=new Profile(1,"user3","jeilany","medbouye");
		Profile user4=new Profile(1,"user4","jeilany","medbouye");
		
		//j esseyer de creer map ma c ne pas marche 
		//private static Map<Integer, String>  users = new HashMap<>();
		//map.put(user3.getId(),user4.getProfileName());
		 
		 List <String> Users=new ArrayList();
		 Users.add(user3.getProfileName());
		 Users.add(user4.getProfileName());
		  return Users;
		 
		 
		 
		
		
		
		
		

	}
}
