package br.jrfy.wsminhasvacinas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
/**
 * 
 * 
 * @author jeferson.inacio
 *
 */
@Configuration
@ComponentScan(basePackages = {"br.jrfy.wsminhasvacinas.service"})
public class SpringConfig {
	 @Bean
	 public ResourceBundleMessageSource messageSource() {
		 ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		 source.setBasename("Messages");
		 source.setDefaultEncoding("UTF-8");
		 return source;
	 }
}
