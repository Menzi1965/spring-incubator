package entelect.training.incubator.spring.notification.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "entelect.training.incubator.spring.notification")
@Import({ MessagingConfiguration.class })
public class AppConfig
{

    // Put Other Application configuration here.
}
