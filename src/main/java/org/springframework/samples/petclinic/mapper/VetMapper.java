package org.springframework.samples.petclinic.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Mapper
public interface VetMapper {

	@Transactional(readOnly = true)
	List<Integer> getAllPage();

	@Transactional(readOnly = true)
	List<Vet> getByIds(@Param("vetIds") List<Integer> vetIds);

	@Transactional(readOnly = true)
	@Cacheable("vets")
	Collection<Vet> getAllList();

}
