package com.arqiva.neo4j_demo.entity;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by pranjal.mathur on 19/08/2016.
 */
@RelationshipEntity(type = "POWER_AGREEMENT")
public class PowerSupplyAgreement {

    @GraphId
    private Long relationshipId;
    @EndNode
    private Site site;
    @StartNode
    private PowerCompany powerCompany;
    private BigDecimal unitPrice;
    private LandUse landUse;
    private String voltage;
    private AgreementType agreementType;
    private Date agreementDate;

    public Long getRelationshipId() {
        return relationshipId;
    }

    public void setRelationshipId(Long relationshipId) {
        this.relationshipId = relationshipId;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public PowerCompany getPowerCompany() {
        return powerCompany;
    }

    public void setPowerCompany(PowerCompany powerCompany) {
        this.powerCompany = powerCompany;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LandUse getLandUse() {
        return landUse;
    }

    public void setLandUse(LandUse landUse) {
        this.landUse = landUse;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public AgreementType getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(AgreementType agreementType) {
        this.agreementType = agreementType;
    }

    public Date getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(Date agreementDate) {
        this.agreementDate = agreementDate;
    }
}
