package web_app.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import web_app.dao.Person;

@Configuration
    public class AppConfig {

        // <bean id="" class=""></bean>
        @Bean
        public Person getPersonBean(){

            return new Person();
        }

    }

