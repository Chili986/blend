package com.juegotrivia.webormth.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juegotrivia.webormth.model.usuarios;

@Repository
public interface loginJpaRepository extends CrudRepository<usuarios, Integer>{
	public Optional<usuarios> findByUsername(String username);

}
