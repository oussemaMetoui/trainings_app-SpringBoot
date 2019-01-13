package com.oussema.trainings.repository;

import com.oussema.trainings.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session,Long> {
    Session getById(long id);
}
