package com.oussema.trainings.controller;

import com.oussema.trainings.model.Session;
import com.oussema.trainings.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SessionController {

    @Autowired
    private SessionRepository sessionRepository;


    @GetMapping("/all")
    public List<Session> getAll(){
        return sessionRepository.findAll();
    }

    @GetMapping("/sessions/{id}")
    public Session getCity(@PathVariable long id){
        return sessionRepository.getById(id);
    }

    @PostMapping("/sessions")
    public Session create(@RequestBody Session city){
        return sessionRepository.save(city);
    }

    @PutMapping("/sessions/{id}")
    public Session update(@PathVariable long id,@RequestBody Session data)
    {
        Session session = sessionRepository.getById(id);
        session.setName(data.getName());
        return sessionRepository.save(session);
    }

    @DeleteMapping("/sessions/{id}")
    public void delete(@PathVariable long id){
        sessionRepository.delete(sessionRepository.getById(id));
    }

}