package com.arqiva.neo4j_demo.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pranjal.mathur on 19/08/2016.
 */
@Repository
public interface Owner extends GraphRepository<Owner> {
}
