package net.cyberward.springjersey.person;

import java.util.List;

public interface PersonService {

	long createPerson(PersonDTO person);
	
	PersonDTO getPerson(long id);
	
	List<PersonDTO> getListOfPeople();
	
	void updatePerson(PersonDTO person);
	
	void deletePerson(long id);
}
