package co.com.nexos.kardex.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KardexApplication {

	public static void main(String[] args) {
		SpringApplication.run(KardexApplication.class, args);
	}

}
