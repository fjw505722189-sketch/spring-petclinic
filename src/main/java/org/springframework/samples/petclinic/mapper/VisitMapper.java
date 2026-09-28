package org.springframework.samples.petclinic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.samples.petclinic.owner.PetType;
import org.springframework.samples.petclinic.owner.Visit;

import jakarta.validation.Valid;

@Mapper 
public interface VisitMapper {

	@Insert  ("INSERT INTO visits (pet_id, visit_date, description) "+ 
			"VALUES (#{petId}, #{visit.date}, #{visit.description})")
	void insert(int petId, Visit visit);

	@Delete  ("DELETE FROM visits WHERE id = #{visitId} AND pet_id = #{petId}")
	int deleteById(int visitId, int petId);

}
