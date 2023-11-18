package br.com.cotiinformatica.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.cotiinformatica.domain.interfaces.ProdutoService;
import br.com.cotiinformatica.dtos.ProdutoPostDto;
import br.com.cotiinformatica.dtos.SuccessResponseDto;
import jakarta.validation.Valid;
@RestController
@RequestMapping(value = "/api/produtos")
public class ProdutosController {
	
	@Autowired
	ProdutoService produtoService;
	@PostMapping
	public ResponseEntity<SuccessResponseDto> post(@RequestBody @Valid ProdutoPostDto dto) throws Exception {
		
		//enviando o DTO para a camada de domínio
		produtoService.create(dto);
		
		//criando a resposta de sucesso
		SuccessResponseDto response = new SuccessResponseDto();
		response.setStatus(HttpStatus.CREATED);
		response.setMessage("Produto cadastrado com sucesso.");
		
		//devolvendo a resposta
		return ResponseEntity.status(201).body(response);
	}
	@PutMapping
	public void put() {
		// TODO implementar a edição do produto
	}
	@DeleteMapping
	public void delete() {
		// TODO implementar a exclusão do produto
	}
	@GetMapping
	public void getAll() {
		// TODO implementar a consulta de produtos
	}
}


