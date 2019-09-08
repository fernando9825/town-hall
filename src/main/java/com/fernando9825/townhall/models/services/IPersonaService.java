package com.fernando9825.townhall.models.services;

import com.fernando9825.townhall.models.entity.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> findAll();

    public Persona findById(String DUI);

    public Persona save(Persona persona);

    public void delete(String DUI);
}
