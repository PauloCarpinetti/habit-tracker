package paulocarpinetti.com.github.habit_tracker.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Habit Tracker")
                        .version("V1")
                        .description("RESTful api's to control Habits")
                        .termsOfService("https://github.com/paulocarpinetti")
                        .license(new License()
                                .name("MIT")
                                .url("https://github.com/paulocarpinetti"))
                );
    }
}
