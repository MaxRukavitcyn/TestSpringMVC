import config.WebConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.TestService;

public class ApplicationInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfiguration.class);
        System.out.println(context.getBean(TestService.class).getString());

    }
}
