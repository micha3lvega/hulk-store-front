package co.com.nexos.kardex.front.bean;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.nexos.kardex.front.client.ClientsClient;
import co.com.sofka.hulk.store.commons.dto.ClientDTO;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class ClientManagerBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<ClientDTO> clients;

	@Autowired
	private ClientsClient client;

	@PostConstruct
	public void init() {
		clients = (List<ClientDTO>) client.findAll().getBody();
	}

	public List<ClientDTO> getClients() {
		return clients;
	}

	public void setClients(List<ClientDTO> clients) {
		this.clients = clients;
	}

}
