package com.fernando9825.townhall.models.dao;

import com.fernando9825.townhall.models.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, String> {
}
