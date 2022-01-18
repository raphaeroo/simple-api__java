package simpleapi.java.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import simpleapi.java.models.Client;
import simpleapi.java.repositories.ClientRepository;

@RestController
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private ClientRepository clientRepository;

	@GetMapping
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Client createClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}
}
