package br.com.tjdev.osworks.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tjdev.osworks.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	List<Cliente> findAll();
	List<Cliente> findByNome(String nome);
	List<Cliente> findByTelefoneContaining(String nome);
	Cliente findByEmail(String email);
}
