package com.devcurso.cursojava.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcurso.cursojava.entitys.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
