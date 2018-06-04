package com.gaurav.flg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaurav.flg.model.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

}
