
package org.springframework.samples.petclinic.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.samples.petclinic.owner.Owner;

import jakarta.validation.Valid;

@Mapper 
public interface OwnerMapper  {


	List<Owner> getByLastName(String lastName);



	Optional<Owner> getById(Integer id);

	
	void insert(Owner owner);


	void update(Owner owner);

}
