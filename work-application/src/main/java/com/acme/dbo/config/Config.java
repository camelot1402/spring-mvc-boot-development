package com.acme.dbo.config;

import com.acme.dbo.dao.ClientRepository;
import com.acme.dbo.dao.ClientRepositoryImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.acme.dbo")
@PropertySource("classpath:application.properties")
public class Config {
    @Bean
    public ClientRepository clients() {
        return new ClientRepositoryImpl();
    }
}
