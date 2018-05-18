package com.gaurav.flg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gaurav.model.Person;
import com.gaurav.services.EntityService;

@Service
public class EntityServiceImpl implements EntityService{

	List <Person> prsnList = new ArrayList<Person>();//
	
	public  EntityServiceImpl () {
		init();
	}
	
	private void init() {
		
		Person p = new Person();
		p.setpID(10);
		p.setfName("Vihaan");
		p.setlName("Kekre");
		
		prsnList.add(p);
	}

	@Override
	public List<Person> getAllPersons() {
		
		return prsnList;
	}

	@Override
	public Person getPerson(int id) {

         for(Person p : this.prsnList) {
        	 if(p.getpID() == id)
        		 return p;
         }
         
         return null;
	}
	
	
	
}
