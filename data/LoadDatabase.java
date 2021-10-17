package com.example.data;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(DataRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Data(776677L, 12345677,"sherlock holmes",
            "Gramedia Pustaka Utama", 2011, 20000 )));
            log.info("Preloading" + repository.save(new Data(776677, 12345677,"sherlock holmes",
            "Gramedia Pustaka Utama", 2011, 20000 )));
            log.info("Preloading" + repository.save(new Data(776677, 12345677,"sherlock holmes",
            "Gramedia Pustaka Utama", 2011, 20000 )));
        };
    }
}
