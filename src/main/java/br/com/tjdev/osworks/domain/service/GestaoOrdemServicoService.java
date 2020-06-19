package br.com.tjdev.osworks.domain.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tjdev.osworks.domain.exception.NegocioException;
import br.com.tjdev.osworks.domain.model.Cliente;
import br.com.tjdev.osworks.domain.model.OrdemServico;
import br.com.tjdev.osworks.domain.model.StatusOrdemServico;
import br.com.tjdev.osworks.domain.repository.ClienteRepository;
import br.com.tjdev.osworks.domain.repository.OrdemServicoRepository;

@Service
public class GestaoOrdemServicoService {
	
	@Autowired
	private OrdemServicoRepository ordemServicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public OrdemServico criar(OrdemServico ordemServico) {
		
		Cliente cliente = clienteRepository.findById(ordemServico.getCliente().getId())
				.orElseThrow(() -> new NegocioException("Cliente não encontrado"));
	
		ordemServico.setCliente(cliente);
		
		ordemServico.setStatus(StatusOrdemServico.ABERTA);
		ordemServico.setDataAbertura(LocalDateTime.now());
		
		return ordemServicoRepository.save(ordemServico);
	}
}
