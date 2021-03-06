package com.vidhyac.zipcode.resource;

import java.util.List;
import java.util.Map;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vidhyac.zipcode.dao.InfoDAO;
import com.vidhyac.zipcode.model.Info;

@Path("zipcode")
public class ZipCode {
	
	InfoDAO dao=new InfoDAO();
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String showInfo(@FormParam("zipcode") long zipcode){
		
		 for (Map.Entry<Long,Info> entry : dao.getInfo().entrySet())  {
			 
			 if (zipcode==entry.getKey()) {
				  Info info=entry.getValue();
				  return "Value is "+info;
			}  
	            
		 }//for loop ends here
	          
	 return "Enter Valid zipcode";
	}
	
}
