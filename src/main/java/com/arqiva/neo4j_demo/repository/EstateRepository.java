package com.arqiva.neo4j_demo.repository;

import com.arqiva.neo4j_demo.entity.Estate;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pranjal.mathur on 19/08/2016.
 */
@Repository
public interface EstateRepository extends GraphRepository<Estate> {
}
