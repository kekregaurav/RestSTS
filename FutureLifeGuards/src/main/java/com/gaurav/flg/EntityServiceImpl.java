package com.gaurav.flg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.gaurav.flg.model.Person;

@Service
public class EntityServiceImpl implements EntityService{

	Map <Long, Person> prsnList = new HashMap<Long,Person>();//
	long currPrsnId = 0;
	
	public  EntityServiceImpl () {
		init();
	}
	
	private void init() {
		
		Person p = new Person();
		currPrsnId = 10;
		p.setpID(currPrsnId);
		p.setfName("Vihaan");
		p.setlName("Kekre");
		prsnList.put(currPrsnId,p);
	}

	@Override
	public List<Person> getAllPersons() {
		
		Collection <Person> p = this.prsnList.values();
		List <Person> pL = new ArrayList<Person>(p); 
		
		return pL;
	}

	@Override
	public Person getPerson(long id) {
         
    	 if(this.prsnList.get(id) != null )
    		 return (Person)this.prsnList.get(id);
         
    	 return null;
	}

	@Override
	public Response addPerson(Person pPrsn) {

        pPrsn.setpID(++this.currPrsnId);
        this.prsnList.put(pPrsn.getpID(), pPrsn);
        
		return Response.ok(pPrsn).build();
	}

	
	@Override
	public Response updtPerson(Person pPrsn) {
		
		if(this.prsnList.get(pPrsn.getpID()) != null)
		    this.prsnList.put(pPrsn.getpID(), pPrsn);
		
		return Response.ok((Person)this.prsnList.get(pPrsn.getpID())).build();
	}

	@Override
	public Response delPerson(long id) {
		
		Response resp;
		if(this.prsnList.get(id) != null) {
		    this.prsnList.remove(id);
		    resp =  Response.ok("The person deleted successfully").build();
		}else {
			resp = Response.notModified().build();
		}
		
		return resp;
	}

	
	
	
	
}
