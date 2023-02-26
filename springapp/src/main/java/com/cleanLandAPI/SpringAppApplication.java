package com.cleanLandAPI;

import com.cleanLandAPI.configuration.ApplicationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ConditionalOnWebApplication
@Import({ApplicationConfiguration.class})
@EntityScan("com.cleanLandAPI.postgres.entity")
@EnableJpaRepositories
@SpringBootApplication(scanBasePackages = {"com.cleanLandAPI", "com.cleanLandAPI.configuration"})
public class SpringAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAppApplication.class, args);
    }

}