package br.edu.ifgoiano.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifgoiano.entidade.Livro;

public interface LivroRepositorio extends JpaRepository<Livro, Long> {

}
