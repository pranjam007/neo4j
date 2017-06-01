package com.arqiva.neo4j_demo.entity;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by pranjal.mathur on 19/08/2016.
 */
@NodeEntity
public class PowerCompany {

    @GraphId
    private Long powerCompanyId;
    @Relationship(type = "HAS_A")
    private PowerSupplyAgreement powerSupplyAgreement;

    public Long getPowerCompanyId() {
        return powerCompanyId;
    }

    public void setPowerCompanyId(Long powerCompanyId) {
        this.powerCompanyId = powerCompanyId;
    }

    public PowerSupplyAgreement getPowerSupplyAgreement() {
        return powerSupplyAgreement;
    }

    public void setPowerSupplyAgreement(PowerSupplyAgreement powerSupplyAgreement) {
        this.powerSupplyAgreement = powerSupplyAgreement;
    }
}
