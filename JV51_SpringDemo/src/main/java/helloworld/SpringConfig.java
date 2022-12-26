package helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "helloworld")
public class SpringConfig {
    @Bean
    public AccountRepository accountRepository() {
        return new AccountRepositoryImpl();
    }
}
