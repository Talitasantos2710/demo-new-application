package com.example.projeto.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto.models.Produto;
import com.example.projeto.repository.ProdutoRepository;

@RestController
@RequestMapping(value = "/api")
public class ProdutoController {

	@Autowired
	public ProdutoRepository produtorepository;
	
	@GetMapping
	public Iterable<Produto> getProdutos(){
	   return	produtorepository.findAll();
	}
	
}
