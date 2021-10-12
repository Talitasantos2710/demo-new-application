package com.example.projeto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.projeto.models.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto ,Long> {
	
	Produto findById (long id);

}
