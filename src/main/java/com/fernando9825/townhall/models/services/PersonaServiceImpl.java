package com.fernando9825.townhall.models.services;

import com.fernando9825.townhall.models.dao.PersonaDao;
import com.fernando9825.townhall.models.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private PersonaDao personaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> findAll() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Persona findById(String DUI) {
        return personaDao.findById(DUI).orElse(null);
    }

    @Override
    @Transactional
    public Persona save(Persona persona) {
        return personaDao.save(persona);
    }

    @Override
    @Transactional
    public void delete(String DUI) {
        personaDao.deleteById(DUI);
    }
}
