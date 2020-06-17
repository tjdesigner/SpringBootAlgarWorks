package br.com.tjdev.osworks.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tjdev.osworks.domain.model.Cliente;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> Listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Tiago");
		cliente1.setEmail("tiago@gmail.com");
		cliente1.setTelefone("61 99196-5842");
		
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Poliana");
		cliente2.setEmail("poliana@gmail.com");
		cliente2.setTelefone("61 99196-1111");
		
		var cliente3 = new Cliente();
		cliente3.setId(3L);
		cliente3.setNome("Poliana");
		cliente3.setEmail("poliana@gmail.com");
		cliente3.setTelefone("61 99196-1111");
		
		return Arrays.asList(cliente1, cliente2, cliente3);
	}

}
