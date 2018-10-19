package pl.jdev.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAutoConfiguration
@EnableConfigurationProperties(ServiceProperties.class)
@ComponentScan
@ImportResource("integration-context.xml")
public class OpesIntegration {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(OpesIntegration.class, args);
	}

}
