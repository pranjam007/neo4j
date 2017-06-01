package com.arqiva.neo4j_demo.repository;

import com.arqiva.neo4j_demo.entity.Site;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pranjal.mathur on 19/08/2016.
 */
@Repository
public interface SiteRepository extends GraphRepository<Site>{

    @Query("MATCH (site) WHERE site.name={0} RETURN site")
    Site getSiteByName(String siteName);



}
