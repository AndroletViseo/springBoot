package com.example.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class TotoDao {

    @PersistenceContext
    EntityManager em;


}
