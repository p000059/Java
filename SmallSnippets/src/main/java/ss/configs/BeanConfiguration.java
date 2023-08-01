package ss.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ss.models.subclass.entity.BeanTest;

@Configuration
public class BeanConfiguration {

    @Bean
    BeanTest showClassBean() {
		
		return new BeanTest();
	}
}
