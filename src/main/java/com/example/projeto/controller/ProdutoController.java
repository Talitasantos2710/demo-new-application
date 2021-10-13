package com.example.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto.models.Produto;
import com.example.projeto.repository.ProdutoRepository;

@RestController
@RequestMapping(value = "/api/produtos")
public class ProdutoController {

	@Autowired
	public ProdutoRepository produtorepository;

	@GetMapping
	public Iterable<Produto> getProdutos() {
		return produtorepository.findAll();

	}

	@PostMapping
	public Produto salvaProduto(@RequestBody Produto produto) {
		return produtorepository.save(produto);

	}

	@DeleteMapping
	public void deletaProduto(@RequestBody Produto produto) {
		produtorepository.delete(produto);

	}

	@PutMapping
	public Produto atualizaProduto(@RequestBody Produto produto) {
		return produtorepository.save(produto);
	}

}