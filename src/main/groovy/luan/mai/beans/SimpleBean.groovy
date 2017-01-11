package luan.mai.beans

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
class SimpleBean {

    static def echo(message) {
        message
    }
}
