package br.com.cotiinformatica.domain.interfaces;

import java.util.List;
import java.util.UUID;

import br.com.cotiinformatica.domain.entities.Produto;

public interface ProdutoService {
	void create(Produto produto) throws Exception;

	void update(Produto protudo) throws Exception;

	void delete(UUID Id) throws Exception;
	
	List<Produto> findAll() throws Exception;
	Produto findById(UUID id) throws Exception;
}
