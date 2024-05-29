package com.example.config;

import org.apache.cxf.Bus;
// import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import com.example.services.ArticleService;

@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    // @Bean
    // public Endpoint endpoint() {
    //     EndpointImpl endpoint = new EndpointImpl(bus, new ArticleService());
    //     endpoint.publish("/ArticleService");
    //     return endpoint;
    // }
}
