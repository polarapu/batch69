package sprite.fanta.domain.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class DomainConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
