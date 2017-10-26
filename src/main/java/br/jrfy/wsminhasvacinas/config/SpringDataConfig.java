package br.jrfy.wsminhasvacinas.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
/**
 * 
 * 
 * @author jeferson.inacio
 *
 */
@Configuration
public class SpringDataConfig {
	@Configuration
	@EnableJpaRepositories(basePackages = {"br.jrfy.wsminhasvacinas.repositories" },
	 transactionManagerRef="postgresTransactionManager" , entityManagerFactoryRef = "entityManagerFactoryPostgres")
	public static class DummyToConfigSpringDataPostgres{
		
	}
}