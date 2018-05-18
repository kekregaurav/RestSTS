package com.gaurav.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.gaurav.model.Person;

@Path("/entityservice")
public interface EntityService {
     
	@Path("/allpersons")
	@GET
	List<Person> getAllPersons();
	
	@Path("/allpersons/{id}")
	@GET
	Person getPerson(@PathParam(value = "id") int id);
}
