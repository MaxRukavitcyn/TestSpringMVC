package config;

import controllers.TestController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.TestService;

@Configuration
public class WebConfiguration {

    @Bean
    public TestController getTestController(){
        return new TestController();
    }

    @Bean
    public TestService getTestService(){
        return new TestService();
    }


}
