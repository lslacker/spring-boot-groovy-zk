package luan.mai.boot

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component


@Component
@ConfigurationProperties
class ApplicationConfig {

    @Value('${app.message}')
    private String message
}
