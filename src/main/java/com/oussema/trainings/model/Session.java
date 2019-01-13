package com.oussema.trainings.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name="session_name")
    private String name;

    @Column(name="duration")
    private int duration;

    @Column(name="date_from")
    private LocalDate dateFrom;
//    private Certification prepareCertification;

    public Session(){}

    public Session(String name, int duration, LocalDate dateFrom) {
        this.name = name;
        this.duration = duration;
        this.dateFrom = dateFrom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

//    public Certification getPrepareCertification() {
//        return prepareCertification;
//    }
//
//    public void setPrepareCertification(Certification prepareCertification) {
//        this.prepareCertification = prepareCertification;
//    }

    public long getId() {
        return id;
    }
}

