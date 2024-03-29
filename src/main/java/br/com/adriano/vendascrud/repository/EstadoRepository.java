package br.com.adriano.vendascrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.adriano.vendascrud.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}