package br.com.cotiinformatica.domain.interfaces;

import java.util.List;
import java.util.UUID;

import br.com.cotiinformatica.domain.entities.Produto;
import br.com.cotiinformatica.dtos.ProdutoPostDto;
import br.com.cotiinformatica.dtos.ProdutoPutDto;

public interface ProdutoService {
	void create(ProdutoPostDto dto) throws Exception;

	void update(ProdutoPutDto protudo) throws Exception;

	void delete(UUID Id) throws Exception;
	
	List<Produto> findAll() throws Exception;
	Produto findById(UUID id) throws Exception;
}
