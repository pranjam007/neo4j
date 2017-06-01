package com.arqiva.neo4j_demo.configuration;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.neo4j.ogm.config.Configuration;



/**
 * Created by pranjal.mathur on 18/08/2016.
 */
@org.springframework.context.annotation.Configuration
@EnableNeo4jRepositories(basePackages = "com.arqiva.neo4j_demo.repository")
@EnableTransactionManagement
public class DemoConfiguration extends Neo4jConfiguration {


    @Override
    @Bean
    public SessionFactory getSessionFactory() {
        return new SessionFactory(getConfiguration(),"com.arqiva.neo4j_demo.entity");
    }

    @Override
    @Bean
    @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Session getSession() throws Exception {
        return super.getSession();
    }

    @Bean
    public Configuration getConfiguration() {
        Configuration config = new Configuration();
        config.driverConfiguration().setDriverClassName("org.neo4j.ogm.drivers.http.driver.HttpDriver").setURI("http://neo4j:root@localhost:7474");
        return config;
    }
}
