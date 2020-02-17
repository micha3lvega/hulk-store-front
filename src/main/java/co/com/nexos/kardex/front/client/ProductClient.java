package co.com.nexos.kardex.front.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "products", url = "http://localhost:8080/api/v1/products/")
public interface ProductClient {

	@GetMapping
	public ResponseEntity<?> findAll();
	
}
