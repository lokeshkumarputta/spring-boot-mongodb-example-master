package com.elife.configuration;

import com.elife.documents.Users;
import com.elife.repository.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {


    /*@Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
    	System.out.println("in commandline runner");
    	
        return strings -> {
            userRepository.save(new Users("lokesh", "password", "password" ,"kumar", "putta", "K R Puram, Bangalore", "Salarpuria, Marathalli, Bangalore"));
            userRepository.save(new Users("santhosh", "password", "password" ,"kumar", "putta", "Tirucharnoor, AndhraPradesh", "Tirupati, AndhraPradesh"));
            
        };
    }*/

}
