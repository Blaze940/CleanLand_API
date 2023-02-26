package com.cleanLandAPI;

import com.cleanLandAPI.configuration.ApplicationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

@ConditionalOnWebApplication
@Import({ApplicationConfiguration.class})
@SpringBootApplication(scanBasePackages = {"com.cleanLandAPI"}, exclude = {DataSourceAutoConfiguration.class })
public class SpringAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAppApplication.class, args);
    }

}