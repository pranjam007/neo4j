package com.arqiva.neo4j_demo.entity;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Date;

/**
 * Created by pranjal.mathur on 19/08/2016.
 */
@NodeEntity
public class Owner {

    @GraphId
    private Long ownerId;
    private String name;
    private Date ownedSince;
    @Relationship(type = "LIVES_AT")
    private Address address;
    @Relationship(type = "OWNS")
    private Site site;

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getOwnedSince() {
        return ownedSince;
    }

    public void setOwnedSince(Date ownedSince) {
        this.ownedSince = ownedSince;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }
}
