package luan.mai.boot

import org.springframework.boot.SpringApplication
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		new SpringApplicationBuilder()
                .sources(Application.class)
                .bannerMode(Banner.Mode.OFF)
                .run()
	}


}