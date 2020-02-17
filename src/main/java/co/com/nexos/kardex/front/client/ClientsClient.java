package co.com.nexos.kardex.front.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "client", url = "http://localhost:8080/api/v1/client/")
public interface ClientsClient {

	@GetMapping
	public ResponseEntity<?> findAll();

}
