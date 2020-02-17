package co.com.nexos.kardex.front.bean;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.nexos.kardex.front.client.ProductClient;
import co.com.sofka.hulk.store.commons.dto.ProductDTO;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class ProductBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<ProductDTO> products;

	@Autowired
	private ProductClient client;

	@PostConstruct
	public void init() {
		products = (List<ProductDTO>) client.findAll().getBody();
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}

}
