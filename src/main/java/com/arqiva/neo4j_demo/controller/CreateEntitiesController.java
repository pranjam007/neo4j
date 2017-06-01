package com.arqiva.neo4j_demo.controller;

import com.arqiva.neo4j_demo.entity.*;
import com.arqiva.neo4j_demo.repository.EstateRepository;
import com.arqiva.neo4j_demo.repository.PowerCompanyRepository;
import com.arqiva.neo4j_demo.repository.SiteRepository;
import com.arqiva.neo4j_demo.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by pranjal.mathur on 19/08/2016.
 */
@Controller
public class CreateEntitiesController {

    @Autowired
    private SiteRepository siteRepository;
    @Autowired
    private PowerCompanyRepository powerCompanyRepository;
    @Autowired
    private EstateRepository estateRepository;
    @Autowired
    private TenantRepository tenantRepository;

    @RequestMapping(path = "createSite")
    public String createSiteEntity(Model model, @RequestParam String name) {
        Site site = createSite(name);
        siteRepository.save(site,-1);
        model.addAttribute("site",site);
        model.addAttribute("test","testinginginginginginginginging");
        return "createsite";
    }

    @RequestMapping(path="createPowerCompany")
    public String createPowerCompany(Model model,@RequestParam String sitename) {
        PowerCompany powerCompany = new PowerCompany();
        powerCompany.setPowerSupplyAgreement(getPowerSupplyAgreement(sitename,powerCompany));
        powerCompanyRepository.save(powerCompany,-1);
        model.addAttribute("site",powerCompany);
        return "createsite";
    }

    @RequestMapping(path="createEstate")
    public String createEstate(Model model,@RequestParam String estateName,@RequestParam String sitename) {
        Estate estate = new Estate();
        estate.setArea(new BigDecimal("67.90"));
        estate.setLeaseExpiry(new Date());
        estate.setDilapidationCost(new BigDecimal("100099892.89"));
        estate.setSite(siteRepository.getSiteByName(sitename));
        estateRepository.save(estate);
        return "createsite";
    }

    @RequestMapping(path="createTenant")
    public String createTenant(Model model,@RequestParam String sitename) {
        Tenant tenant = new Tenant();
        tenant.setName("Johny Depp");
        tenant.setTenancy(getTenancy(siteRepository.getSiteByName(sitename),tenant));
        tenantRepository.save(tenant,-1);
        return "createsite";
    }

    private Tenancy getTenancy(Site site,Tenant tenant) {
        Tenancy tenancy = new Tenancy();
        tenancy.setStartDate(new Date());
        tenancy.setSite(site);
        tenancy.setTenant(tenant);
        return tenancy;
    }

    private PowerSupplyAgreement getPowerSupplyAgreement(String sitename,PowerCompany powerCompany) {
        PowerSupplyAgreement powerSupplyAgreement = new PowerSupplyAgreement();
        powerSupplyAgreement.setAgreementDate(new Date());
        powerSupplyAgreement.setAgreementType(AgreementType.UNDER_THE_TABLE);
        powerSupplyAgreement.setLandUse(LandUse.SATELLITE);
        powerSupplyAgreement.setUnitPrice(new BigDecimal("9.89"));
        powerSupplyAgreement.setVoltage("230v");
        powerSupplyAgreement.setSite(siteRepository.getSiteByName(sitename));
        powerSupplyAgreement.setPowerCompany(powerCompany);

        return powerSupplyAgreement;
    }

    private Site createSite(String name) {
        Site site = new Site();
        site.setDescription("sdfsdf");
        site.setHeight(2);
        site.setLandlord(getLandlord());
        if(name == null) {
            site.setName("Stamford Bridge");
        } else {
            site.setName(name);
        }
        site.setSiteType(SiteType.FOOTBALL_CLUB);
        site.setSiteoperator("Conte");
        site.setStatus(SiteStatus.ACTIVE);

        site.setAddress(getAddress());

        return site;
    }

    private Landlord getLandlord() {
        Landlord landlord = new Landlord();
        landlord.setName("Sir Lord Mathur");
        return landlord;
    }

    private Address getAddress() {
        Address address = new Address();
        address.setCounty("Hants");
        address.setHouseNumber("33");
        address.setLineOne("Hillbilly Road");
        address.setLineTwo("Ramsbottom");
        address.setLineThree("Itches");
        return address;
    }

}
