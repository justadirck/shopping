package boot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix="app")
public class AppProperties {
    
    private String[] cors;
    
    private String stripe;

}
