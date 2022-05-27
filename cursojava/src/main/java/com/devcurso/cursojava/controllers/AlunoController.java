package com.devcurso.cursojava.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devcurso.cursojava.entitys.Aluno;
import com.devcurso.cursojava.repositorys.AlunoRepository;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping
	public List<Aluno> findAll(){
	  List<Aluno> result  =	repository.findAll();
		  return result;
	}
	
	@GetMapping(value = "/{id}")
	public Aluno findById(@PathVariable Long id) {
		Aluno result = repository.findById(id).get();
		  return result;
	}

}
