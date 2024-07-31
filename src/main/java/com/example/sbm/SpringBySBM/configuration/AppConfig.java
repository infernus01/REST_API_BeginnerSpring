package com.example.sbm.SpringBySBM.configuration;

import com.example.sbm.SpringBySBM.DB;
import com.example.sbm.SpringBySBM.DevDB;
import com.example.sbm.SpringBySBM.ProdDB;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    @ConditionalOnProperty(name="project.mode",havingValue="development")
    public DB getDevDBBean(){
        return new DevDB();
    }

    @Bean
    @ConditionalOnProperty(name="project.mode",havingValue="production")
    public DB getProdDBBean(){
        return new ProdDB();
    }

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
