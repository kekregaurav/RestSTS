package com.gaurav.flg;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.gaurav.flg.model.Person;
@Service
@Consumes("application/xml,application/json")
@Produces("application/xml,application/json")
@Path("/entityservice")
public interface EntityService {
     
	@Path("/allpersons")
	@GET
	List<Person> getAllPersons();
	
	@Path("/allpersons/{id}")
	@GET
	Person getPerson(@PathParam(value = "id") long id);
	
	@Path("/allpersons")
	@POST
	Response addPerson(Person pPrsn);
	
	@Path("/allpersons")
	@PUT
	Response updtPerson(Person pPrsn);
	
	@Path("/allpersons/{id}")
	@DELETE
	Response delPerson(@PathParam(value = "id") long id);
	
}
