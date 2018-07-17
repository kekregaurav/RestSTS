package com.gaurav.flg;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.flg.model.Person;
import com.gaurav.flg.repo.PersonRepo;


public class EntityServiceImpl implements EntityService{

	/*Map <Long, Person> prsnList = new HashMap<Long,Person>();//
	long currPrsnId = 0;*/
	
	@Autowired
	PersonRepo repository;
	
	/*public  EntityServiceImpl () {
		//init();
	}*/
	
	/*private void init() {
		
		Person p = new Person();
		currPrsnId = 10;
		p.setpID(currPrsnId);
		p.setfName("Vihaan");
		p.setlName("Kekre");
		prsnList.put(currPrsnId,p);
	}*/

	@Override
	public List<Person> getAllPersons() {
		
		/*Collection <Person> p = this.prsnList.values();
		List <Person> pL = new ArrayList<Person>(p);*/ 
		
		return repository.findAll();
	}

	@Override
	public Person getPerson(long id) {
         
    	/* if(this.prsnList.get(id) != null )
    		 return (Person)this.prsnList.get(id);*/
		return repository.findById(id).get();
	}

	@Override
	public Response addPerson(Person pPrsn) {

        /*pPrsn.setpID(++this.currPrsnId);
        this.prsnList.put(pPrsn.getpID(), pPrsn);*/
		Person p = repository.save(pPrsn);
        
		return Response.ok(p).build();
	}

	
	@Override
	public Response updtPerson(Person pPrsn) {
		
		/*if(this.prsnList.get(pPrsn.getpID()) != null)
		    this.prsnList.put(pPrsn.getpID(), pPrsn);
		
		return Response.ok((Person)this.prsnList.get(pPrsn.getpID())).build();*/
		
		Person p = repository.save(pPrsn);
        
		return Response.ok(p).build();
	}

	@Override
	public Response delPerson(long id) {
		
		/*Response resp;
		if(this.prsnList.get(id) != null) {
		    this.prsnList.remove(id);
		    resp =  Response.ok("The person deleted successfully").build();
		}else {
			resp = Response.notModified().build();
		}*/
		
		if(repository.findById(id).get() != null) {
			repository.delete(repository.findById(id).get());
			return Response.ok("The person deleted successfully").build();
		}else {
			return Response.notModified().build();
		}
	
	}

	
	
	
	
}
