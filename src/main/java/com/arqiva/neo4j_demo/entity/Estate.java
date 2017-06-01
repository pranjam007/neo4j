package com.arqiva.neo4j_demo.entity;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by pranjal.mathur on 19/08/2016.
 */
@NodeEntity
public class Estate {

    @GraphId
    private Long estateId;
    @Relationship(type = "BELONGS_TO")
    private Site site;
    private BigDecimal dilapidationCost;
    private BigDecimal area;
    private Date leaseExpiry;

    public Long getEstateId() {
        return estateId;
    }

    public void setEstateId(Long estateId) {
        this.estateId = estateId;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public BigDecimal getDilapidationCost() {
        return dilapidationCost;
    }

    public void setDilapidationCost(BigDecimal dilapidationCost) {
        this.dilapidationCost = dilapidationCost;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public Date getLeaseExpiry() {
        return leaseExpiry;
    }

    public void setLeaseExpiry(Date leaseExpiry) {
        this.leaseExpiry = leaseExpiry;
    }
}
