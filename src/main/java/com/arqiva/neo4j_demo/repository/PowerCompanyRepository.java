package com.arqiva.neo4j_demo.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import com.arqiva.neo4j_demo.entity.PowerCompany;

/**
 * Created by pranjal.mathur on 19/08/2016.
 */
public interface PowerCompanyRepository extends GraphRepository<PowerCompany> {
}
