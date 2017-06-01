package com.arqiva.neo4j_demo.entity;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.Date;

/**
 * Created by pranjal.mathur on 19/08/2016.
 */
@RelationshipEntity(type = "HAS_A")
public class Tenancy {

    @GraphId
    private Long tenancyId;
    @StartNode
    private Tenant tenant;
    @EndNode
    private Site site;
    private Date startDate;

    public Long getTenancyId() {
        return tenancyId;
    }

    public void setTenancyId(Long tenancyId) {
        this.tenancyId = tenancyId;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
