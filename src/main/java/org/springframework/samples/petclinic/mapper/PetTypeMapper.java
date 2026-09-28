package org.springframework.samples.petclinic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.samples.petclinic.owner.PetType;

@Mapper 
public interface PetTypeMapper {

	@Select ("SELECT id, name FROM types ORDER BY name")
	List<PetType> getPetTypes();

}
