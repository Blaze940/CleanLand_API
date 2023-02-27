package com.cleanLandAPI.configuration;

import com.cleanLandAPI.configuration.controllers.ControllerConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ControllerConfiguration.class})
public class ApplicationConfiguration {

}
