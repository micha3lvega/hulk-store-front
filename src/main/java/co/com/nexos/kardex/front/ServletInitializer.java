package co.com.nexos.kardex.front;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import co.com.nexos.kardex.front.util.Constants;

@SpringBootApplication
@ComponentScan
public class ServletInitializer extends SpringBootServletInitializer {

	@PostConstruct
	private void init() {
		TimeZone.setDefault(Constants.TIME_ZONE); // It will set UTC timezone
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(KardexApplication.class);
	}

}