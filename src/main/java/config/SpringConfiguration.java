package config;

import controllers.TestController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactory;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
import services.TestService;

@Configuration
@EnableWebMvc
public class SpringConfiguration implements WebMvcConfigurer {

    @Bean
    public FreeMarkerViewResolver getFreeResolver(){
        FreeMarkerViewResolver freeMarkerViewResolver = new FreeMarkerViewResolver();
        freeMarkerViewResolver.setOrder(1);
        return freeMarkerViewResolver;
    }

    @Bean
    public FreeMarkerConfigurationFactory getFreeMarkerConfigurationFactory(){
        FreeMarkerConfigurationFactory freeMarkerConfigurationFactory = new FreeMarkerConfigurationFactory();
        freeMarkerConfigurationFactory.setTemplateLoaderPath("/");
        return freeMarkerConfigurationFactory;
    }

    @Bean
    public TestController getTestController(){
        return new TestController();
    }

    @Bean
    public TestService getTestService(){
        return new TestService();
    }


}
