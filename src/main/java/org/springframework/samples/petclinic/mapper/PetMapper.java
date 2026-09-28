package org.springframework.samples.petclinic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.samples.petclinic.owner.PetType;

import jakarta.validation.Valid;

@Mapper 
public interface PetMapper {


	@Insert ("INSERT INTO pets (name, birth_date, type_id, owner_id) "+ 
			"VALUES (#{pet.name}, #{pet.birthDate}, #{pet.type.id}, #{ownerId})")
	void insert(Integer ownerId, Pet pet);

	
	void update(Integer ownerId, Pet pet);

}
